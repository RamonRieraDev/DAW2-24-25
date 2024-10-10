package ejercicios01;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double notas[] = new double[10];
		int i = 0;
		int j = 0;

		while (i < notas.length) {

			if (notas[i] < -1) {
				break;
			} else {
				System.out.print("Nota " + (i + 1) + ": ");
				notas[i] = entrada.nextDouble();
				i++;
			}

		}

		System.out.println("\n" + "NOTAS GUARDADAS\n========================");

		while (j < notas.length) {
			System.out.println("La nota " + (j + 1) + " es: " + notas[j]);
			j++;
		}

	}

}