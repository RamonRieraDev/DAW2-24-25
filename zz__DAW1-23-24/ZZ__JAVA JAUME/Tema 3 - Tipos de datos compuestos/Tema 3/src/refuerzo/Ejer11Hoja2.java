package refuerzo;

import java.util.Scanner;

public class Ejer11Hoja2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int edades[] = new int[10];

		for (int i = 0; i < edades.length; i++) {

			System.out.print("Alumno " + (i + 1) + ": ");
			edades[i] = entrada.nextInt();

		}

		int posMin;
		int aux;
		for (int i = 0; i < edades.length - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < edades.length; j++) {
				if (edades[j] < edades[posMin]) {
					posMin = j;
				}
				
			}
			aux = edades[posMin];
			edades[posMin] = edades[i];
			edades[i] = aux;
		}
		
		for (int i = 0; i < edades.length; i++) {
			
			System.out.println(edades[i]);
			
		}
	}

}
