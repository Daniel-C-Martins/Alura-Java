package Curso2_AplicandoPOO.Desafio2.Parte4;

public class ContaCorrente extends ContaBancaria {
  public void cobrarTarifaMensal() {
    saldo -= 10;
    System.out.println("Tarifa mensal de: " + 10 + "Cobrada");
  }
}
