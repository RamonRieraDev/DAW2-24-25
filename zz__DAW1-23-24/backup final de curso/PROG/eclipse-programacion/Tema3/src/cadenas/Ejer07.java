package cadenas;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		boolean palabraEncontrada = false;

		String[] palabrotas = { "sinvergüenza", "maleducado", "analfabeto", "botarate", "bribón", "mendrugo" };

		int i;
		for (i = 0; i < palabrotas.length; i++) {

			//if (frase.indexOf(palabrotas[i]) != -1) {
			if (frase.indexOf(palabrotas[i]) != -1) {
				palabraEncontrada = true;
				break;
			}
		}

		if (palabraEncontrada) {
			System.out.println("Se han encontrado palabras malsonantes en la frase"
		+ "(" + palabrotas[i] + ").");
		} else {
			System.out.println("No se han encontrado palabras malsonantes en la frase.");

		}

	}

}
