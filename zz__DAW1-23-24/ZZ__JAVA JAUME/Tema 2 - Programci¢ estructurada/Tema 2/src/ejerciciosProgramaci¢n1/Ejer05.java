package ejerciciosProgramación1;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige el idioma que quieras:\n" + "(1) Francés\r\n" + "(2) Inglés\r\n" + "(3) Alemán\r\n"
				+ "(4) Italiano");

		int numero = entrada.nextInt();

		switch (numero) {
		case 1:
			System.out.println("Bonjour.");
			break;
		case 2:
			System.out.println("Good Morning.");
			break;
		case 3:
			System.out.println("Hallo.");
			break;
		case 4:
			System.out.println("Buon giorno.");
			break;
		default:
			System.out.println("Buenos días.");

		}
	}
}
