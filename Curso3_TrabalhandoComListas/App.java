package Curso3_TrabalhandoComListas;

import java.util.ArrayList;

import Curso2_AplicandoPOO.Filme;
import Curso2_AplicandoPOO.FiltroRecomendacao;
import Curso2_AplicandoPOO.Serie;
import Curso2_AplicandoPOO.Titulo;
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

    // Var setta um tipo automaticamente pra varivel vom base no valor inicial

    Filme filme2 = new Filme("Interestelar", 2014, true, 0, 0, 150, "Eu dnv");
    var filme3 = new Filme("Vingadores", 2012, false, 0, 0, 0, "Não fui eu");
    ArrayList<Filme> lista1 = new ArrayList<>();
    lista1.add(filme1);
    lista1.add(filme2);
    lista1.add(filme3);
    System.out.println("Tamanho da lista: " + lista1.size());
    System.out.println("Primeiro filme da lista:  " + lista1.get(0).getNome());
    System.out.println(lista1.toString());
    var lista2 = lista1.subList(0, 1);
    System.out.println(lista2.toString());

    Serie serie1 = new Serie("Warrior Nun", 2020, true, 0, 0, 0, 2, 10, false, 0);
    serie1.setDuracaoEmMinutos(serie1.getDuracaoEmMinutos());

    ArrayList<Titulo> listaTitulos = new ArrayList<>();
    listaTitulos.add(filme1);
    listaTitulos.add(filme2);
    listaTitulos.add(filme3);
    listaTitulos.add(serie1);

    for (Titulo t : listaTitulos) {
      if (t instanceof Filme) {
        System.out.println(t.getNome() + "É um filme  ");
      } else {
        System.out.println(t.getNome() + "É uma série");
      }
    }
  }
}
