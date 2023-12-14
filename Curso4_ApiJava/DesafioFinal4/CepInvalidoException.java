package Curso4_ApiJava.DesafioFinal4;

public class CepInvalidoException extends Throwable {
  private String message;

  public CepInvalidoException() {
    this.message = "Cep inváilido";
  }

}
