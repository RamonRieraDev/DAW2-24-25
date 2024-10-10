package practica1;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int INICIO_BUCLE = 1;

		int anyo;

		final int ANYO_TRANSISTOR = 1947;

		System.out.println("       -----  Quiz Game -----\n\n" + "¿Sabes en qué año se invento el transistor?");

		while (INICIO_BUCLE > 0) {

			if (entrada.hasNextInt() == true) {

				anyo = entrada.nextInt();

				if (anyo == ANYO_TRANSISTOR) {

					System.out.println("Has acertado.");
					break;
				} else if (anyo < ANYO_TRANSISTOR) {
					System.out.println("Uyyyy, ¡te has quedado corto!");
					break;
				} else {
					System.out.println("Uyyyy, ¡te has pasado!");
					break;
				}

			} else {
				System.out.println("Por favor, debes escribir un número entero.");
				entrada.nextLine();
			}

		}
	}

}