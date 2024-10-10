package practica2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeroPedido;

		final int INICIO_BUCLE = 1;

		int contadorDivisores = 0;

		int calcularResto;

		System.out.println("===== NÚMEROS PRIMOS =====\n");
		System.out.println("Escribe un número entero y te diré si es primo:");

		while (INICIO_BUCLE == 1) {

//			Pedir un número al usuario, y repetir la pregunta las veces 
//			que sean necesarias hasta que escriba un número entero.

			if (entrada.hasNextInt()) {

				numeroPedido = entrada.nextInt();

//				Probar a dividir el número desde el 1 y él mismo. Cada vez que la división de 
//				de resto 0, se actualizará un contador de divisores. Contará el 1 y el propio 
//				número como divisores.

				for (int i = 1; i <= numeroPedido; i++) {

					calcularResto = numeroPedido % i;

					if (calcularResto == 0) {
						contadorDivisores++;
					}

				}

//			Si el número de divisores es 2, diremos que el número es primo. En caso contrario,
//			le diremos que es compuesto, e indicaremos cuántos divisores tiene.
				if (contadorDivisores == 2) {
					System.out.println("El número es primo.");
				} else {
					System.out.println("El número es compuesto, tiene " + contadorDivisores + " divisores.");
				}
				break;
			} else {
				System.out.println("Tienes que escribir un número entero, lelo.\n");
				entrada.nextLine();
			}
		}
	}

}