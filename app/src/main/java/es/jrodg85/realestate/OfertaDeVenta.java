package es.jrodg85.realestate;

public class OfertaDeVenta extends Oferta implements OfertaDeVentaInterfaz {

	// atributos

	private double precioDeVenta;
	private double precioDeVentaPorSuperficie;

	// get

	@Override
	public double getPrecioDeVenta() {
		return precioDeVenta;
	}

	@Override
	public double getPrecioDeVentaPorSuperficie() {
		return precioDeVentaPorSuperficie;
	}

	// setter

	@Override
	public void setPrecioDeVenta(double precioDeVenta) {
		this.precioDeVenta = precioDeVenta;
	}

	@Override
	public void setPrecioDeVentaPorSuperficie() {
		this.precioDeVentaPorSuperficie = precioVentaSuperficie();
	}

	// contructor

	public OfertaDeVenta() {
	}

	public OfertaDeVenta(String tituloOferta, double precioDeVenta) {
		super(tituloOferta);
		this.precioDeVenta = precioDeVenta;
		this.precioDeVentaPorSuperficie = precioVentaSuperficie();
	}

	@Override
	public double precioVentaSuperficie() {
		double precioVenta = getPrecioDeVenta();
		double superficie = getVivienda().getSuperficie();
		double precioSuperficieVenta;
		String valorPercioIncorrecto = "El valor del precio de alquiler es incorrecto.";
		if (superficie <= 0) {
			precioSuperficieVenta = superficie;
		}
		if (precioVenta <= 0) {
			precioSuperficieVenta = Double.valueOf(valorPercioIncorrecto);
		} else {
			precioSuperficieVenta = precioVenta / superficie;
		}
		return precioSuperficieVenta;
	}

}
