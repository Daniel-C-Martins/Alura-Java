package Curso3_TrabalhandoComListas;

import java.util.*;

import Curso2_AplicandoPOO.Filme;
import Curso2_AplicandoPOO.Serie;
import Curso2_AplicandoPOO.Titulo;

public class AppArrayLists {
  public static void main(String[] args) {
    Filme filme1 = new Filme("Procurando Nemo", 2002, true, 0, 0, 90, "Euu");
    Filme filme2 = new Filme("Interestelar", 2014, true, 0, 0, 150, "Eu dnv");
    var filme3 = new Filme("Vingadores", 2012, false, 0, 0, 0, "Não fui eu");
    ArrayList<Filme> lista1 = new ArrayList<>();
    lista1.add(filme1);
    lista1.add(filme2);
    lista1.add(filme3);

    Serie serie1 = new Serie("Warrior Nun", 2020, true, 0, 0, 0, 2, 10, false, 0);
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

    ArrayList<String> listaNomes = new ArrayList<>();
    listaNomes.add("Daniel");
    listaNomes.add("Renan");
    listaNomes.add("Carlos");
    listaNomes.add("Fabio");
    System.out.println(listaNomes);
    Collections.sort(listaNomes); // Sort em ordem alfabetica na lista de nomes
    System.out.println(listaNomes);
    Collections.sort(listaTitulos); // Sort em ordem alfabetica nos objetos titulo
    System.out.println(listaTitulos);
    listaTitulos.sort(Comparator.comparing(Titulo -> Titulo.getAnoDeLancamento())); // Comparando usando ano de
                                                                                    // lançamento
    System.out.println(listaTitulos);

    //List
    // List<String> listaNomes = new ArrayList<>();
    List<Filme> linkedList = new LinkedList<>();
    linkedList.add(filme1);
    linkedList.add(filme2);
    linkedList.add(filme3);

  }
}
