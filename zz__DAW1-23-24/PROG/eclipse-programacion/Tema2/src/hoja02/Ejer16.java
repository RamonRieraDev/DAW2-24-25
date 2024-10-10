package hoja02;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;
		
		int random = (int) (10 * Math.random() + 1);
		
		int i = 0;
		do {

			System.out.println("Adivina el número: ");
			num = entrada.nextInt();
			System.out.println("Fallaste!");
			i++;
			
		} while (num != random && i < 3);

		if (random == num) {
			
			System.out.println("Acertaste!");
			
		}else {
			System.out.println("El número era: " + random);
		}
		
	}

}
