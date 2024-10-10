package cadenas;

import java.util.Scanner;

public class Extra {

	// Programa que busca una palabra dentro de una frase,
	// mostrándonos todas las posiciones donde aparece.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		System.out.println("Escribe la palabra que quieres encontrar: ");
		String palabra = entrada.nextLine();

		// boolean palabraEncontrada = false;

		int posicion = frase.indexOf(palabra);

		if (posicion == -1) {
			System.out.println("no hay palabras.");
		}

		while (frase.indexOf(palabra) != -1) {

			// palabraEncontrada = false;
			System.out.println(frase.indexOf(palabra));
			posicion = frase.indexOf(palabra, posicion + 1);
		}
	}

}
