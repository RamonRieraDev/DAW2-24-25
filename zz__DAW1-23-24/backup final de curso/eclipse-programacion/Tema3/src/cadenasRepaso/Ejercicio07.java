package cadenasRepaso;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio07 {
// Programa que lee una frase desde el teclado y nos alerta de si contiene alguna palabra
// malsonante. Las palabras malsonantes las buscará en un array llamado palabrotas
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] palabrotas = { "tonto", "idiota" };

		String frase;

		System.out.print("Escribe una frase: ");
		frase = entrada.nextLine();

		boolean palabraEncontrada = false;

		int i;
		for (i = 0; i < palabrotas.length; i++) {
			if (frase.indexOf(palabrotas[i]) != -1) {
				palabraEncontrada = true;
				break;
			}
		}

		if (palabraEncontrada) {
			System.out.println("Se ha encontrado palabrotas en el texto en la posición " + i + " del array palabrotas.");
		} else {
			System.out.println("No se ha encontrado palabrotas en el texto.");
		}

	}

}
