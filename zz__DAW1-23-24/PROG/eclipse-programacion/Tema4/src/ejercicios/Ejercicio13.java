package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {
// Modifica la actividad anterior para que el método devuelva el array ordenado.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeros[] = new int[4];

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Escribe números en el array: ");
			numeros[i] = entrada.nextInt();
		}

		System.out.println(ordenarArray(numeros));

	}

	static int[] ordenarArray(int[] numeros) {

		int aux;
		int posMin;

		// int numeros[] = new int[4];

		for (int i = 0; i < numeros.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}

			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;
		}

		return numeros;

	}

}
