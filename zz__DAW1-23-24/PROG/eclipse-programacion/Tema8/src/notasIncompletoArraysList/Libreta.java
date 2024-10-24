package notasIncompleto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Libreta {

	private final String NOMBRE_ARCHIVO = "ficheros/notas.txt";
	//private final String NOMBRE_ARCHIVO = "C:/Users/Ramon Riera/OneDrive/Escritorio/DAW1 23-24/PROG/eclipse-programacion/Tema8/ficheros/notas.txt";
	private final int MAX_NOTAS = 1000;

	//private Nota[] notas;
	private List<String> notas = new ArrayList<String>(); 
	private int numNotas;

	public Libreta() {
		//notas = new Nota[MAX_NOTAS];
		//numNotas = 0;
		leerNotas();
	}

	public void addNota(Nota nota) {

		notas.add("" + nota);
//		if (numNotas < MAX_NOTAS) {
//			notas[numNotas] = nota;
//			numNotas++;
//		}

	}

//	public void setNota(int posicion, Nota nota) {
//
//		notas.get(posicion);
//		//notas[posicion] = nota;
//
//	}
//
//	public Nota getNota(int posicion) {
//
//		return notas.indexOf(posicion);
//		//return notas[posicion];
//
//	}

	public List<String> getNota(int posicion) {
		return notas;
	}

	public void setNota(int posicion, Nota nota) {
		notas.get(posicion);
	}

	public void delNota(int posicion) {

		for (int i = posicion; i < numNotas - 1; i++) {
			notas.remove(i);
			//notas[i] = notas[i + 1];
		}

		numNotas--;
		
	}

	public void leerNotas() {

		// Este método lo que hace es comprobar si el objeto de tipo File exsiste
		try {

			BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
			String linea = br.readLine();
			String titulo;
			while (linea != null) {

				if (linea.length() >= 7) {
					titulo = linea.substring(7);
				} else {
					return;
				}

				linea = br.readLine();

				String descripcion;

				if (linea != null && linea.length() >= 12) {
					descripcion = linea.substring(12);
				} else {
					return;
				}

				Nota nota = new Nota(titulo, descripcion);
				addNota(nota);
				linea = br.readLine();
			}
			br.close();

			// CÓDIGO DE PRUEBAS
//						System.out.println("Array notas:");
//						for (int i = 0; i < numNotas; i++) {
//							System.out
//									.println("Título: " + notas[i].getTitulo() + "\nDescripción: " + notas[i].getDescripcion());
//						}

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo " + NOMBRE_ARCHIVO,
					"Archivo de tareas no encontrado", JOptionPane.WARNING_MESSAGE);

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido leer el archivo de tareas" + NOMBRE_ARCHIVO,
					"Error de E/S", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void guardarNotas() {

		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));
			BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
			
			String linea = br.readLine();
			String titulo = "";
			String descripcion = "";

			for (int i = 0; i < notas.size(); i++) {
				if(linea != null) {
					titulo += notas.get(i);
					bw.write("TITULO:" + titulo.substring(7, linea.indexOf("DESCRIPCION")));
				}
				if(linea!= null) {
					descripcion += notas.get(i);
					bw.write("DESCRIPCION:" + descripcion.substring(12, descripcion.indexOf("TITULO")));
				}
			}
			
			bw.close();
			br.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido guardar el archivo de tareas" + NOMBRE_ARCHIVO,
					"Error de E/S", JOptionPane.ERROR_MESSAGE);
		}

	}

	public int getNumNotas() {
		return numNotas;
	}
	
	public boolean hayEspacio() {
		if(numNotas < MAX_NOTAS) {
			return true;
		}
		
		return false;
	}

}
