import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Programa que convierta un archivo de texto en mayúsculas

		// Abrimos el archivo
		System.out.print("¿Qué archivo deseas pasar a mayúsculas? ");
		String nombreArchivo = entrada.nextLine();

		try {
			// Abrimos el archivo de lectura
			BufferedReader bufferLectura = new BufferedReader(new FileReader("ficheros/" + nombreArchivo));

			// Abrimos el archivo temporal.txt para escritura.
			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter("ficheros/temporal.txt"));

			// Leemos la primera línea del archivo original
			String linea = bufferLectura.readLine();

			// Vamos leyendo línea a línea mientras no obtengamos
			// un null en readLine()
			while (linea != null) {

				// Pasamos una línea a mayúsculas
				linea = linea.toUpperCase();

				// Guardamos esta línea en el archivo temporal
				bufferEscritura.write(linea + "\n");

				// Leemos la siguiente línea.
				linea = bufferLectura.readLine();
			}

			//Cerrmos los archivos
			bufferLectura.close();
			bufferEscritura.close();
			
			//Borramos el archivo original
			File archivoOriginal = new File("ficheros/" + nombreArchivo);
			archivoOriginal.delete();
			
			//Renombramos el archivo temporal
			File archivoTemporal = new File("ficheros/temporal.txt");
			archivoTemporal.renameTo(archivoOriginal);
			
			System.out.println("Operación finalizada.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
