package es.jrodg85.realestate;

public abstract class Oferta {

  // atributos

  private long idOferta;
  private String tituloOferta;

  // getters

  public long getIdOferta() {
    return idOferta;
  }

  public String getTituloOferta() {
    return tituloOferta;
  }

  // setters

  public void setIdOferta(long idOferta) {
    this.idOferta = idOferta;
  }

  public void setTituloOferta(String tituloOferta) {
    this.tituloOferta = tituloOferta;
  }

  // contructores

  public Oferta() {}

  public Oferta(String tituloOferta) {
    this.tituloOferta = tituloOferta;
  }

}
