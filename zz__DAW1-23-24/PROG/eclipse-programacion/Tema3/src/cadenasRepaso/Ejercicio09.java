package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio09 {
// Programa que lee una frase desde el teclado y la muestra quitando la primera palabra.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase;

		System.out.print("Escribe una frase: ");
		frase = entrada.nextLine();

		String fraseSinPalabra = "";

		for (int i = frase.indexOf(" ") + 1; i < frase.length(); i++) {
			fraseSinPalabra = fraseSinPalabra + frase.charAt(i);
		}

		System.out.println(fraseSinPalabra);

	}

}
