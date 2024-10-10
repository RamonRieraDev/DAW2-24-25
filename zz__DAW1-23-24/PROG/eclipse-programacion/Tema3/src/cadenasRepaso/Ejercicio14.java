package cadenasRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] palabra = new String[5];

		int posMin = 0;
		String aux = "";

		for (int i = 0; i < palabra.length; i++) {

			System.out.println("Escribe la palabra número " + (i + 1) + " :");
			palabra[i] = entrada.nextLine();

		}

		for (int i = 0; i < palabra.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < palabra.length; j++) {
				if (palabra[j].compareTo(palabra[posMin]) < 0) {
					posMin = j;
				}
			}
			aux = palabra[posMin];
			palabra[posMin] = palabra[i];
			palabra[i] = aux;
		}
		
		System.out.println(Arrays.toString(palabra));
	}

}
