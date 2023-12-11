package Curso1_CriandoSuaPrinmeiraAplicacao;

public class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo");
    System.out.println("Filme: Hora de avnetura o filme");

    int ano = 2023;
    System.out.println("Ano de lançamento:  " + ano);

    // Text block
    String sinopse = """
        Filme: Hora de aventura
        Sinopse: filme do finn e jake
        Ano de lançamento:
        """ + ano;
    System.out.println(sinopse);

    // Formatação de texto
    String nome = "Maria";
    int idade = 30;
    double valor = 55.9999;
    System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

    String nome2 = "João";
    int aulas = 4;

    String mensagem = """
        Olá, %s!
        Boas vindas ao curso de Java.
        Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
        """.formatted(nome2, aulas);
    System.out.println(mensagem);

    // Casting
    double mediaDouble = 3.1;
    int media = (int) mediaDouble;
    System.out.println(media);

    // Exercicio Casting conversão de temperatura
    int temperatura = 30;
    int temperaturaFarenheit = (int) ((temperatura * 1.8) + 32);
    System.out.println(temperaturaFarenheit);
  }

}