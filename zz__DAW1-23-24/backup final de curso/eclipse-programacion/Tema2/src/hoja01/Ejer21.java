package hoja01;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("SALUDO");

		System.out.println("Introce en qué idioma quieres el saludo:\n");
		System.out.println("1) Francés\n");
		System.out.println("2) Inglés\n");
		System.out.println("3) Alemán\n");
		System.out.println("4) Italiano\n");

		int saludo = entrada.nextInt();

		switch (saludo) {

		case 1:
			System.out.println("Salut.");
			break;

		case 2:
			System.out.println("Hello.");
			break;

		case 3:
			System.out.println("Hallo.");
			break;

		case 4:
			System.out.println("Ciao");
			break;

		default:
			System.out.println("Hola.");

		}
	}

}
