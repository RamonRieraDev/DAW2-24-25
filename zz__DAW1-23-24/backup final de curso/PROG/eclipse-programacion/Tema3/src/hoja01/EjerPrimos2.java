package hoja01;

import java.util.Scanner;

// Programa que muestre en pantalla los números primos
// que haya dede 2 hasta 1000.
public class EjerPrimos2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		for (int num = 1; num <= 1000; num++) {

			boolean esPrimo = true;

			for (int i = 2; i <= num / 2; i++) {

				if (num % i == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				System.out.println(num);
			}
		}
	}
}
		