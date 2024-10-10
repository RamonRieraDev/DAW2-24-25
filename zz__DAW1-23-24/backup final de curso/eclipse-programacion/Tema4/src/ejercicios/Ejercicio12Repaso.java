package ejercicios;

import java.util.Arrays;

public class Ejercicio12Repaso {

	public static void main(String[] args) {

		int[] numeros = {9, 8 , 7, 6, 5};
		
		ordenar(numeros);

	}
	
	static void ordenar(int[] numeros) {
		int posMin;
		int aux = 0;
		
		for (int i = 0; i < numeros.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if(numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}
			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;
		}
		System.out.println("El array ordenado: " + Arrays.toString(numeros));
	}

}
