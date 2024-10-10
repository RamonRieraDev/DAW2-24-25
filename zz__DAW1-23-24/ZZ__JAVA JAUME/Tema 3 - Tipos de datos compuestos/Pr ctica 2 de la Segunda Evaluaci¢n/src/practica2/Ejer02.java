package practica2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		//Declaración de variables.
		int numeros[] = new int[10];
		int posMin;
		int aux;

		System.out.println("Lista de números aleatorios enteros."
				+ "\n====================================");

		
		//Bucle para pedir los números en la consola y los guardamos en un array.
		for (int i = 0; i < numeros.length; i++) {

			System.out.print("Número generado " + (i + 1) + ": ");
			numeros[i] = entrada.nextInt();

		}
		
		
		//Usamos el algorítmo de la burbuja para ordenador los números del array de menor a mayor valor.
		//En el que, inicialmente, el primer FOR esta en la primera posición (0) y consecutivamente hasta 
		//llegar a la posición del más grande del array pero menos una posición, ya que las dos últimas 
		//posiciones del array ya quedarán colocadas.
		for (int i = 0; i < numeros.length - 1; i++) {
			posMin = i;
			
			//El siguiente FOR hace una pasada en todo el array entre la posición que hemos dado en el 
			//primer FOR más 1 para asegurarnos de que encontramos de manera segura el número más pequeño 
			//del array; pero cada vez que aumente el FOR que está por encima las pasadas que hará este FOR 
			//serán entre el último número que hemos colocado como el más pequeño y el final del array.
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}
			}

			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;
			
		}
		
		System.out.println("\n\nLista de números de menor a mayor."
				+ "\n==================================");

		
		//Imprimimos en la consola los valores del array.
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posición " + (i + 1) + ": " + numeros[i]);
		}

	}
}