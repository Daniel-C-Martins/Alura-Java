package Curso2_AplicandoPOO.DesafioFinal;

public class MinhasPreferidas {
  public void inclui(Audio a) {
    if (a.getClassificacao() == 10) {
      System.out.println("Ótimo programa para os ouvidos: " + a.getTitulo());
    } else if (a.getClassificacao() >= 8) {
      System.out.println("Execelente opção para os ouvidos:  " + a.getTitulo());
    } else {
      System.out.println("Bom para os ouvidos: " + a.getTitulo());
    }
  }
}
