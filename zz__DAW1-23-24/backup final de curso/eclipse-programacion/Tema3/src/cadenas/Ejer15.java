package cadenas;

import java.util.Arrays;

public class Ejer15 {

	public static void main(String[] args) {

		String frase = "Bien hecho es mejor que bien dicho";

		String[] palabras = frase.split(" ");

		System.out.println("Frase descompuesta en palabras sueltas:");

		System.out.println("");
		
		for (int i = 0; i < palabras.length; i++) {

			System.out.println(palabras[i]);
		}
		
		System.out.println("");
		
		for (int i = palabras.length - 1; i >= 0; i--) {

			// posMin = i;
			System.out.println(palabras[i]);
			

		}
		
	}

}
