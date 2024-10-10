package hoja02;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] estaturas = new double[20];

		int i = 0;

		for (i = 0; i < estaturas.length; i++) {

			System.out.print("Introduce la altura en metros de la persona " + (i + 1) + ": ");
			estaturas[i] = entrada.nextDouble();

		}

		for (i = 0; i < estaturas.length; i++) {

			if (estaturas[i] > 1.90) {
				System.out.print("Se ha encontrado una persona mayor de 1.90");
				break;

			}
		}
	}
}
