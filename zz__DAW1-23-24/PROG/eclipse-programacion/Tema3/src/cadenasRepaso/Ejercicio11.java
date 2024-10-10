package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio11 {
// Programa que lee una frase y luego muestra las palabras sueltas (una en cada línea).
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase;

		System.out.println("Escribe una frase: ");
		frase = entrada.nextLine();

		int posEspacio = frase.indexOf(" ");
		int inicio = 0;

		while (posEspacio != -1) {

			System.out.println(frase.substring(inicio, posEspacio));

			inicio = posEspacio + 1;

			posEspacio = frase.indexOf(' ', inicio);

		}

		System.out.println(frase.substring(inicio));
	}
}
