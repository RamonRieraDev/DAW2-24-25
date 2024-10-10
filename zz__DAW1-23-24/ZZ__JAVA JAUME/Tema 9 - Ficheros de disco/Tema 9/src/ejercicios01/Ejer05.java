package ejercicios01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer05 {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Nombre del archivo?");
		String nombre = entrada.nextLine();

		int contadorBreak = 0;
		int contadorCase = 0;



		try {
			BufferedReader bufferL = new BufferedReader(new FileReader("src/ejercicios01/" + nombre));

			String linea = bufferL.readLine();

			while (linea != null) {

				contadorBreak = contadorBreak + contarPalabras(linea, "break");
				
				contadorCase = contadorCase + contarPalabras(linea, "case");

				linea = bufferL.readLine();
			}

			bufferL.close();

		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nHay " + contadorCase + " case.\nHay " + contadorBreak + " breaks");

		if(contadorBreak < contadorCase) {
			System.out.println("\nAdvertencia: el número de breaks es inferiro al número de case.");
		}
	}

	private static int contarPalabras(String linea, String palabra) {

		int contador = 0;
		// Primera aparación
		int pos = linea.indexOf(palabra);

		// Seguimos buscando mientras no obtengamos -1
		while (pos != -1) {
			contador++;
			pos = linea.indexOf(palabra, pos + 1);

		}

		return contador;
	}
}