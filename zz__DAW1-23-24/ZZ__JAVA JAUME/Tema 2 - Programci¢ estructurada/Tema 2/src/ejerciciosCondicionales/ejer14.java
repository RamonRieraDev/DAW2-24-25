package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el número de un mes y te diré cuantos "
				+ "dias tiene:");
		int mes = entrada.nextInt();

		switch (mes) {

		case 1:
			System.out.println("Tiene 31.");
			break;
		case 2:
			System.out.println("Tiene 28.");
			break;
		case 3:
			System.out.println("Tiene 31.");
			break;
		case 4:
			System.out.println("Tiene 30.");
			break;
		case 5:
			System.out.println("Tiene 31.");
			break;
		case 6:
			System.out.println("Tiene 30.");
			break;
		case 7:
			System.out.println("Tiene 31.");
			break;
		case 8:
			System.out.println("Tiene 31.");
			break;
		case 9:
			System.out.println("Tiene 30.");
			break;
		case 10:
			System.out.println("Tiene 31.");
			break;
		case 11:
			System.out.println("Tiene 30.");
			break;
		case 12:
			System.out.println("Tiene 31.");
			break;
		default:
			System.out.println("Número no válido.");

		}

	}

}
