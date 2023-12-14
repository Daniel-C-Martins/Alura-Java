package Curso4_ApiJava.screenmatch.ProximaAula;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Curso4_ApiJava.screenmatch.modelos.AnoInvalidoException;
import Curso4_ApiJava.screenmatch.modelos.Titulo;
import Curso4_ApiJava.screenmatch.modelos.TituloOmdb;

public class App {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner key = new Scanner(System.in);

    String filme = " "; // Variavel que procura o filme
    List<Titulo> titulos = new ArrayList<>(); // Arraylist de filmes
    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting()
        .create();
    while (!filme.equalsIgnoreCase("SAIR")) { // loop para procurar mais de um filme

      System.out.println("Digite o filme que deseja procurar: ");
      filme = key.nextLine();

      if (filme.equalsIgnoreCase("sair")) { // Se o texto procurado for sair ja fecha o loop
        break;
      }

      String endereco = "https://www.omdbapi.com/?t=" + filme.replace(" ", "+") + "&apikey=6ab4e740"; // Fix endereço
      try {
        HttpClient client = HttpClient.newHttpClient(); // Criando client
        HttpRequest request = HttpRequest.newBuilder() // Cirando um request
            .uri(URI.create(endereco))
            .build();

        HttpResponse<String> response = client
            .send(request, BodyHandlers.ofString());
        String json = response.body();
        // Resultado da busca

        TituloOmdb meuTitulooOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTitulooOmdb);

        Titulo meuTitulo = new Titulo(meuTitulooOmdb);
        System.out.println(meuTitulo);

        titulos.add(meuTitulo);
      } catch (NumberFormatException e) {
        System.out.println("Aconteceu um erro de formato de número: ");
        System.out.println(e.getMessage());
      } catch (IllegalArgumentException e) {
        System.out.println("Houve um erro no argumento de busca");
        System.out.println(e.getMessage());
      } catch (AnoInvalidoException e) {
        System.out.println(e.getMessage());
      }
      // Finally { } finally executa independete de ter acontecido ou não a exceção
    }
    // Escrevendo arquivos
    System.out.println(titulos);
    FileWriter escrita = new FileWriter("Filmes.json");
    escrita.write(gson.toJson(titulos));
    escrita.close();

    // Lendo arquivos Json com Scanner
    try {
      File arquivo = new File("Filmes.json");
      Scanner scanner = new Scanner(arquivo);

      while (scanner.hasNextLine()) {
        String linha = scanner.nextLine();
        System.out.println(linha);
      }

      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não encontrado!");
    }

    System.out.println("------------------------------------------------");
    System.out.println("Fim do programa");
  }
}
