package ejercicios01;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String instrucciones[] = new String[1000];

		System.out.println("Introduce las instrucciones que debe realizar el robot.");
		for (int i = 0; i < instrucciones.length; i++) {

			System.out.print("Instrucción " + (i + 1) + ": ");
			instrucciones[i] = entrada.nextLine();

			if (instrucciones[i].equals("ejecutar")) {
				break;
			}
		}

		System.out.println("\nAcciones a realizar.\n=====================\n");
		for (int i = 0; i < instrucciones.length; i++) {

			if (instrucciones[i].equals("ejecutar")) {
				System.out.println("Proceso realizado.");
			} else {
				System.out.println("Instrucción " + (i + 1) + ": " + instrucciones[i] + ".");

			}

		}
	}
}
