package hoja01Repaso;

import java.util.Scanner;

public class Ejercicio08 {
// Modifica el programa anterior para que el programa pare de pedir notas si se le pasa un valor negativo.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] notas = new double[10];

		int i = 0;
		while (i < notas.length) {

			
			System.out.println("Introduce la nota " + (i + 1));
			notas[i] = entrada.nextDouble();
			if(notas[i] < 0) {
				break;
			}
			i++;
		}

		// System.out.println(Arrays.toString(notas));

		for (int j = 0; j < notas.length; j++) {
			System.out.println("La nota " + (j + 1) + " es: " + notas[j]);
		}
	}

}
