package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15Repaso {

	public static void main(String[] args) {

		int[] numeros = new int[5];
		
		leerNumeros(numeros);
		
		ordenar(numeros);

	}

	static void leerNumeros(int[] numeros) {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número:");
			numeros[i] = entrada.nextInt();
		}
	
	}
	
	static void ordenar(int[] numeros) {
		int aux = 0;
		int posMin;
		
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
		
		System.out.println(Arrays.toString(numeros));
	}
}
