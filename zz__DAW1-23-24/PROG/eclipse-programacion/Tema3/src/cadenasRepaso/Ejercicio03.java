package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio03 {
// Programa que pide una frase y luego la muestra del revés (letra a letra)
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe una frase: ");
		String frase = entrada.nextLine();
		
		for (int i = frase.length() - 1; i >= 0 ; i--) {
			
			System.out.println(frase.charAt(i));
			
		}
		
	}

}
