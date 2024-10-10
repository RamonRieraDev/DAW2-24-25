
package ejerciciosProgramacion3;

import java.util.Scanner;

public class Ejer06 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		int contador = 0;

		do {

			System.out.print("Dime un número y te diré su tabla de multiplicar: ");
			numero = entrada.nextInt();

			if (numero == 1) {
				System.out.println("No seas tonto.");
			} else {
				for (int j = 0; j <= 10; j++) {
					System.out.println(j + " x " + numero + " = " + numero * j);
				}
			}

		} while (contador != numero);
		System.out.println("El programa ha terminado.");

	}
}