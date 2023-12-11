package Curso2_AplicandoPOO;

public class Serie extends Titulo {

  private int temporadas;
  private int episodiosPorTemporada;
  private boolean ativa;
  private int minutosPorTemporada;

  public Serie(String nome, int anoDeLancamento, boolean incluidoNoPlano, double somaDasAvaliacao,
      int totalDeAvaliacoes, int duracaoEmMinutos, int temporadas, int episodiosPorTemporada, boolean ativa,
      int minutosPorTemporada) {
    super(nome, anoDeLancamento, incluidoNoPlano, somaDasAvaliacao, totalDeAvaliacoes, duracaoEmMinutos);
    this.temporadas = temporadas;
    this.episodiosPorTemporada = episodiosPorTemporada;
    this.ativa = ativa;
    this.minutosPorTemporada = minutosPorTemporada;
  }

  public int getTemporadas() {
    return temporadas;
  }

  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  }

  public int getEpisodiosPorTemporada() {
    return episodiosPorTemporada;
  }

  public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
    this.episodiosPorTemporada = episodiosPorTemporada;
  }

  public boolean isAtiva() {
    return ativa;
  }

  public void setAtiva(boolean ativa) {
    this.ativa = ativa;
  }

  public int getMinutosPorTemporada() {
    return minutosPorTemporada;
  }

  public void setMinutosPorTemporada(int minutosPorTemporada) {
    this.minutosPorTemporada = minutosPorTemporada;
  }

  @Override
  public int getDuracaoEmMinutos(){
    return temporadas * episodiosPorTemporada * minutosPorTemporada;
  }

  @Override
  public String toString() {
    return "Serie [nome=" + nome + ", AnoDeLancamento=" + AnoDeLancamento + ", incluidoNoPlano=" + incluidoNoPlano
        + ", somaDasAvaliacao=" + somaDasAvaliacao + ", totalDeAvaliacoes=" + totalDeAvaliacoes + ", duracaoEmMinutos="
        + duracaoEmMinutos + ", temporadas=" + temporadas + ", episodiosPorTemporada=" + episodiosPorTemporada
        + ", ativa=" + ativa + ", minutosPorTemporada=" + minutosPorTemporada + "]";
  }

}
