package ejerciciosBucle;

import java.util.Scanner;

public class Ejer09b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

//		Programa que calcule el resto de una división entre enteros 
//		con el procedimiento de ir restando repetidamente el divisor
//		del dividendo hasta que el resultado es menor que el divisor.

		System.out.println("Dame un número entero: ");
		int num1 = entrada.nextInt();
		System.out.println("Dame otro número entero: ");
		int num2 = entrada.nextInt();

		boolean restar = true;

		if (num1 < num2) {
			System.out.println("Números incorrectos.");
		} else {

			while (restar) {
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				num1 = num1 - num2;

				if (num1 < num2) {
					restar = false;
				}
			}

		}

		System.out.println("\nFin.");

	}

}
