package Curso2_AplicandoPOO.Desafio1;

public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public void ola() {
    System.out.println("Olá mundo");
  }
}
