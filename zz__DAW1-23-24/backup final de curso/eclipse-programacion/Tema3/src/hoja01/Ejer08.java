package hoja01;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double notas[] = new double[10];

		int i = 0;

		while (i < notas.length) {
			System.out.println("Introduce la nota " + (i + 1) + " :");
			notas[i] = entrada.nextDouble();
			if (notas[i] < 0) {
				System.out.println("Has introducido un valor negativo. Fin del programa.");
				break;
			}
			i++;
		}

		i = 0;

		while (i < notas.length) {
			if (notas[i] < 0) {
				break;
			}
			System.out.println("La nota " + (i + 1) + " es: " + notas[i]);
			i++;
		}

	}

}
