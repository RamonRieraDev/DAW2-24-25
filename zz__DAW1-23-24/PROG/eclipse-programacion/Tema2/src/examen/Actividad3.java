package examen;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numRandom = (int) (Math.random() * 7 + 1);
		int num = 0;
		int i = 1;

		System.out.println("¡Adivina en qué número entre 1 y 7 estoy pensando!");
		System.out.println("(" + numRandom + ")");
		System.out.println(" ");

		while (i <= 3) {
			System.out.print("Número:");
			num = entrada.nextInt();

			if (num > numRandom) {
				System.out.println("Te has pasado.");
			} else if (num < numRandom) {
				System.out.println("Te has quedado corto.");
			} else if (num == numRandom) {
				System.out.println(" ");
				System.out.println("¡Acertaste!");
				break;
			}
			i++;
		}
		if (num != numRandom) {
			System.out.println(" ");
			System.out.println("Has fallado, el número era " + numRandom);
		} else {
			System.out.println(" ");
		}
	}
}
