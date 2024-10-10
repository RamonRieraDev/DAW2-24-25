package hoja01;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double notas[] = new double[10];

		int i = 0;

		while (i < notas.length) {
			System.out.print("Introduce la nota " + (i + 1) + " :");
			notas[i] = entrada.nextDouble();
			i++;
		}

		i = 0;

		System.out.println("Las notas son: ");

		while (i < notas.length) {
			System.out.println("La nota " + (i + 1) + " es: " + notas[i]);
			i++;
		}
	}
}
