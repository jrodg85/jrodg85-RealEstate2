package es.jrodg85.realestate;


public class Oferta {

	// atributos

	private Integer idOferta;
	private String tituloOferta;
	private Vivienda vivienda;

	// getter

	public Integer getIdOferta() {
		return idOferta;
	}

	public String getTituloOferta() {
		return tituloOferta;
	}

	public Vivienda getVivienda() {
		return vivienda;
	}

	// setter

	public void setIdOferta(Integer idOferta) {
		this.idOferta = idOferta;
	}

	public void setTituloOferta(String tituloOferta) {
		this.tituloOferta = tituloOferta;
	}

	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	public Oferta() {
	}

	public Oferta(String tituloOferta, Vivienda vivienda) {
		this.tituloOferta=tituloOferta;
		this.vivienda=vivienda;
	}
	
}
