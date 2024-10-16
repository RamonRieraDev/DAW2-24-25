package actividades01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Crea una aplicación de consola que pida el nombre, apellidos y teléfono de tres personas y los
// guarde en un archivo llamado contactos.txt. Si el archivo ya existe, deberá añadir la información
// nueva al final del archivo.
public class Actividad02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String apellidos;
		String nombre;
		String telefono;
		String continuar = "";

		try {
			FileWriter archivo = new FileWriter("ficheros/contactos.txt", true);

			BufferedWriter buffer = new BufferedWriter(archivo);

			for (int i = 0; i < 3; i++) {
				System.out.println("Escribe los apellidos: ");
				apellidos = entrada.nextLine();
				buffer.write(apellidos + ",");

				System.out.println("Escribe el nombre: ");
				nombre = entrada.nextLine();
				buffer.write(nombre + ",");

				System.out.println("Escribe el número de teléfono: ");
				telefono = entrada.nextLine();
				buffer.write(telefono + "\n");
			}

			buffer.close();

		} catch (IOException e) {
			System.out.println("Error de escritura en disco.");
		}

	}

}
