package Curso2_AplicandoPOO.DesafioFinal;

public class App {
  public static void main(String[] args) {
    Musica minhaMusica = new Musica();
    minhaMusica.setArtista("Tchelo");
    minhaMusica.setTitulo("Tantos Motivos");
    minhaMusica.setGenero("Trap");
    minhaMusica.setAlbum("Tantos Motivos");

    for (int i = 0; i < 100; i++) {
      minhaMusica.curtir();
    }

    for (int i = 0; i < 400; i++) {
      minhaMusica.reproduzir();
    }

    Podcast meuPodcast = new Podcast();
    meuPodcast.setApresentador("Igão");
    meuPodcast.setTitulo("Podpah");
    meuPodcast.setDescricao("Episodio com o Michael Jordan");
    for (int i = 0; i < 100; i++) {
      meuPodcast.curtir();
    }

    for (int i = 0; i < 200; i++) {
      meuPodcast.reproduzir();
    }

    MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
    minhasPreferidas.inclui(minhaMusica);
    minhasPreferidas.inclui(meuPodcast);
  }
}
