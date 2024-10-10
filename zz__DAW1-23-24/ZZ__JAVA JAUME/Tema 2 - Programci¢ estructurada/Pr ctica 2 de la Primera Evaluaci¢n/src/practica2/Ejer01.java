package practica2;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int NUMERO_ATOMICO_HIERRO = 26;

		int numeroPedido;

		final int INICIO_BUCLE = 1;

		System.out.println("       ¡JUGUEMOS CON QUÍMICA!\n");

		while (INICIO_BUCLE == 1) {

			System.out.println("¿Cuál es el número atómico del hierro?");

			if (entrada.hasNextInt() == true) {

				numeroPedido = entrada.nextInt();

				if (numeroPedido == NUMERO_ATOMICO_HIERRO) {
					System.out.println("\n¡Acertaste!");
					break;
				} else {
					System.out.println("¡Prueba otra vez!\n");

				}
				entrada.nextLine();

			} else {
				System.out.println("¡Debes escribir un número entero!\n");
				entrada.nextLine();
			}


		}

	}
}