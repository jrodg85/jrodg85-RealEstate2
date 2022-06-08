package es.jrodg85.realestate;

public class Vivienda {

  // atributos

  private long idVivienda;
  private String propietario;
  private String provincia;
  private String ciudad;
  private String direccion;
  private int codigoPostal;
  private String idReferenciaCatastral;
  private double superficie;

  // getters

  public long getIdVivienda() {
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

  // setters

  public void setIdVivienda(long idVivienda) {
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

  public void setSuperficie(int superficie) {
    this.superficie = superficie;

  }

  // contructores

  public Vivienda() {}

  public Vivienda(String propietario, String provincia, String ciudad, String direccion,
      int codigoPostal, String idReferenciaCatastral, double superficie) {
    this.propietario = propietario;
    this.provincia = provincia;
    this.ciudad = ciudad;
    this.direccion = direccion;
    this.codigoPostal = codigoPostal;
    this.idReferenciaCatastral = idReferenciaCatastral;
    this.superficie = superficie;
  }

  @Override
  public String toString() {
    return "Vivienda [propietario=" + getPropietario() + ", provincia=" + getProvincia()
        + ", ciudad=" + getCiudad() + ", direccion=" + getDireccion() + ", codigoPostal="
        + getCodigoPostal() + ", idReferenciaCatastral=" + getIdReferenciaCatastral()
        + ", superficie=" + getSuperficie() + ", ofertas=" + "]";
  }

}
