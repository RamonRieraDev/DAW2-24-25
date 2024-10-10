package ejerciciosProgramacion3;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;

		int i = 1;

		int x = (int) (Math.random() * 10 + 1);

		System.out.println("El número secreto es: " + x + ".");
		System.out.print("Adivina el número secreto entre 1 y el 10: ");
		numero = entrada.nextInt();

		while (numero >= 1 && numero <= 10 && i <= 3) {

			if (numero == x && i == 1) {
				System.out.println("Acertaste. Lo has conseguido en " + i + " intento.\nRecibe 10 puntos");
				break;
			} else if (numero == x && i == 2) {
				System.out.println("Acertaste. Lo has conseguido en " + i + " intentos.\nRecibe 5 puntos");
				break;
			} else if (numero == x && i == 3) {
				System.out.println("Acertaste. Lo has conseguido en " + i + " intentos.\nRecibe 2 puntos");
				break;
			} else if (numero != x && i >= 3) {
				System.out.println("No has acertado. \nRecibe 0 puntos.");
				break;
			}
			System.out.print("Adivina el número secreto entre 1 y el 10: ");
			numero = entrada.nextInt();
			i++;
		}
	}
}
