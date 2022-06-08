package es.jrodg85.realestate;

public class OfertaDeAlquiler extends Oferta implements OfertaDeAlquilerInterfaz {

  // atributos

  private double precioAlquilerMensual;
  private int mesesFianza;

  // geters

  @Override
  public double getPrecioAlquilerMensual() {
    return precioAlquilerMensual;
  }

  @Override
  public int getMesesFianza() {
    return mesesFianza;
  }

  // setters

  @Override
  public void setPrecioAlquilerMensual(double precioAlquilerMensual) {
    this.precioAlquilerMensual = precioAlquilerMensual;
  }

  @Override
  public void setMesesFianza(int mesesFianza) {
    this.mesesFianza = mesesFianza;
  }

  public OfertaDeAlquiler() {}

  public OfertaDeAlquiler(String tituloOferta, double precioAlquilerMensual, int mesesFianza) {
    super(tituloOferta);
    this.precioAlquilerMensual = precioAlquilerMensual;
    this.mesesFianza = mesesFianza;
  }

  @Override
  public String toString() {
    return "OfertaDeAlquiler [Precio Alquiler Mensual = " + getPrecioAlquilerMensual()
        + ", Meses Fianza = " + getMesesFianza() + ", Titulo Oferta = " + getTituloOferta() + " ]";
  }

}
