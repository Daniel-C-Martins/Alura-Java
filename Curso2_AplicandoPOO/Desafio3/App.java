package Curso2_AplicandoPOO.Desafio3;

import Curso2_AplicandoPOO.Desafio3.Parte1.ConversorMoeda;
import Curso2_AplicandoPOO.Desafio3.Parte2.CalculadoraSalaRetangular;
import Curso2_AplicandoPOO.Desafio3.Parte3.TabuadaMultiplicacao;
import Curso2_AplicandoPOO.Desafio3.Parte4.ConversorTemperatura;
import Curso2_AplicandoPOO.Desafio3.Parte4.ConversorTemperaturaPadrao;
import Curso2_AplicandoPOO.Desafio3.Parte5.Livro;
import Curso2_AplicandoPOO.Desafio3.Parte5.ProdutoFisico;
import Curso2_AplicandoPOO.Desafio3.Parte6.Produto;
import Curso2_AplicandoPOO.Desafio3.Parte6.Servico;

public class App {
  public static void main(String[] args) {
    // Exercicio Moeda
    ConversorMoeda conversor = new ConversorMoeda();
    System.out.println(conversor.converterDollarParaReal(50));
    System.out.println("-----------------------------------------");

    // Exercicio Area
    CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
    System.out.println(calculadora.calculaArea(5.0, 8.0)); // Exemplo com altura e largura
    System.out.println(calculadora.calculaPerimetro(5, 8));
    System.out.println("-----------------------------------------");

    // Exercicio Tabuada
    TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
    tabuada.mostrarTabuada(9);
    System.out.println("-----------------------------------------");

    // Exercicio Temperatura
    ConversorTemperatura conversorTemperatura = new ConversorTemperaturaPadrao();

    int temperaturaCelsius = 25;
    int temperaturaFahrenheit = conversorTemperatura.celsiusParaFahrenheit(temperaturaCelsius);
    System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

    temperaturaFahrenheit = 77;
    temperaturaCelsius = conversorTemperatura.fahrenheitParaCelsius(temperaturaFahrenheit);
    System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
    System.out.println("-----------------------------------------");

    // Exercicio Taxa
    Livro livro = new Livro();
    System.out.println(livro.calculaPrecoFinal(10));

    ProdutoFisico produtoFisico = new ProdutoFisico();
    System.out.println(produtoFisico.calculaPrecoFinal(10));
    System.out.println("-----------------------------------------");

    // Exercio Desconto
    Produto produto = new Produto();
    produto.setPrecoUnitario(39.90);
    System.out.println(produto.precoTotal(15));
    produto.aplicarDesconto(10);
    System.out.println(produto.getPrecoUnitario());

    Servico servico = new Servico();
    servico.setPrecoHora(9.90);
    System.out.println(servico.precoTotal(10));
    servico.aplicarDesconto(10);
    System.out.println(servico.getPrecoHora());


  }
}
