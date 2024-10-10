package ejercicios;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime un año: ");
		int anyo = entrada.nextInt();

		if (esBisiesto(anyo)) {
			System.out.println("Es bisiesto.");
		} else {
			System.out.println("No es bisiesto.");
		}

	}

	static boolean esBisiesto(int numero) {

		if ((numero % 4 == 0) && ((numero % 100 != 0) || (numero % 400 == 0))) {

			return true;
		} else {

			return false;

		}
	}

}
