package ejerciciosProgramacion3;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;

		int i = 1;

		int x = (int) (Math.random() * 10 + 1);

		System.out.println("El número secreto es: " + x + ".");
		System.out.print("Adivina el número secreto entre 1 y el 10: ");
		numero = entrada.nextInt();

		while (numero >= 1 && numero <= 10 && i <= 3) {

			if (numero == x) {
				System.out.println("Acertaste. Lo has conseguido en " + i + " intentos.");
				break;
			}
			System.out.print("Adivina el número secreto entre 1 y el 10: ");
			numero = entrada.nextInt();
			i++;
		}
	}
}
