package ejercicios01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ejer01b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("¿Qué archivo deseas copiar? ");
		String nombreArchivo = entrada.nextLine();

		try {

			// Creamos el buffer para meter en archivo
			BufferedInputStream bufferArchivo = 
					new BufferedInputStream(new FileInputStream("ficheros/" + nombreArchivo));

			BufferedOutputStream bufferCopia = 
					new BufferedOutputStream(new FileOutputStream("ficheros/" + nuevoNombre(nombreArchivo)));

			int byteLeido = bufferArchivo.read();

			while (byteLeido != -1) {

				bufferCopia.write(byteLeido);
				byteLeido = bufferArchivo.read();
			}

			// Cerramos los buffers
			bufferArchivo.close();
			bufferCopia.close();

			System.out.println("\nLa copia se ha hecho con seguridad.");
			System.out.println("\nEl nombre del archivo que es una copia es: " + nuevoNombre(nombreArchivo));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static String nuevoNombre(String cadena) {

		int posExtension = cadena.lastIndexOf(".");
		String nombre = cadena.substring(0, posExtension);
		String extension = cadena.substring(posExtension);
		String nombreCopia = nombre + ".copia" + extension;
		return nombreCopia;

	}

}
