package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio10 {
// Programa que lee una frase y nos dice por cuántas palabras está formada. Usa el
// método indexOf(int caracter, int posicion).
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase;
		int contarPalabras = 0;
		
		System.out.print("Escribe una frase: ");
		frase = entrada.nextLine();
		
		int posEspacio = frase.indexOf(' ', 0);

		// NO TENGO NI IDEA!!!!

		if (frase.indexOf(" ", 0) != -1) {
			for (int i = 1; i < posEspacio; i++) {

				contarPalabras++;
				posEspacio = frase.indexOf(' ', posEspacio + 1);
			}
		}
		System.out.println(contarPalabras);
	}

}
