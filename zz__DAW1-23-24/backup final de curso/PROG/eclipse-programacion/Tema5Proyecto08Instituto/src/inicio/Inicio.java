package inicio;

import auxiliar.*;
import instituto.*;

public class Inicio {

	public static void main(String[] args) {

		// Creamos un objeto Grupo sin pasarle ningún dato y luego usamos leeDatos()
		// Para inicializar todos sus atributos:
		Grupo grupo1 = new Grupo();
		//grupo1.leeDatos();
		//System.out.println(grupo1.toString());

		// Creamos un objeto Grupo pasándole los atributos directamente en el 
		// constructor.
		Grupo grupo2 = new Grupo(12, "ESO", 3, "B");
		//System.out.println(grupo2.toString());
		
		// Creamos un objeto Alumno pasándole los datos al constructor (le asignamos el grupo 3ºB):
		Alumno alumno1 = new Alumno(100, "Pérez López", "Luis", grupo2);
		Alumno alumno3 = new Alumno(102, "Aragónes Fernández", "Marta", grupo1);
		Alumno alumno4 = new Alumno(103, "Rodríguez Juan", "Laura", grupo1);
		Alumno alumno5 = new Alumno(104, "Rodríguez Juan", "Moisés", grupo1);
		//alumno1.leeDatos();
		//System.out.println(alumno1.toString());
		
		// // Creamos un objeto Alumno llamando al método leeDatos() (por terminal):
//		Alumno alumno2 = new Alumno();
//		alumno2.leeDatos();
//		System.out.println(alumno2.toString());
		
		Instituto instituto1 = new Instituto();
		instituto1.addAlumno(alumno1);
		
		instituto1.addAlumno(alumno3);
		
		instituto1.addAlumno(alumno4);
		
		instituto1.muestraAlumnos();
		
		instituto1.delAlumno(50);
		instituto1.muestraAlumnos();
		
		instituto1.addAlumno(alumno5);
		instituto1.muestraAlumnos();
		
		System.out.println("\nEl total de alumnos es de: " + instituto1.numAlumnos() + " alumnos.");
		
		System.out.println("\nLa posición es: " + instituto1.buscaAlumno(104));
	}

}
