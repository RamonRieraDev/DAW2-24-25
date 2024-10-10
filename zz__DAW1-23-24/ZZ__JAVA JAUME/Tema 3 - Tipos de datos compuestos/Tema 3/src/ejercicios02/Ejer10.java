package ejercicios02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float temperaturas[] = new float[8];
		int posMin;
		float aux;

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Temperatura " + (i + 1) + ": ");
			temperaturas[i] = entrada.nextFloat();
		}
		
		System.out.println(Arrays.toString(temperaturas));
		System.out.println("\n");
		
		for (int i = 0; i < temperaturas.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < temperaturas.length; j++) {
				if (temperaturas[j] < temperaturas[posMin]) {
					posMin = j;
				}
			}

			aux = temperaturas[posMin];
			temperaturas[posMin] = temperaturas[i];
			temperaturas[i] = aux;
			
			System.out.println(Arrays.toString(temperaturas));
		}
		System.out.println();
		System.out.println(Arrays.toString(temperaturas));

		System.out.print("\nTemperatura mínima: " + temperaturas[0]);
		System.out.print("\nTemperatura máxima: " + temperaturas[temperaturas.length -1]);

		
	}

}
