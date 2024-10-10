package ejercicios_apuntes;

import java.util.Scanner;

public class Ejer01b {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0;
		boolean esPrimo = true;

		while (true) {

			System.out.print("Introduce un número para saber si es primo o cumpuesto: ");
			num = entrada.nextInt();
			esPrimo = true;
			
			for (int i = 2; i < num - 1; i++) {

				if (num % i == 0) {
					esPrimo = false;
					break;
					
				}
				
			}

			if (esPrimo) {
				System.out.println("El número es primo.");

			} else {
				System.out.println("El número es compuesto");
			}
		}
	}
}
