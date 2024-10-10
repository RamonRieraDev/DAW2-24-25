package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
// Desarrolla modularmente (usando tres métodos, además de main( )) un programa
// que solicite por consola una lista de números enteros, los ordene
// y los muestre en pantalla.
	public static void main(String[] args) {

		int numeros[] = new int[4];
		
		pedirNumeros(numeros);
		
		ordenarNumeros(numeros);
		
		MostrarNumeros(numeros);

	}

	static void pedirNumeros(int[] numeros) {
		
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Escribe números en el array: ");
			numeros[i] = entrada.nextInt();
		}
		
	}
	
	static void ordenarNumeros(int[] numeros) {
		
		int aux;
		int posMin;
		
		for (int i = 0; i < numeros.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if(numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}
			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;
		}
		
	}
	
	static void MostrarNumeros(int[] numeros) {
		
		System.out.println(Arrays.toString(numeros));
		
	}
	
}
