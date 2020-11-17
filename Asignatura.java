package es.studium.Colegio;

public class Asignatura
{
	/* Atributos */
	private String nombreAsignatura;
	private int codigoAsignatura;
	private Centros centroAsignatura;
	private int cantidadHoras;
	
	/* Constructor por defecto */
	public Asignatura() {
		nombreAsignatura = "";
		codigoAsignatura = 0;
		centroAsignatura = new Centros();
		cantidadHoras = 0;
	}
	
	/* Constructor con parámetros */
	public Asignatura(String na, int codigoA, Centros centroA, int qh) {
		nombreAsignatura = na;
		codigoAsignatura = codigoA;
		centroAsignatura = centroA;
		cantidadHoras = qh;
	}
	
	/* Métodos Getters y Setters que permiten acceder y modificar los atributos privados */
	
	public String getNombreAsignatura()
	{
		return nombreAsignatura;
	}
	public void setNombreAsignatura(String nombreAsignatura)
	{
		this.nombreAsignatura = nombreAsignatura;
	}
	
	public int getCodigoAsignatura()
	{
		return codigoAsignatura;
	}
	public void setCodigoAsignatura(int codigoAsignatura)
	{
		this.codigoAsignatura = codigoAsignatura;
	}
	
	public Centros getCentroAsignatura()
	{
		return centroAsignatura;
	}
	public void setCentroAsignatura(Centros centroAsignatura)
	{
		this.centroAsignatura = centroAsignatura;
	}
	
	public int getCantidadHoras()
	{
		return cantidadHoras;
	}
	public void setCantidadHoras(int cantidadHoras)
	{
		this.cantidadHoras = cantidadHoras;
	}
	
}
