package Curso2_AplicandoPOO.Calculadora;

import Curso2_AplicandoPOO.Titulo;

public class Calculadora {
  private int tempoTotal;

  public void calculaTempo(Titulo t){
    tempoTotal += t.getDuracaoEmMinutos();
  }

  public int getTempoTotal() {
    return tempoTotal;
  }

}
