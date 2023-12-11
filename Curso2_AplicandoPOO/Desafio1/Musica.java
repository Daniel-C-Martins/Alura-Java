package Curso2_AplicandoPOO.Desafio1;

public class Musica {
  private String titulo;

  private String artista;
  private int anoDeLancamento;
  private double avaliacoes;
  private int numAvaliacoes;

  public Musica(String titulo, String artista, int anoDeLancamento, double avaliacoes, int numAvaliacoes) {
    this.titulo = titulo;
    this.artista = artista;
    this.anoDeLancamento = anoDeLancamento;
    this.avaliacoes = avaliacoes;
    this.numAvaliacoes = numAvaliacoes;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getArtista() {
    return artista;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

  public int getAnoDeLancamento() {
    return anoDeLancamento;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    this.anoDeLancamento = anoDeLancamento;
  }

  public double getAvaliacoes() {
    return avaliacoes;
  }

  public void setAvaliacoes(double avaliacoes) {
    this.avaliacoes = avaliacoes;
  }

  public int getNumAvaliacoes() {
    return numAvaliacoes;
  }

  public void setNumAvaliacoes(int numAvaliacoes) {
    this.numAvaliacoes = numAvaliacoes;
  }

  public void fichaTecnica() {
    System.out.println(getTitulo());
    System.out.println(getArtista());
    System.out.println(getAnoDeLancamento());
  }

  public void avaliaMusica(double nota) {
    avaliacoes += nota;
    numAvaliacoes++;
  }

  public double mediaAvalicoes() {
    return avaliacoes / numAvaliacoes;
  }
}
