package hoja03;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0;

		do {
			System.out.println("Escribe un número para ver su tabla de multiplicar: ");
			num = entrada.nextInt();

			if (num > 0) {
				System.out.println("La tabla del " + num + ": ");
				for (int i = 1; i <= 10; i++) {
					System.out.println(i + " * " + num + " = " + (i * num));
				}
			} else if (num == 0) {
				System.out.println("Fin del programa.");
				break;
			}
		} while (true);
	}
}
