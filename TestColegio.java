package es.studium.Colegio;

public class TestColegio
{
	public static void main(String[] args)
	{
		/* Creo los centros pasando valores al constructor */ 
		Centros c1 = new Centros("Escuela de inglés", 2448, "Reyes Católicos, 14", 3); 
		Centros c2 = new Centros("Escuela de francés", 2652, "Cristóbal Colón, 92", 2); 
		
		/* Creo las asignaturas pasando valores al constructor */ 
		Asignatura ib1 = new Asignatura("Inglés B1", 0003, c1, 20 );
		Asignatura ib2 = new Asignatura("Inglés B2", 0004, c1, 20 );
		Asignatura fa2 = new Asignatura("Francés A2", 1002, c2, 20 );
		Asignatura fb1 = new Asignatura("Francés B1", 1003, c2, 20 );
		
		/* Creo los alumnos pasando valores al constructor */ 
		Alumnos alumno1 = new Alumnos("Ana", "Abel", 301 , "Paseo de América, 15", c1, ib1, 7);
		Alumnos alumno2 = new Alumnos("Benito ", "Bueno", 302 , "Reyes Católicos, 16", c1, ib2, 6);
		Alumnos alumno3 = new Alumnos("Carmen ", "Cano", 303 , "Reyes Católicos, 2", c1, ib1, 5);
		Alumnos alumno4 = new Alumnos("Esteban ", "Escalera", 201 , "Isabel la Católica, 28", c2, fb1 , 9);
		Alumnos alumno5 = new Alumnos("Francisco ", "Farfán", 202 , "Cristóbal Colón, s/n", c2, fa2, 8.5);
		
		/* Muestro por consola la dirección de ambos centros creados */
		System.out.println("La dirección de la escuela de inglés es: " + c1.getDireccionCentro());
		System.out.println("La dirección de la escuela de francés es: " + c2.getDireccionCentro());
		
		/* Muestro por consola la direccion del centro donde asiste Carmen */
		System.out.println("La dirección del centro en el que está matriculada " + alumno3.getNombreAlumno()+ "es "+ alumno3.getCentro().getDireccionCentro());
		
		/* Muestro por consola la nota del alumno2 */
		System.out.println(alumno2.getNombreAlumno() + "se ha sacado un " + alumno2.getNota() + " en " + alumno2.getAsignatura().getNombreAsignatura());
	}

}
