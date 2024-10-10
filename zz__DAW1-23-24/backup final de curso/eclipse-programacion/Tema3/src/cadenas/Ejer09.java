 package cadenas;

import java.util.Scanner;

public class Ejer09 {
// Programa que lee una frase desde el teclado y la muestra 
// quitando la primera palabra.
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		String palabra = "";

		//int espacio = frase.indexOf(" ");
		
		if (frase.indexOf(" ") != -1) {

			for (int i = frase.indexOf(" ") + 1; i < frase.length(); i++) {

				//if (frase.charAt(i) != ' ') {
					palabra = palabra + frase.charAt(i);
				//} else {
					//break;
			//	}
			}

			System.out.println(palabra);
		}
		
	}

}
