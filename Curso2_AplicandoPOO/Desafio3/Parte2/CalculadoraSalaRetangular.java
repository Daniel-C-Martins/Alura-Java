package Curso2_AplicandoPOO.Desafio3.Parte2;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

  @Override
  public double calculaArea(double altura, double largura) {
    return (altura * largura);
  }

  @Override
  public double calculaPerimetro(double altura, double largura) {
    return 2 * (altura + largura);
  }
  
}
