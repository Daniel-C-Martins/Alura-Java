package Curso2_AplicandoPOO;

public class FiltroRecomendacao {

  public void flitra(Classificavel c) {
    if (c.getClassificacao() >= 4) {
      System.out.println("Está entre os preferidos");
    } else if (c.getClassificacao() > +2) {
      System.out.println("Está muito bem classificado no momento");
    } else {
      System.out.println("Coloque na sua lista para assistir depois");
    }
  }
}
