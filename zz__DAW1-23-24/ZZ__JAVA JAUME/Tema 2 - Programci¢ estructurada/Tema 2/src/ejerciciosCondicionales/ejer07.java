package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Adivina el número secreto del 1 al 10: ");
		int numero = entrada.nextInt();
		final int NUMERO_SECRETO = 10;

		if (numero == NUMERO_SECRETO) {

			System.out.println("Felicidades, has acertado.");

		} else {

			System.out.println("No has acertado.");

		}
		System.out.println("Gracias por jugar.");

	}
}
