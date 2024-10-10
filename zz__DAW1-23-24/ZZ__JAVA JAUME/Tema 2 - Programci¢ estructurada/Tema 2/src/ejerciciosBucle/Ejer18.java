package ejerciciosBucle;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {

			System.out.print("Nota " + i + ": ");
			float nota = entrada.nextFloat();

			while (nota < 0 || nota > 10) {
				System.out.print("Nota " + i + ": ");
				nota = entrada.nextFloat();
			}

		}
		System.out.println("Bien hecho.");
	}

}
