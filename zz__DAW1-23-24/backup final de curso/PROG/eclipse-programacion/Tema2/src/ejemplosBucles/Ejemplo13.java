package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo13 {

	public static void main(String[] args) {

		// Programa que calcule el resto de una división entre enteros con el
		// procedimiento de ir restando repetidamente el divisor del dividendo
		// hasta que el resultado es menor que el divisor.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el primer número de la división: ");
		int dividendo = entrada.nextInt();

		System.out.println("Ingrese el segundo número de la división: ");
		int divisor = entrada.nextInt();

		int res = 0;

		if (dividendo < divisor) {

			System.out.println("El resultado debe ser mayor o igual al divisor");

		} else {

			// Variable semáforo.

			boolean continuarDividiendo = true;

			while (continuarDividiendo) {

				res = dividendo - divisor;

				System.out.println(dividendo + " - " + divisor + " = " + res);

				dividendo = res;

				if (res < divisor) {
					continuarDividiendo = false;
				}

			}

			System.out.println("El resto es: " + res);

		}
	}
}
