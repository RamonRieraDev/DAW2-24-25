package ejerciciosBucle;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero;

		for (int i = 1; i <= 10; i++) {

			System.out.print("Acierta el número secreto: ");
			numero = entrada.nextInt();

			if (numero == 6) {
				System.out.println("Felicidades.");
				numero = entrada.nextInt();
				break;
			}
			
		}
		System.out.println("Has perdido.");

	}

}
