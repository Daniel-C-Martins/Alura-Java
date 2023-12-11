package Curso2_AplicandoPOO.Desafio1;

public class Carro {
  private String modelo;
  private int ano;
  private String cor;

  public Carro(String modelo, int ano, String cor) {
    this.modelo = modelo;
    this.ano = ano;
    this.cor = cor;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public void fichaTecnica() {
    System.out.println(modelo);
    System.out.println(ano);
    System.out.println(cor);
  }

  public int calculaIdada() {
    return 2023 - ano;
  }
}
