package actividades01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;

public class Actividad03 {

	public static void main(String[] args) {

		final String NOMBRE_ARCHIVO = "ficheros/contactos.txt";
		String[] contactos = new String[3];
		String[] nuevosContactos = new String[contactos.length];

		try {

			BufferedReader buffer = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

			String linea = buffer.readLine();
			int i;
			for (i = 0; i < contactos.length; i++) {
				contactos[i] = linea;
				linea = buffer.readLine();
			}

			for (i = 0; i < contactos.length; i++) {
				nuevosContactos = contactos[i].split(",");

				System.out.println("Apellidos: " + nuevosContactos[0] + "\n" 
					+ "Nombre: " + nuevosContactos[1] + "\n"
					+ "Teléfono: " + nuevosContactos[2] + "\n" 
					+ "------" + "\n");
			}

		} catch (Exception e) {
			System.out.println("Error.");
		}

	}

}
