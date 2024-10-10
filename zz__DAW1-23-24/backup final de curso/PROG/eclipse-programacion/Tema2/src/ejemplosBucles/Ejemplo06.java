package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {

		// Programa que vaya pidiendo nombres de personas al usuario.
		// Cuando el usuario escriba "Pepe" el programa responderá con
		// "ese nombre no me gusta" y terminará.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ve introduciendo los nobres: ");

		String nombre = entrada.nextLine();
		
		while (!nombre.equals("Pepe")) {
			System.out.println("Introduce otro nombre: ");
			nombre = entrada.nextLine();
		}

		System.out.println("\nEse nombre no me gusta.");

	}

}
