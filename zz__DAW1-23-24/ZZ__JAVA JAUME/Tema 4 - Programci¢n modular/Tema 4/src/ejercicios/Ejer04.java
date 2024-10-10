package ejercicios;

import java.util.Arrays;

public class Ejer04 {

	public static void main(String[] args) {

		int listaNum[] = { 2, 4, 6, 3, 1, 9, 10, 8, 5, 7 };

		ordenarNumeros(listaNum);

	}

	static void ordenarNumeros(int numeros[]) {

		int posMin = 0;
		int aux = 0;

		for (int i = 0; i < numeros.length - 1; i++) {

			posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[posMin] > numeros[j]) {
					posMin = j;
				}
			}

			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;

		}
		System.out.println(Arrays.toString(numeros));

		
	}

}
