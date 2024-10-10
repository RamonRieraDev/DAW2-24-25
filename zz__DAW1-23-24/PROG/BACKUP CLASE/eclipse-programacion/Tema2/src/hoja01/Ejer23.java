package hoja01;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número entre 1 y 10:");

		boolean correcto = entrada.hasNextInt();

		if (correcto) {
			System.out.println("Es un número entero.");

			int num = entrada.nextInt();
			if (num >= 1 && num <= 10) {
				System.out.println("Tu número está entre 1 y 10.");
				if (num == 3) {
					System.out.println("Y además has acertado el número.");
				} else {
					System.out.println("Pero no has acertado el número.");
				}
			} else {
				System.out.println("Pero tu número no está entre 1 y 10.");
			}

		} else {
			System.out.println("Es incorrecto. No es un número entero.");
		}
	}
}
