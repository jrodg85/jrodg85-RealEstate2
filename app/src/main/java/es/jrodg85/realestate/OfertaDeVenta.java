package es.jrodg85.realestate;

public class OfertaDeVenta extends Oferta implements OfertaDeVentaInterfaz {

  // atributos

  private double precioDeVenta;

  // get

  @Override
  public double getPrecioDeVenta() {
    return precioDeVenta;
  }

  // setter

  @Override
  public void setPrecioDeVenta(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

  // contructor

  public OfertaDeVenta() {}

  public OfertaDeVenta(String tituloOferta, double precioDeVenta) {
    super(tituloOferta);
    this.precioDeVenta = precioDeVenta;
  }

  @Override
  public String toString() {
    return "Oferta De Venta [PrecioDeVenta = " + getPrecioDeVenta() + ", Titulo Oferta = "
        + getTituloOferta() + " ]";
  }

}
