package es.studium.Colegio;

public class Alumnos
{
	//A continuación se declaran los atributos de la clase Alumnos
	private String nombreAlumno;
	private String apellidoAlumno;
	private int matricula;
	private String direccionAlumno;
	private Centros centro;
	private Asignatura asignatura;
	private double nota;
	
	//CONSTRUCTORES
	
	//Constructor vacío
	public Alumnos() {
		nombreAlumno = "";
		apellidoAlumno = "";
		matricula = 0;
		direccionAlumno = "";
		centro = new Centros();
		asignatura = new Asignatura();
		nota = 0;
	}
	
	//Constructor con parámetros
	public Alumnos(String na, String ap, int ma, String da, Centros c, Asignatura a, double n) {
		this.nombreAlumno = na;
		this.apellidoAlumno = ap;
		this.matricula = ma;
		this.direccionAlumno = da;
		this.centro = c;
		this.asignatura = a;
		this.nota = n;
	}
	
	//Métodos Getters y Setters que permiten acceder y modificar los atributos privados
	
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String na) {
		this.nombreAlumno = na;
	}
	
	public String getApellidoAlumno() {
		return apellidoAlumno;
	}
	public void setApellidoAlumno(String ap) {
		this.apellidoAlumno = ap;
	}
	
	public int getMatricula()
	{
		return matricula;
	}
	public void setMatricula(int ma)
	{
		this.matricula = ma;
	}
	
	public String getDireccionAlumno()
	{
		return direccionAlumno;
	}
	public void setDireccionAlumno(String da)
	{
		this.direccionAlumno = da;
	}
	
	public Centros getCentro()
	{
		return centro;
	}
	public void setCentro(Centros c)
	{
		this.centro = c;
	}
	
	public Asignatura getAsignatura()
	{
		return asignatura;
	}
	public void setAsignatura(Asignatura a)
	{
		this.asignatura = a;
	}
	
	public double getNota()
	{
		return nota;
	}
	public void setNota(double n)
	{
		this.nota = n;
	}
	
}
