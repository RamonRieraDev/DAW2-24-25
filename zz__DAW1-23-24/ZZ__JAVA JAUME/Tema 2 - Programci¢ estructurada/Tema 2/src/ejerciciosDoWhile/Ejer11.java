package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número entre el 1 y 20.");

		int num;
		
		do {

			System.out.println("¿Qué número es?");
			num = entrada.nextInt();

		} while (num < 1 || num > 20);

		System.out.println("El número escrito es: " + num);
	}

}
