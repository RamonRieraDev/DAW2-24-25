package ejercicios02;

import java.util.Arrays;

public class Ejer12b {

	public static void main(String[] args) {

		int numerosAtomicos[] = { 8, 2, 10, 20, 12, 71, 15, 23 };
		int posMin;
		int aux;

		for (int i = 0; i < numerosAtomicos.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < numerosAtomicos.length; j++) {
				if (numerosAtomicos[j] > numerosAtomicos[posMin]) {
					posMin = j;
				}
			}
			aux = numerosAtomicos[posMin];
			numerosAtomicos[posMin] = numerosAtomicos[i];
			numerosAtomicos[i] = aux;
		}

		System.out.println(Arrays.toString(numerosAtomicos));
		System.out.println("El número atómico máximo es: " + numerosAtomicos[0]);
		System.out.println("El número atómico mínimo es: " + numerosAtomicos[numerosAtomicos.length - 1]);
	}
}
