package cadenas;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int posMax = 0;

		int aux = 0;

		System.out.print("Introduce una frase: ");
		String frase = entrada.nextLine();

		for (int i = frase.length() - 1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}
	}

}
