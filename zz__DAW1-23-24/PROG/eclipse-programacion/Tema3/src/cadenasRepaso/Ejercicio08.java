package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio08 {
// Programa que lee una frase desde el teclado y nos muestra la primera palabra.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase;
		String palabra = "";

		System.out.print("Escribe una frase:");
		frase = entrada.nextLine();
		
		for (int i = 0; i < frase.indexOf(" "); i++) {
			palabra = palabra + frase.charAt(i);
		}
		System.out.println(palabra);
	}

}
