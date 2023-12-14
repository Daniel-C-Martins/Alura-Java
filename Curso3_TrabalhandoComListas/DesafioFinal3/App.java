package Curso3_TrabalhandoComListas.DesafioFinal3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    System.out.println("Digite o valor do limite do seu cartão: ");
    int limite = key.nextInt();
    List<Compra> listaCompras = new ArrayList<>();

    int opcao = 1;
    while (opcao == 1) {
      System.out.println("Digite o nome que deseja comprar: ");
      String pNome = key.next();
      System.out.println("Digite o valor da compra: ");
      int pValor = key.nextInt();
      limite -= pValor;
      if (limite > 0) {
        Compra produto = new Compra(pValor, pNome);
        listaCompras.add(produto);
        System.out.println(String.format("VocÊ ainda tem %d de limite no cartão", limite));
        String menu = """
            Deseja continuar comprando?
            0. Sair do app
            1. Continuar comprando""";
        System.out.println(menu);
        opcao = key.nextInt();
      } else {
        System.out.println("Você não tem limite disponivel para essa compra ");
        opcao = 0;
      }

    }
    Collections.sort(listaCompras);
    System.out.println("Aqui está sua lista de compras:" + listaCompras);
    key.close();
  }
}
