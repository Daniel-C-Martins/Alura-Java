package Curso4_ApiJava.DesafioFinal4;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
  static Scanner key = new Scanner(System.in);
  static Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting()
      .create();

  public static void main(String[] args) throws CepInvalidoException, InterruptedException {

    System.out.println("Digite o cep que deseja consultar: ");
    var cep = key.nextLine();
    try {
      Endereco novoEndereco = buscaCep(cep);
      System.out.println(novoEndereco);
      salvaJson(novoEndereco);
    } catch (RuntimeException | IOException e) {
      System.out.println("Finalizando programa");
    }
  }

  public static Endereco buscaCep(String cep) {
    String endereco = "https://viacep.com.br/ws/" + cep + "/json";

    HttpRequest request = HttpRequest.newBuilder() // Cirando um request
        .uri(URI.create(endereco))
        .build();

    try {
      HttpResponse<String> response = HttpClient
          .newHttpClient()
          .send(request, HttpResponse.BodyHandlers.ofString());
      return new Gson().fromJson(response.body(), Endereco.class);
    } catch (Exception e) {
      throw new RuntimeException("Não consegui obter o endereço a partir desse CEP.");
    }
  }

  public static void salvaJson(Endereco endereco) throws IOException {
    FileWriter escrita = new FileWriter(endereco.cep() + ".json");
    escrita.write(gson.toJson(endereco));
    escrita.close();
  }
}
