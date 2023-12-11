package Curso1_CriandoSuaPrinmeiraAplicacao;
import java.util.*;

public class DesafioFinal {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);

    // Variáveis da conta
    double saldo = 2500.00;
    String nome = "Daniel Campos Martins";
    int senha = 406;
    String tipoDeConta = "Conta Corrente";
    double deveEmprestimo = 0.00;

    // Variaveis de controle
    int senhaDigitada = 0;
    int contaTentativas = 0;

    do {
      System.out.println("Digite sua senha: ");
      senhaDigitada = key.nextInt();
      contaTentativas++;

      if (contaTentativas == 5) {
        System.out.println("Número de tentativas excedida");
        break;
      }
    } while (senhaDigitada != senha);

    if (senha == senhaDigitada) {
      String print = """
          --------------------------------------
          Olá %s
          Informações da conta:
          Saldo: %.2f
          Tipo de conta: %s
          Empréstimo a pagar: %.2f
          --------------------------------------
            """.formatted(nome, saldo, tipoDeConta, deveEmprestimo);
      System.out.println(print);
      String menu = """
          --------------------------------------
           Escolha o que deseja fazer:
           1. Sacar
           2. Depositar
           3. Transferir
           4. Pedir um empréstimo
           5. Sair do sistema
          --------------------------------------
           """;
      System.out.println(menu);
      int escolha = key.nextInt();
      // Variaveis para uso dentro do Switch
      int quantSaque, quantDeposito, quantTransferere, contaTrasnfere, quantEmprest = 0;
      switch (escolha) {
        case 1:
          System.out.println("Digite quanto você quer sacar: ");
          quantSaque = key.nextInt();
          saldo = saldo - quantSaque;
          System.out.println("Seu novo Saldo é: " + saldo);
          break;
        case 2:
          System.out.println("Digite quanto você quer depositar:  ");
          quantDeposito = key.nextInt();
          saldo += quantDeposito;
          System.out.println("Seu novo saldo é: " + saldo);
          break;
        case 3:
          System.out.println("Digite quanto você quer transferir: ");
          quantTransferere = key.nextInt();
          saldo = saldo - quantTransferere;
          System.out.println("Digite o numero da conta que você deseja transferir: ");
          contaTrasnfere = key.nextInt();
          System.out.println(String.format("Você transferiu %d, para:  %d", quantTransferere, contaTrasnfere));
          System.out.println("Seu novo Saldo é: " + saldo);
          break;
        case 4:
          System.out.println("Digite quanto você quer tirar de empréstimo: ");
          quantEmprest = key.nextInt();
          saldo += quantEmprest;
          deveEmprestimo += quantEmprest * 1.2;
          System.out.println(
              String.format("Você pegou %d em empréstimos, seu novo saldo é: %.2f, e você deve: %.2f", quantEmprest, saldo,
                  deveEmprestimo));
          break;
        case 5:
          System.out.println("Obrigado por usar o programa ");
          break;
        default:
          System.out.println("Valor inválido");
          break;
      }
    }

  }
}
