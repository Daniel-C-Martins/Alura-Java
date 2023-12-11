package Curso2_AplicandoPOO.DesafioFinal;

public class Musica extends Audio {
  private String artista;
  private String album;
  private String genero;

  public String getArtista() {
    return artista;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  @Override
  public int getClassificacao() {
    if (getTotalReproducoes() > 300) {
      return 10;
    } else if (getTotalReproducoes() > 200) {
      return 8;
    } else {
      return 5;
    }
  }
}
