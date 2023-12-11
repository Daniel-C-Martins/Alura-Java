package Curso2_AplicandoPOO;

public class Filme extends Titulo implements Classificavel {
  private String diretor;

  public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacao,
      int totalDeAvaliacoes,
      int duracaoEmMinutos, String diretor) {
    super(nome, anoDeLancamento, incluidoNoPlano, somaDasAvaliacao, totalDeAvaliacoes, duracaoEmMinutos);
    this.diretor = diretor;
  }

  public String getDiretor() {
    return diretor;
  }

  public void setDiretor(String diretor) {
    this.diretor = diretor;
  }

  @Override
  public int getClassificacao() {
    return (int) pegaMedia() / 2;
  }

}
