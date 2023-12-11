package Curso2_AplicandoPOO.Desafio2;

import Curso2_AplicandoPOO.Desafio2.Parte1.Carro;
import Curso2_AplicandoPOO.Desafio2.Parte1.ModeloCarro;
import Curso2_AplicandoPOO.Desafio2.Parte2.Cachorro;
import Curso2_AplicandoPOO.Desafio2.Parte2.Gato;
import Curso2_AplicandoPOO.Desafio2.Parte3.Pessoa;
import Curso2_AplicandoPOO.Desafio2.Parte4.ContaBancaria;
import Curso2_AplicandoPOO.Desafio2.Parte4.ContaCorrente;

public class App {
  public static void main(String[] args) {
    // Exercícios Carro
    Carro carro1 = new Carro();
    carro1.setModelo("Porsche");
    carro1.setPreçoMédioAno1(200.000);
    carro1.setPreçoMédioAno2(300.000);
    carro1.setPreçoMédioAno3(350.000);
    carro1.menorEMaiorPreco();
    System.out.println(carro1.toString());

    ModeloCarro carro2 = new ModeloCarro();
    carro2.setModelo("Audi");
    carro2.setPreçoMédioAno1(200.00);
    carro2.setPreçoMédioAno2(210.00);
    carro2.setPreçoMédioAno3(190.00);
    carro2.menorEMaiorPreco();
    System.out.println(carro2.toString());
    System.out.println("--------------------------------");

    // Exercicio Animais
    Cachorro cachorro = new Cachorro();
    System.out.println(cachorro.emitirSom());
    cachorro.abanarRabo();

    Gato gato = new Gato();
    System.out.println(gato.emitirSom());
    gato.arranharMoveis();
    System.out.println("--------------------------------");

    // Exercicio Calculadora
    Pessoa pessoa = new Pessoa();
    pessoa.exibirInfosPessoaois("João", 25);
    pessoa.calcularIMC(80, 1.80);
    System.out.println("--------------------------------");

    // Exercicio Banco
    ContaBancaria conta = new ContaBancaria();
    conta.depositar(1000);
    conta.consultarSaldo();

    ContaCorrente contaCorrente = new ContaCorrente();
    contaCorrente.depositar(200);
    contaCorrente.cobrarTarifaMensal();
    contaCorrente.consultarSaldo();
    contaCorrente.sacar(150);
    contaCorrente.consultarSaldo();
    System.out.println("--------------------------------");

  }
}
