package cadenas;

import java.util.Scanner;

public class Ejer18 {
// Coger una cadena y poner la primera letra de cada
// palabra en mayúsculas.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		String[] palabras = frase.split(" ");

		String primeraLetra;
		String restoPalabra;
		String palabraMayuscula;
		String fraseCompleta = " ";
		
		for (int i = 0; i < palabras.length; i++) {
			primeraLetra = "" + palabras[i].toUpperCase().charAt(0);
			restoPalabra = palabras[i].substring(1).toLowerCase();
			palabraMayuscula = primeraLetra + restoPalabra;
			System.out.println("Primera letra de la palabra " + (i + 1) + " en mayúscula: " + palabraMayuscula);
			fraseCompleta = fraseCompleta + palabraMayuscula + " ";
		}
		System.out.println("Frase completa: " + fraseCompleta);
	}
}
