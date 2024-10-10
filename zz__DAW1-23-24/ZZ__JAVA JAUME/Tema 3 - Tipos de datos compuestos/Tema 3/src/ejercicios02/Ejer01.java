package ejercicios02;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int anyos[] = { 29, 25, 30, 35, 28, 49, 42, 30, 29, 28, 21, 60, 55, 20, 19 };

		boolean edadEncontrada = false;

		for (int i = 0; i < anyos.length; i++) {

			if (anyos[i] == 35) {
				edadEncontrada = true;
				break;
			}
		}
		if (edadEncontrada) {
			System.out.println("Se ha encontrado a la persona.");
		} else {
			System.out.println("No se ha encontrado a la persona.");
		}
	}

}