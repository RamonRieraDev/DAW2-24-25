package hoja02;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] edades = new int[10];

		int aux = 0;

		for (int i = 0; i < edades.length; i++) {

			System.out.println("Introduce la edad del alumno número " + (i + 1));
			edades[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < edades.length; i++) {
			for (int j = 0; j < edades.length - 1; j++) {

				if (edades[j] > edades[j + 1]) {
					aux = edades[j];
					edades[j] = edades[j + 1];
					edades[j + 1] = aux;
				}
			}

		}
		for (int i = 0; i < edades.length; i++) {

			System.out.println(edades[i]);
		}
	}

}
