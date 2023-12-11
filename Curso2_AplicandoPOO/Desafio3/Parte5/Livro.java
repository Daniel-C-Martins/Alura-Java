package Curso2_AplicandoPOO.Desafio3.Parte5;

public class Livro implements Calculavel {

  @Override
  public double calculaPrecoFinal(double preco) {
    return preco * 0.9;
  }
}
