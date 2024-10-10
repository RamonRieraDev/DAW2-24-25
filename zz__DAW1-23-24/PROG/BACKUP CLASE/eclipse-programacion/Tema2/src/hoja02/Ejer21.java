package hoja02;

import java.util.Scanner;

public class Ejer21 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0;
		
		for (int i = 1; i <= 5; i++) {

			System.out.println("Introduce un número entero: ");
			num = entrada.nextInt();

		}
		System.out.println("Has fallado.");
	}

}
