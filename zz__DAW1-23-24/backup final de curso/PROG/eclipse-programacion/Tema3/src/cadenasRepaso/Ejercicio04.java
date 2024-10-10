package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio04 {
// Programa que pide una frase y luego muestra la primera palabra
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String frase;
		
		System.out.print("Escribe una frase: ");
		frase = entrada.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			System.out.print(frase.charAt(i));
			if (frase.charAt(i) == ' ') {
				break;
			}
		}
		
	}

}
