package es.studium.Colegio;

public class Centros
{
	/* Atributos */
	private String nombreCentro;
	private int codigoCentro;
	private String direccionCentro;
	private int cantidadAlumnos;
	
	/* Constructor por defecto */
	public Centros() {
		nombreCentro = "";
		codigoCentro = 0;
		direccionCentro = "";
		cantidadAlumnos = 0;
	}
	
	/* Constructor con parámetros */
	public Centros(String nc, int cc, String dc, int ca ) {
		this.nombreCentro = nc;
		this.codigoCentro = cc;
		this.direccionCentro = dc;
		this.cantidadAlumnos = ca;
	}
	
	/* Métodos Getters y Setters */
	public String getNombreCentro() {
		return nombreCentro;
	}
	public void serNombreCentro(String nc) {
		this.nombreCentro = nc;
	}
	
	public int getCodigoCentro() {
		return codigoCentro;
	}
	public void setCodigoCentro(int cc) {
		this.codigoCentro = cc;
	}
	
	public String getDireccionCentro()
	{
		return direccionCentro;
	}
	public void setDireccionCentro(String dc)
	{
		this.direccionCentro = dc;
	}
	
	public int getCantidadAlumnos()
	{
		return cantidadAlumnos;
	}
	public void setCantidadAlumnos(int ca)
	{
		this.cantidadAlumnos = ca;
	}
	
}
