package es.studium.Colegio;

public class TestColegio
{
	public static void main(String[] args)
	{
		/* Creo los centros pasando valores al constructor */ 
		Centros c1 = new Centros("Escuela de ingl�s", 2448, "Reyes Cat�licos, 14", 3); 
		Centros c2 = new Centros("Escuela de franc�s", 2652, "Crist�bal Col�n, 92", 2); 
		
		/* Creo las asignaturas pasando valores al constructor */ 
		Asignatura ib1 = new Asignatura("Ingl�s B1", 0003, c1, 20 );
		Asignatura ib2 = new Asignatura("Ingl�s B2", 0004, c1, 20 );
		Asignatura fa2 = new Asignatura("Franc�s A2", 1002, c2, 20 );
		Asignatura fb1 = new Asignatura("Franc�s B1", 1003, c2, 20 );
		
		/* Creo los alumnos pasando valores al constructor */ 
		Alumnos alumno1 = new Alumnos("Ana", "Abel", 301 , "Paseo de Am�rica, 15", c1, ib1, 7);
		Alumnos alumno2 = new Alumnos("Benito ", "Bueno", 302 , "Reyes Cat�licos, 16", c1, ib2, 6);
		Alumnos alumno3 = new Alumnos("Carmen ", "Cano", 303 , "Reyes Cat�licos, 2", c1, ib1, 5);
		Alumnos alumno4 = new Alumnos("Esteban ", "Escalera", 201 , "Isabel la Cat�lica, 28", c2, fb1 , 9);
		Alumnos alumno5 = new Alumnos("Francisco ", "Farf�n", 202 , "Crist�bal Col�n, s/n", c2, fa2, 8.5);
		
		/* Muestro por consola la direcci�n de ambos centros creados */
		System.out.println("La direcci�n de la escuela de ingl�s es: " + c1.getDireccionCentro());
		System.out.println("La direcci�n de la escuela de franc�s es: " + c2.getDireccionCentro());
		
		/* Muestro por consola la direccion del centro donde asiste Carmen */
		System.out.println("La direcci�n del centro en el que est� matriculada " + alumno3.getNombreAlumno()+ "es "+ alumno3.getCentro().getDireccionCentro());
		
		/* Muestro por consola la nota del alumno2 */
		System.out.println(alumno2.getNombreAlumno() + "se ha sacado un " + alumno2.getNota() + " en " + alumno2.getAsignatura().getNombreAsignatura());
	}

}
