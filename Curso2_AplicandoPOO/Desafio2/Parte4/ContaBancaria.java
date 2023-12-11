package Curso2_AplicandoPOO.Desafio2.Parte4;

public class ContaBancaria {
  protected int saldo;

  public void sacar(int saque) {
    saldo -= saque;
    System.out.println(String.format("Você sacou %d, seu saldo restante é:  %d", saque, saldo));
  }

  public void depositar(int deposito) {
    saldo += deposito;
    System.out.println(String.format("Você depositou %d, seu novo saldo é:  %d", saldo, deposito));
  }

  public void consultarSaldo() {
    System.out.println("Saldo atual é: " + saldo);
  }
}
