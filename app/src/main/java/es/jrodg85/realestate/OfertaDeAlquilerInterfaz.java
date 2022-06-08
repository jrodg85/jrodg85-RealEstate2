package es.jrodg85.realestate;

public interface OfertaDeAlquilerInterfaz {

	double getPrecioAlquilerMensual();

	int getMesesFianza();

	double getPrecioDeAlquilerPorSuperficie();
	// setters

	void setPrecioAlquilerMensual(double precioAlquilerMensual);

	void setMesesFianza(int mesesFianza);

	void setPrecioDeAlquilerPorSuperficie();

	double precioAlquilerSuperficie();

}