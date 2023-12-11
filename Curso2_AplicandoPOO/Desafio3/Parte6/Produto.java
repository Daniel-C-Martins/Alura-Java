package Curso2_AplicandoPOO.Desafio3.Parte6;

public class Produto implements Vendaval {
  private double precoUnitario;

  public double getPrecoUnitario() {
    return precoUnitario;
  }

  public void setPrecoUnitario(double precoUnitario) {
    this.precoUnitario = precoUnitario;
  }

  @Override
  public double precoTotal(int quantComprada) {
    return precoUnitario * quantComprada;
  }

  @Override
  public void aplicarDesconto(double desconto) {
    precoUnitario -= precoUnitario * (desconto / 100.0);
  }

}
