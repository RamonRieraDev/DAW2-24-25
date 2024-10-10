package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime un número entero entre el 1 y el 10: ");

		if (entrada.hasNextInt() == true) {
			int numero = entrada.nextInt();

			System.out.println("Número correcto." + numero + ".");
		} else {
			System.out.println("Número incorrecto.");
		}
		System.out.println("Gracias por intentarlo.");

	}

}
