package ejerciciosProgramacion2;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		int i = 0;

		int x = (int) (Math.random() * 10 + 1);
		
		System.out.println("El número secreto es: " + x + ".");

		do {
			System.out.print("Adivina el número secreto entre 1 y el 10: ");
			numero = entrada.nextInt();
			i++;
			if (numero == x) {
				System.out.println("Acertaste.");
				
			}

		} while (i < 3 && numero != x);
		
	}
}
