package hoja02;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0;

		for (int i = 0; i <= 5; i++) {
			System.out.println("\nIntroduce el número para ver su tabla de " + "multiplicar:");
			num = entrada.nextInt();

			if (num == 1) {
				System.out.println("\n¡No seas tonto!");
				continue;
			}

			System.out.println("\nTABLA DEL " + num + ":");

			for (int j = 0; j <= 10; j++) {
				System.out.println(num + " * " + j + " = " + num * j);
			}
		}

		System.out.println("\nPrograma acabado.");

	}

}