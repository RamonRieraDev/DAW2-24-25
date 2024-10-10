package cadenas;

import java.util.Scanner;

// Variante en la que descartamos los espacios que pueda haber al
// principio de la frase.
public class Ejer04b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe una frase: ");
		String frase = entrada.nextLine();

		boolean leyendoPalabra = false;

		for (int i = 0; i < frase.length(); i++) {

			// Primero detectamos el inicio de palabra.
			if (frase.charAt(i) != ' ') {
				leyendoPalabra = true;
				System.out.print(frase.charAt(i));
			} else if (frase.charAt(i) == ' ' && leyendoPalabra == true) {
				break;
			}

		}

	}

}
