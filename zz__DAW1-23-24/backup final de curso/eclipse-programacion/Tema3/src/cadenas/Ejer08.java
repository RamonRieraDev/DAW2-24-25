package cadenas;

import java.util.Scanner;

public class Ejer08 {
// Programa que lee una frase desde el teclado y nos muestra la primera palabra.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		String palabra = "";

		// Buscamos el primer espacio en el texto. Nos aseguramos 
		// que ahí está la primera palabra, antes del primer espacio:
		// Como .indexOf() si no está la palabra devuelve -1 por eso
		// se pone != -1 y así se sabe que sí está (doble negación):
		if (frase.indexOf(" ") != -1) {

			// Recorremos la frase:
			for (int i = 0; i < frase.length(); i++) {

				// Recorremos cada char hasta el primer espacio, donde
				// está la primera palabra:
				if (frase.charAt(i) != ' ') {
					// Guardamos char a char:
					palabra = palabra + frase.charAt(i);
				} else {
					break;
				}
			}

			System.out.println(palabra);
		}
	}
}
