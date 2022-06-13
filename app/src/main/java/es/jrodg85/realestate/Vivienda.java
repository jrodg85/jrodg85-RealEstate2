package es.jrodg85.realestate;

import java.util.ArrayList;
import java.util.Collection;

public class Vivienda {

	// atributos

	private Integer idVivienda;
	private String propietario;
	private String provincia;
	private String ciudad;
	private String direccion;
	private int codigoPostal;
	private String idReferenciaCatastral;
	private double superficie;
	private Collection<Oferta> ofertasVivienda = new ArrayList<>();

	// getter

	public Integer getIdVivienda() {
		return idVivienda;
	}

	public String getPropietario() {
		return propietario;
	}

	public String getProvincia() {
		return provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public String getIdReferenciaCatastral() {
		return idReferenciaCatastral;
	}

	public double getSuperficie() {
		return superficie;
	}

	public Collection<Oferta> getOfertasVivienda() {
		return ofertasVivienda;
	}

	// setter

	public void setIdVivienda(Integer idVivienda) {
		this.idVivienda = idVivienda;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public void setIdReferenciaCatastral(String idReferenciaCatastral) {
		this.idReferenciaCatastral = idReferenciaCatastral;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public void setOfertasVivienda(Collection<Oferta> ofertasVivienda) {
		this.ofertasVivienda = ofertasVivienda;
	}

	// relacion en ambos sentidos, cerrando el circulo.

	public void addOferta(Oferta oferta) {
		getOfertasVivienda().add(oferta);
		oferta.setVivienda(this);

	}

	public Vivienda() {
	}

	public Vivienda(String propietario, String provincia, String ciudad, String direccion, int codigoPostal,
			String idReferenciaCatastral, double superficie) {
		this.propietario = propietario;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.idReferenciaCatastral = idReferenciaCatastral;
		this.superficie = superficie;
	}

}
