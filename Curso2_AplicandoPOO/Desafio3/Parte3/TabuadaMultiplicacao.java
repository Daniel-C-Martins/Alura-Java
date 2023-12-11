package Curso2_AplicandoPOO.Desafio3.Parte3;

public class TabuadaMultiplicacao implements Tabuada {

  @Override
  public void mostrarTabuada(int num) {
    System.out.println("Esta é a tabuada do: " + num);
    for (int i = 1; i <= 10; i++) {
      System.out.println(num * i);
    }

  }
}
