package Curso4_ApiJava.screenmatch.modelos;

public class AnoInvalidoException extends RuntimeException {

  private String mensagem;

  public AnoInvalidoException(String mensagem) {
    this.mensagem = mensagem;
  }

  @Override
  public String getMessage() {
    return mensagem;
  }
}
