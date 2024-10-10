package ejercicios01;

//Primera parte del problema 14.

import java.util.Scanner;

public class Ejer14b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero = 0;
		boolean esPrimo = true;

		// Empezamos dividiendo por dos ya que todos los números son divisibles por 1 y
		// por el mismo
		// y acabamos diviendo por un número anterior al que nos han dao.

		for (int candidato = 2; candidato < 100; candidato++) {

			for (int i = 2; i < candidato; i++) {

				System.out.println(candidato + " / " + i + " da resto " + candidato % i + ".");

				if (candidato % i == 0) {

					System.out.println("¡NO ES PRIMO!");
					esPrimo = false;
					break;
				}

			}
			candidato = numero;
		}
		if (esPrimo) {
			System.out.println(numero + " es primo.");
		} else {
			System.out.println(numero + " es compuesto.");
		}
	}
}
