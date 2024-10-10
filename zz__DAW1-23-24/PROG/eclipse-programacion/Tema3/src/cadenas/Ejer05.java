package cadenas;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		String frase = entrada.nextLine();

		int contador = 1;

		
		
		for (int i = 1; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ' && frase.charAt(i + 1) != ' ') {
				contador++;
			} 
			
		}

		System.out.println(contador);
	}

}
