package Curso2_AplicandoPOO.Desafio2.Parte2;

public class Cachorro extends Animal {

  @Override
  public String emitirSom() {
    return "Au au";
  }

  public void abanarRabo() {
    System.out.println("Abanando o rabo");
  }
}
