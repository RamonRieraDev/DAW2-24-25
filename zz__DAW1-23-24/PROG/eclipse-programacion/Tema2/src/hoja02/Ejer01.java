package hoja02;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca un caracter: ");

		String caracter = entrada.nextLine();

		int cont = 1;

		while (cont <= 100) {

			System.out.println(caracter);
			cont++;

		}

	}
}
