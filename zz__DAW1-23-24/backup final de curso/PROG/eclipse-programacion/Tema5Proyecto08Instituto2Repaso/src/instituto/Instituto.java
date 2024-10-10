package instituto;

import auxiliar.*;

public class Instituto {

	private final int MAX_ALUMNOS = 10;
	private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
	
	public void addAlumno(Alumno alu) {
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] == null) {
				alumnos[i] = alu;
				break;
			}
		}
	}
	
	public void delAlumno(int numExp) {
		int pos = buscaAlumno(numExp);
		if(pos == numExp) {
			alumnos[pos] = null;
		}
	}
	
	public void muestraAlumnos() {
		String listadoAlumnos = "";
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null) {
				listadoAlumnos = listadoAlumnos + alumnos[i].toString();
			}
		}
		System.out.println(listadoAlumnos);
	}
	
	public int numAlumnos() {
		int contarAlumnos = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null) {
				contarAlumnos++;
			}
		}
		return contarAlumnos;
	}
	
	public int buscaAlumno(int numExp) {
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i] != null && numExp == alumnos[i].getNumExp()) {
				return i;
			}
		}
		return -1;
	}
}
