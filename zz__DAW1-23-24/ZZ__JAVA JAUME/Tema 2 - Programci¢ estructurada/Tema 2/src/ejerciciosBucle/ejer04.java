package ejerciciosBucle;

import java.util.Scanner;

public class ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean preguntar = true;

		while (preguntar) {

			System.out.println("Escribe un número del 1 al 5: ");
			int numero = entrada.nextInt();

			if (numero == 3) {
				
				System.out.println("Felicidades, has acertado.");
				preguntar = false;

			} else if (numero >= 1 && numero <= 5) {
				
				System.out.println("Vuelve a intentarlo.");

			} else {
				
				System.out.println("Tiene que ser un número entre 1 y 5.");
			}
		}

	}
}
