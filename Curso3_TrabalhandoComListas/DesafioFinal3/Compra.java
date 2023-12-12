package Curso3_TrabalhandoComListas.DesafioFinal3;

public class Compra implements Comparable<Compra> {
  private double valor;
  private String produto;

  public double getValor() {
    return valor;
  }

  public Compra(double valor, String produto) {
    this.valor = valor;
    this.produto = produto;
  }

  @Override
  public int compareTo(Compra outra) {
    if (this.valor < outra.getValor()) {
      return 1;
    } else if (this.valor > outra.getValor()) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override
  public String toString() {
    return "\n Compras: valor  = " + valor + ", produto  = " + produto;
  }

}
