package cadenas;

import java.util.Scanner;

public class Ejer17 {
// Programa que lee una frase desde el teclado y la muestra 
// quitando la última palabra.
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		String[] palabras = frase.split(" ");

		System.out.println("Frase descompuesta por palabras sueltas menos" + " la útima: ");
		for (int i = 0; i <= palabras.length - 2; i++) {
			System.out.print(palabras[i] + " ");
		}
	}
}
