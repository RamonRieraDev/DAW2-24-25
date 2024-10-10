package ejercicios02;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombres[] = new String[10];
		String nombre;

		boolean nombreEncontrado = false;

		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Nombre " + (i + 1) + ": ");
			nombre = entrada.nextLine();
			nombres[i] = nombre;
			if (nombre.equals("nadie")) {
				break;
			}

		}

		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i] == null) {
				break;
			} else if (nombres[i].equals("Calderón")) {
				nombreEncontrado = true;
				break;
			}
		}

		if (nombreEncontrado) {
			System.out.println("de la Barca");
		} else {
			System.out.println("Nombre no encontrado");
		}
	}
}
