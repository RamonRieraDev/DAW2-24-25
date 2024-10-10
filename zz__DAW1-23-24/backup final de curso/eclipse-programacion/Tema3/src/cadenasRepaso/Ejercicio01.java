package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio01 {
// Programa que lea una palabra desde la terminal y 
// te diga cuántas letras tiene.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String palabra;
		
		System.out.print("Escribe una palabra: ");
		palabra = entrada.nextLine();
		
		System.out.println("La palabra " + palabra + " tiene " 
		+ palabra.length() + " letras.");
		
	}

}
