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

		if (frase.indexOf(" ") != -1) {
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) != ' ') {
					palabra = palabra + frase.charAt(i);
				}else {
					break;
				}
			}
		}
		System.out.println(palabra);
	}

}
