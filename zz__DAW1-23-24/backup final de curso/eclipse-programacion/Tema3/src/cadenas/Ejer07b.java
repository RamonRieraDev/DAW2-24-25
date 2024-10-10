package cadenas;

import java.util.Scanner;

// Variación en que modificamos la frase sustituyendo las palabrotas por asteriscos.
public class Ejer07b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");

		String frase = entrada.nextLine();

		boolean palabraEncontrada = false;

		String[] palabrotas = { "sinvergüenza", "maleducado", "analfabeto", "botarate", "bribón", "mendrugo" };
		
		for (int i = 0; i < palabrotas.length; i++) {

			if (frase.indexOf(palabrotas[i]) != -1) {
				palabraEncontrada = true;
				frase = frase.replace(palabrotas[i], "*****");
			}
		}

		if (palabraEncontrada) {
			System.out.println("Se han encontrado palabras malsonantes en la frase.");
		} else {
			System.out.println("No se han encontrado palabras malsonantes en la frase.");

		}
		System.out.println("La frase censurada" + "\n" + frase);

	}

}
