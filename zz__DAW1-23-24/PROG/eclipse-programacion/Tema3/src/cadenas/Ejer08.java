package cadenas;

import java.util.Scanner;

public class Ejer08 {
// Programa que lee una frase desde el teclado y nos muestra la primera palabra.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		String palabra = "";

		if (frase.indexOf(" ") != -1) {

			for (int i = 0; i < frase.length(); i++) {

				if (frase.charAt(i) != ' ') {
					palabra = palabra + frase.charAt(i);
				} else {
					break;
				}
			}

			System.out.println(palabra);
		}
	}
}
