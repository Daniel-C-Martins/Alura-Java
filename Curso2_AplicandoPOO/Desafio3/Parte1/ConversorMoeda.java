package Curso2_AplicandoPOO.Desafio3.Parte1;

public class ConversorMoeda implements ConversaoFinanceira{

  @Override
  public int converterDollarParaReal(int dollar) {
    return dollar * 5;
  }
  
}
