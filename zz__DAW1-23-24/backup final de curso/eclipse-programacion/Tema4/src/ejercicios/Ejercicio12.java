package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 {
// Desarrolla un método que tome un array de números enteros y lo muestre ordenado.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeros[] = new int[4];
		
		for (int i = 0; i < numeros.length; i++) {
		
			System.out.println("Escribe números en el array: ");
			numeros[i] = entrada.nextInt();
		}
		
		ordenarArray(numeros);

	}

	static void ordenarArray(int[] numeros) {

		int aux; 
		
		int posMin;
		
		//int numeros[] = new int[4];
		
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

		System.out.println(Arrays.toString(numeros));
		
	}
}