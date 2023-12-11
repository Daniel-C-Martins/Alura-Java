package Curso2_AplicandoPOO.Desafio2.Parte2;

public class Gato extends Animal {
  @Override
  public String emitirSom() {
    return "Miau";
  }

  public void arranharMoveis(){
    System.out.println("Arrando moveis da casa");
  }
}
