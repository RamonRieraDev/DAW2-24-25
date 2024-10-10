package hoja02;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] nombres = new String[10];

		boolean nombreEncontrado = false;

		for (int i = 0; i < nombres.length; i++) {

			System.out.print("Introduce un nombre: ");
			nombres[i] = entrada.nextLine();

			if (nombres[i].equals("nadie")) {
				break;
			}

			if (nombres[i].equals("Calderón")) {
				nombreEncontrado = true;
			} else {
				nombreEncontrado = false;
			}
		}

		if (!nombreEncontrado) {
			System.out.println("No encontrado");
		} else {
			System.out.println("de la Barca.");
		}
	}

}
