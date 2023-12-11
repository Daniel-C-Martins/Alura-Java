package Curso2_AplicandoPOO.DesafioFinal;

public class Podcast extends Audio {
  private String apresentador;
  private String descricao;

  public String getApresentador() {
    return apresentador;
  }

  public void setApresentador(String apresentador) {
    this.apresentador = apresentador;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public int getClassificacao() {
    if (this.getCurtida() > 50) {
      return 10;
    } else if (this.getCurtida() > 30) {
      return 8;
    } else {
      return 5;
    }
  }
}
