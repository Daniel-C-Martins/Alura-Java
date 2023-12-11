package Curso2_AplicandoPOO.Desafio3.Parte6;

public class Servico implements Vendaval {
  private double precoHora;

  public double getPrecoHora() {
    return precoHora;
  }

  public void setPrecoHora(double precoHora) {
    this.precoHora = precoHora;
  }

  @Override
  public double precoTotal(int quantComprada) {
    return precoHora * quantComprada;
  }

  @Override
  public void aplicarDesconto(double desconto) {
    precoHora -= precoHora * (desconto / 100.0);
  }

}
