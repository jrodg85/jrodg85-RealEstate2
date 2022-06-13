package es.jrodg85.realestate;


public class Oferta {

	// atributos

	private int idOferta;
	private String tituloOferta;
	private Vivienda vivienda;

	// getter

	public int getIdOferta() {
		return idOferta;
	}

	public String getTituloOferta() {
		return tituloOferta;
	}

	public Vivienda getVivienda() {
		return vivienda;
	}

	// setter

	public void setIdOferta(int idOferta) {
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
