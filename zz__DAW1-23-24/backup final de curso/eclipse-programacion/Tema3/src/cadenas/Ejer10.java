package cadenas;

import java.util.Scanner;

public class Ejer10 {
// Programa que lee una frase y nos dice por cuántas palabras está formada. Usa el
// método indexOf(int caracter, int posicion).

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");

		String frase = entrada.nextLine();

		int contadorPalabras = 1;
		int posEspacio = frase.indexOf(' ', 0);

		while (posEspacio != -1) {

			contadorPalabras++;
			posEspacio = frase.indexOf(' ', posEspacio + 1);
			
		}

		System.out.println(contadorPalabras);
	}

}
