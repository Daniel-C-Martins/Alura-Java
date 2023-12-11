package Curso2_AplicandoPOO.Desafio3.Parte4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

  @Override
  public int celsiusParaFahrenheit(int temp) {
    return (int) (temp * 9 / 5) + 32;
  }

  @Override
  public int fahrenheitParaCelsius(int temp) {
    return (temp - 32) * 5 / 9;
  }

}
