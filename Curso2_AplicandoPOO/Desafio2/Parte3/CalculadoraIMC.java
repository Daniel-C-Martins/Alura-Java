package Curso2_AplicandoPOO.Desafio2.Parte3;

public class CalculadoraIMC {
  public void calcularIMC(double peso, double altura) {
    double imc = peso / (altura * altura);
    System.out.println("IMC calculado: " + imc);
    avaliarIMC(imc);
  }

  public void avaliarIMC(double imc) {
    if (imc < 18.5) {
      System.out.println("Abaixo do peso");
    } else if (imc >= 18.5 && imc < 25) {
      System.out.println("Peso normal");
    } else if (imc >= 25 && imc < 30) {
      System.out.println("Sobrepeso");
    } else {
      System.out.println("Obesidade");
    }
  }
}
