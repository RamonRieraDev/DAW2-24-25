package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio09 {
// Programa que lee una frase desde el teclado y la muestra quitando la primera palabra.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase;
		String palabra = "";

		System.out.print("Escribe una frase: ");
		frase = entrada.nextLine();

		//System.out.println(frase.indexOf(" "));
		
		if (frase.indexOf(" ") != -1) {
			for (int i = frase.indexOf(" ") + 1; i < frase.length(); i++) {

				palabra = palabra + frase.charAt(i);
			}
		}
		System.out.print(palabra);
	}
}
