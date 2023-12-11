package Curso2_AplicandoPOO.Desafio2.Parte1;

public class Carro {
  protected String modelo;
  protected double preçoMédioAno1;
  protected double preçoMédioAno2;
  protected double preçoMédioAno3;

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public void setPreçoMédioAno1(double preçoMédioAno1) {
    this.preçoMédioAno1 = preçoMédioAno1;
  }

  public void setPreçoMédioAno2(double preçoMédioAno2) {
    this.preçoMédioAno2 = preçoMédioAno2;
  }

  public void setPreçoMédioAno3(double preçoMédioAno3) {
    this.preçoMédioAno3 = preçoMédioAno3;
  }

  public void menorEMaiorPreco() {
    double auxMaior = preçoMédioAno1;
    double auxMenor = preçoMédioAno2;
    if (preçoMédioAno1 > preçoMédioAno2 && preçoMédioAno1 > preçoMédioAno3) {
      auxMaior = preçoMédioAno1;
    } else if (preçoMédioAno2 > preçoMédioAno1 && preçoMédioAno2 > preçoMédioAno3) {
      auxMaior = preçoMédioAno2;
    } else if (preçoMédioAno3 > preçoMédioAno1 && preçoMédioAno3 > preçoMédioAno2) {
      auxMaior = preçoMédioAno3;
    }

    if (preçoMédioAno1 < preçoMédioAno2 && preçoMédioAno1 < preçoMédioAno3) {
      auxMenor = preçoMédioAno1;
    } else if (preçoMédioAno2 < preçoMédioAno1 && preçoMédioAno2 < preçoMédioAno3) {
      auxMenor = preçoMédioAno2;
    } else if (preçoMédioAno3 < preçoMédioAno1 && preçoMédioAno3 < preçoMédioAno2) {
      auxMenor = preçoMédioAno3;
    }

    System.out.println("Maior preço: " + auxMaior);
    System.out.println("Menor preço:  " + auxMenor);
  }

  @Override
  public String toString() {
    return "Carro [modelo=" + modelo + ", preçoMédioAno1=" + preçoMédioAno1 + ", preçoMédioAno2=" + preçoMédioAno2
        + ", preçoMédioAno3=" + preçoMédioAno3 + "]";
  }

  // Adicione uma subclasse ModeloCarro para criar instâncias específicas,
  // utilizando-a na classe principal para definir preços e mostrar informações.
}
