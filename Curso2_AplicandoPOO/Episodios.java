package Curso2_AplicandoPOO;

public class Episodios implements Classificavel {
  private int numero;
  private Serie serie;
  private String nome;
  private int totalViews;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Serie getSerie() {
    return serie;
  }

  public void setSerie(Serie serie) {
    this.serie = serie;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public int getClassificacao() {
    if (totalViews > 100) {
      return 4;
    } else {
      return 2;
    }
  }

}
