package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio02 {
// Programa que lea una contraseña y valide si cumple con una longitud 
// mínima de 6 y máxima de 12.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String contrasena;

		System.out.print("Introduce la contraseña: ");
		contrasena = entrada.nextLine();

		if (contrasena.length() < 6) {
			System.out.println("La contraseña es inválida. Tiene menos de "
					+ "6 caracteres.");
		}

		if (contrasena.length() > 12) {
			System.out.println("La contraseña es inválida. Tiene más de "
					+ "12 caracteres.");
		}
		
		if (contrasena.length() >= 6 && contrasena.length() <= 12) {
			System.out.println("La contraseña es válida.");
		}
	}

}
