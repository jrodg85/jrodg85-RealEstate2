package es.jrodg85.realestate;

public abstract class Oferta {

	// atributos

	private Vivienda vivienda;
	private long idOferta;
	private String tituloOferta;
	private double superficieVivienda;

	// getters

	public Vivienda getVivienda() {
		return vivienda;
	}

	public long getIdOferta() {
		return idOferta;
	}

	public String getTituloOferta() {
		return tituloOferta;
	}

	public double getSuperficieVivienda() {
		return superficieVivienda;
	}

	// setters

	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	public void setIdOferta(long idOferta) {
		this.idOferta = idOferta;
	}

	public void setTituloOferta(String tituloOferta) {
		this.tituloOferta = tituloOferta;
	}

	public void setSuperficieVivienda() {
		this.superficieVivienda = superficieVivienda();
	}

	// contructores

	public Oferta() {
	}

	public Oferta(String tituloOferta) {
		this.tituloOferta = tituloOferta;
		this.superficieVivienda = superficieVivienda();
	}

	public double superficieVivienda() {
		double retorno;
		double superficieVivienda = getVivienda().getSuperficie();
		String valorSuperficieIncorrecto = "el valor de la superficie de la vivienda es incorrecto.";
		if (superficieVivienda <= 0) {
			retorno = Double.valueOf(valorSuperficieIncorrecto);
		} else {
			retorno = superficieVivienda;
		}
		return retorno;
	}

}
