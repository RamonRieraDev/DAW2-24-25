package instituto;

import auxiliar.*;

public class Instituto {

	private final int MAX_ALUMNOS = 30;
	private Alumno[] alumnos = new Alumno[MAX_ALUMNOS];

	// MÉTODOS:
	public void addAlumno(Alumno alu) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alu;
				return;
			}
		}
	}

	public void muestraAlumnos() {
		System.out.println("*** ALUMNOS INSTITUTO ***");
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				System.out.println(alumnos[i].toString());
			}
		}
	}

	public void delAlumno(int numExpediente) {

//		for (int i = 0; i < alumnos.length; i++) {
//			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExpediente) {
//				alumnos[i] = null;
//				return;
//			}
//		}

		int pos = buscaAlumno(numExpediente);
		if (pos != -1) {
			alumnos[pos] = null;
		}
	}

	public int numAlumnos() {

		int totalAlumnos = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				totalAlumnos++;
			}
		}
		return totalAlumnos;
	}

	public int buscaAlumno(int numExpediente) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getNumExpediente() == numExpediente) {
				return i;
			}
		}
		return -1;
	}

}
