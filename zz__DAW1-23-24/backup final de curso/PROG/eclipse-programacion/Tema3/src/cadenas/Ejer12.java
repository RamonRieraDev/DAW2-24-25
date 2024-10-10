package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer12 {
// Programa que lee una frase y crea un array donde cada posición 
// contiene una palabra.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		int posEspacio = 0;
		int posEspacioSiguiente = frase.indexOf(" ");

		int posicion = 0;
		int numPalabras = 0;

		boolean leyendoPalabra = false;

		for (int i = 0; i < frase.length(); i++) {

			// Si en i hay un caracter que no es espacio
			if (frase.charAt(i) != ' ') {
				leyendoPalabra = true;
				if (numPalabras == 0) {
					numPalabras++;
				}
			} else if (frase.charAt(i) == ' ' && leyendoPalabra == true) {
				leyendoPalabra = false;
				numPalabras++;
			}
		}

		System.out.println("Hay " + numPalabras + " palabras");

		String[] palabras = new String[numPalabras];
		posicion = 0;

		// Guardamos la palabra que hay entre los dos espacios
		while (posEspacioSiguiente != -1) {
			palabras[posicion] = frase.substring(posEspacio, posEspacioSiguiente);
			posEspacio = posEspacioSiguiente + 1;

			posEspacioSiguiente = frase.indexOf(' ', posEspacio);
			posicion++;
		}

		// Guardamos la última palabra en la última posición.
		palabras[posicion] = frase.substring(posEspacio);
		System.out.println(Arrays.toString(palabras));
	}
}
