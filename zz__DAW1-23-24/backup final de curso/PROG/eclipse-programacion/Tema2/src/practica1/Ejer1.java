package practica1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float tiempo = 0;
		float suma = 0;
		final int NUM_JUGADORES = 8;
		
		for (int i = 1; i <= 8; i++) {

			System.out.println("Introduzca el tiempo del jugador " + i);
			tiempo = entrada.nextInt();

			suma = suma + tiempo;

		}

		System.out.println("El tiempo total es: " + suma + " segundos");
		System.out.println("\nEl tiempo medio es: " + suma / NUM_JUGADORES
				+ " segundos");
	}

}
