package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime una palabra y te la escribiré 10 veces: ");
		String palabra = entrada.nextLine();

		// Bucle while
		System.out.println("\n- Bucle WHILE:");
		int i = 1;
		while (i <= 10) {
			System.out.println(i + " - " + palabra);
			i++;
		}

		// Bucle for
		// for (inicialización; condición; actualización)
		System.out.println("\n- Bucle FOR:");
		
		// Declaramos una variable contador j y la inicializamos con 
		// el valor 1. Mientras j<=10 el bucle se repetirá.
		// En cada vuelta del bucle la j aumentará 1.
		for (int j = 1; j <= 10; j++) {

			System.out.println(j + " - " + palabra);

		}

	}

}
