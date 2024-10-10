package inicio;

import instituto.*;
import auxiliar.*;

public class Inicio {

	public static void main(String[] args) {

		Instituto i1 = new Instituto();
		
		Alumno a1 = new Alumno();
		//Alumno a2 = new Alumno();
		
		Grupo g1 = new Grupo();
//		Grupo g2 = new Grupo();
		
		//g1.leeDatos();
		
		a1.leeDatos();
		//a2.leeDatos();
		
		//i1.addAlumno(a2);
		i1.addAlumno(a1);
		
		i1.muestraAlumnos();
		

	}

}
