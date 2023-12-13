package Curso4_ApiJava.screenmatch.ProximaAula;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Curso4_ApiJava.screenmatch.modelos.Titulo;
import Curso4_ApiJava.screenmatch.modelos.TituloOmdb;

public class App {
  public static void main(String[] args) throws IOException, InterruptedException {
    Scanner key = new Scanner(System.in);
    System.out.println("Digite o filme que deseja procurar: ");
    String filme = key.nextLine();

    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.omdbapi.com/?t=" + filme + "&apikey=6ab4e740"))
        .build();

    HttpResponse<String> response = client
        .send(request, BodyHandlers.ofString());
    String json = response.body();
    System.out.println(json);

    // Gson gson = new Gson();
    // Titulo meuTitulo = gson.fromJson(json, Titulo.class);
    Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
    TituloOmdb meuTitulooOmdb = gson.fromJson(json, TituloOmdb.class);
    System.out.println(meuTitulooOmdb);

    Titulo meuTitulo = new Titulo(meuTitulooOmdb);
    System.out.println(meuTitulo);
  }
}
