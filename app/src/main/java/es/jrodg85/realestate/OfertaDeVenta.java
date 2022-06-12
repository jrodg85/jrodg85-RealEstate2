package es.jrodg85.realestate;

public class OfertaDeVenta extends Oferta{

	  // atributos

	  private double precioDeVenta;

	  // getter 
	  
	  public double getPrecioDeVenta() {
	    return precioDeVenta;
	  }

	  // setter 

	  public void setPrecioDeVenta(double precioVenta) {
	    this.precioDeVenta = precioVenta;
	  }

	  // Constructores

	  public OfertaDeVenta() {}

	  public OfertaDeVenta(String titulo, double precioDeVenta) {
	    super(titulo);
	    this.precioDeVenta=precioDeVenta;
	  }

}
