package hoja01;

import java.util.Scanner;

// Programa que muestre en pantalla los 100 primeros números
// primos por pantalla.
public class EjerPrimos3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numPrimos = 0;
		
		for (int num = 1; num <= 1000 && numPrimos <= 100; num++) {

			boolean esPrimo = true;

			for (int i = 2; i <= num / 2; i++) {

				if (num % i == 0) {
					esPrimo = false;
					break;
				}
			}

			if (esPrimo) {
				System.out.println(numPrimos + ") " + num);
				numPrimos++;
			}
		}
	}
}