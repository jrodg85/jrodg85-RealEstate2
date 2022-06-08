package es.jrodg85.realestate;

public class OfertaDeAlquiler extends Oferta implements OfertaDeAlquilerInterfaz {

	// atributos

	private double precioAlquilerMensual;
	private int mesesFianza;
	private double precioDeAlquilerPorSuperficie;

	// geters

	@Override
	public double getPrecioAlquilerMensual() {
		return precioAlquilerMensual;
	}

	@Override
	public int getMesesFianza() {
		return mesesFianza;
	}

	@Override
	public double getPrecioDeAlquilerPorSuperficie() {
		return precioDeAlquilerPorSuperficie;
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

	@Override
	public void setPrecioDeAlquilerPorSuperficie() {
		this.precioDeAlquilerPorSuperficie = precioAlquilerSuperficie();
	}

	public OfertaDeAlquiler() {
	}

	public OfertaDeAlquiler(String tituloOferta, double precioAlquilerMensual, int mesesFianza) {
		super(tituloOferta);
		this.precioAlquilerMensual = precioAlquilerMensual;
		this.mesesFianza = mesesFianza;
		this.precioDeAlquilerPorSuperficie = precioAlquilerSuperficie();
	}

	@Override
	public double precioAlquilerSuperficie() {
		double precioAlquiler = getPrecioAlquilerMensual();
		double superficie = getVivienda().getSuperficie();
		double precioSuperficieAlquiler;
		String valorPercioIncorrecto = "El valor del precio de alquiler es incorrecto.";
		if (superficie <= 0) {
			precioSuperficieAlquiler = superficie;
		}
		if (precioAlquiler <= 0) {
			precioSuperficieAlquiler = Double.valueOf(valorPercioIncorrecto);
		} else {
			precioSuperficieAlquiler = precioAlquiler / superficie;
		}
		return precioSuperficieAlquiler;
	}

}
