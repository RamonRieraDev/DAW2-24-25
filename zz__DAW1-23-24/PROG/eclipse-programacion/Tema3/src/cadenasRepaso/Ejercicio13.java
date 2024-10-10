package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio13 {
// Programa que te pide cinco palabras y te dice cuál es la que va primero, 
// alfabéticamente.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String[] palabra = new String[5];
		
		int posMin = 0;
		
		for (int i = 0; i < palabra.length; i++) {
			
			System.out.println("Escribe la palabra número " + (i + 1) + " :");
			palabra[i] = entrada.nextLine();
			
			if(palabra[i].compareTo(palabra[posMin]) < 0) {
				posMin = i;
			}
		}
		
		System.out.println(palabra[posMin]);
		
//		for (int i = 0; i < palabra.length; i++) {
//			
//		}

	}

}
