package Curso2_AplicandoPOO;

import Curso2_AplicandoPOO.Calculadora.Calculadora;

public class App {
  public static void main(String[] args) {
    Filme filme1 = new Filme("Procurando Nemo", 2002, true, 0, 0, 90, "Euu");
    filme1.avalia(9);
    filme1.avalia(8);

    System.out.println(filme1.toString());

    Calculadora calculadora = new Calculadora();
    calculadora.calculaTempo(filme1);
    System.out.println(calculadora.getTempoTotal());

    FiltroRecomendacao filtro = new FiltroRecomendacao();
    filtro.flitra(filme1);

    
  }
}
