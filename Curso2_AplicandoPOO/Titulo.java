package Curso2_AplicandoPOO;

public class Titulo {
  protected String nome;
  protected int AnoDeLancamento;
  protected boolean incluidoNoPlano;
  protected double somaDasAvaliacao;
  protected int totalDeAvaliacoes;
  protected int duracaoEmMinutos;

  public Titulo(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacao,
      int totalDeAvaliacoes, int duracaoEmMinutos) {
    this.nome = nome;
    AnoDeLancamento = anoDeLancamento;
    this.incluidoNoPlano = incluidoNoPlano;
    this.somaDasAvaliacao = somaDasAvaliacao;
    this.totalDeAvaliacoes = totalDeAvaliacoes;
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAnoDeLancamento() {
    return AnoDeLancamento;
  }

  public void setAnoDeLancamento(int anoDeLancamento) {
    AnoDeLancamento = anoDeLancamento;
  }

  public boolean isIncluidoNoPlano() {
    return incluidoNoPlano;
  }

  public void setIncluidoNoPlano(boolean incluidoNoPlano) {
    this.incluidoNoPlano = incluidoNoPlano;
  }

  public double getSomaDasAvaliacao() {
    return somaDasAvaliacao;
  }

  public void setSomaDasAvaliacao(double somaDasAvaliacao) {
    this.somaDasAvaliacao = somaDasAvaliacao;
  }

  public int getTotalDeAvaliacoes() {
    return totalDeAvaliacoes;
  }

  public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
    this.totalDeAvaliacoes = totalDeAvaliacoes;
  }

  public int getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public void setDuracaoEmMinutos(int duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public void avalia(double nota) {
    somaDasAvaliacao += nota;
    totalDeAvaliacoes++;
  }

  public double pegaMedia() {
    return somaDasAvaliacao / totalDeAvaliacoes;
  }

  @Override
  public String toString() {
    return "Titulo [nome=" + nome + ", AnoDeLancamento=" + AnoDeLancamento + ", incluidoNoPlano=" + incluidoNoPlano
        + ", somaDasAvaliacao=" + somaDasAvaliacao + ", totalDeAvaliacoes=" + totalDeAvaliacoes + ", duracaoEmMinutos="
        + duracaoEmMinutos + "]";
  }
}
