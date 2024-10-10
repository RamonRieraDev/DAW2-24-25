package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime un número entero entre el 1 y el 10: ");

		if (entrada.hasNextInt() == true) {
			int numero = entrada.nextInt();

			if (numero >= 1 && numero <= 10) {
				System.out.println("Número correcto entre 1 y 10");
				if (numero == 3) {
					System.out.println("Has acertado el número.");
				}
			}
		} else {
			System.out.println("Número incorrecto.");
		}
		System.out.println("Gracias por intentarlo.");

	}

}
