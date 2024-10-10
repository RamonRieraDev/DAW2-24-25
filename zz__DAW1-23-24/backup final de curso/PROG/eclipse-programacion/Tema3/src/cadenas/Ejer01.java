package cadenas;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce la palabra: ");
		String palabra = entrada.nextLine();

		int longitud = palabra.length();

		System.out.println("La palabra tiene " + longitud + " letras");
	}
}
