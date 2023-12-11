package Curso2_AplicandoPOO.Desafio3.Parte5;

public class ProdutoFisico  implements Calculavel{

  @Override
  public double calculaPrecoFinal(double preco) {
    return preco * 1.1;
  }
}
