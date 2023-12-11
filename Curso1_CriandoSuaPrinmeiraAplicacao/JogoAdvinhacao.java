package Curso1_CriandoSuaPrinmeiraAplicacao;
import java.util.*;

public class JogoAdvinhacao {
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);

    int resposta = new Random().nextInt(20);

    int contadorDeTentativas = 0;
    int numdigitado = 0;
    while (numdigitado != resposta) {
      System.out.println("Tente advinhar o número, você tem 5 tentativas");
      numdigitado = key.nextInt();
      contadorDeTentativas++;

      if(contadorDeTentativas == 5){
        System.out.println("Número de tentativas limite atingido :(");
        break;
      }
    }

    System.out
        .println(String.format("O número era: %d, o total de tentaivas foi: %d ", resposta, contadorDeTentativas));

  }
}
