package ejercicios_apuntes;

import java.util.Scanner;

public class Ejer01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0;
		boolean esPrimo = true;

		while (true) {

			System.out.print("Introduce un número para saber si es primo o compuesto:");
			num = entrada.nextInt();

			if ((num % 2 == 0 && num != 2) || (num % 3 == 0 && num != 3) || (num % 5 == 0 && num != 5)
					|| (num % 7 == 0 && num != 7)) {
				esPrimo = false;
			} else {
				esPrimo = true;
			}

			if (esPrimo) {
				System.out.println("El número es primo.");
			} else {
				System.out.println("El número es compuesto");
			}
		}
	}
}
