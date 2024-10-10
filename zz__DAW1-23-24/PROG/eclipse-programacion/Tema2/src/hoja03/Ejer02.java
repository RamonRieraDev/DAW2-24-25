package hoja03;

import java.util.Scanner;

public class Ejer02 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean acierto = true;

		int num = 0;

		int numAleatorio = (int) (Math.random() * 10 + 1);

		System.out.println(numAleatorio);

		int i = 1;
		while (i < 4) {

			System.out.println("Escribe un número del 1 al 10: ");
			num = entrada.nextInt();

			if (numAleatorio == num) {
				acierto = true;
				System.out.println("Has acertado haciendo " + i + " intentos.");
				if (i == 1) {
					System.out.println("Has recibido 10 puntos");
				}else if (i == 2) {
						System.out.println("Has recibido 5 puntos");
				}else if (i == 3) {
					System.out.println("Has recibido 2 puntos");
				}
				break;
			}

			else if (numAleatorio != num) {
				acierto = false;
				System.out.println("Has fallado.");
			}

			i++;
		}

		if (numAleatorio != num) {
			acierto = false;
			System.out.println("Has fallado haciendo " + (i - 1) + " intentos.");

		}

	}
}
