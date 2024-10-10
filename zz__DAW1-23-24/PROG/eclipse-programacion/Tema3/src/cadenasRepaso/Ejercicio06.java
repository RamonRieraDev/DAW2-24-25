package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio06 {
// Programa que pide una frase y dos letras. A continuación muestra la frase sustituyendo
// la primera letra por la segunda.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String frase;
		String letra1;
		String letra2;
		
		System.out.print("Escribe una frase: ");
		frase = entrada.nextLine();
		
		System.out.print("Escribe la letra que quieres sustituir de la frase: ");
		letra1 = entrada.nextLine();
		
		System.out.print("Escribe la letra para sustituir la anterior letra: ");
		letra2 = entrada.nextLine();
		
		System.out.println(frase.replace(letra1, letra2));

	}

}
