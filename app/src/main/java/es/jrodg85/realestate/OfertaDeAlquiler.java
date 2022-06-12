package es.jrodg85.realestate;

public class OfertaDeAlquiler extends Oferta{

	// atributos

	  private double precioAlquilerMensual;
	  private int mesesFianza;

	  // geters

	  public double getPrecioAlquilerMensual() {
	    return precioAlquilerMensual;
	  }

	  public int getMesesFianza() {
	    return mesesFianza;
	  }

	  // setters

	  public void setPrecioAlquilerMensual(double precioAlquilerMensual) {
	    this.precioAlquilerMensual = precioAlquilerMensual;
	  }

	  public void setMesesFianza(int mesesFianza) {
	    this.mesesFianza = mesesFianza;
	  }

	  public OfertaDeAlquiler() {}

	  public OfertaDeAlquiler(String tituloOferta, double precioAlquilerMensual, int mesesFianza) {
	    super(tituloOferta);
	    this.precioAlquilerMensual = precioAlquilerMensual;
	    this.mesesFianza = mesesFianza;
	  }

	
}
