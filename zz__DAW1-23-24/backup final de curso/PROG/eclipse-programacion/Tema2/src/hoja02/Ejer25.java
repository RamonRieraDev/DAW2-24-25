package hoja02;

import java.util.Scanner;

public class Ejer25 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num = 0;
		
		final int NUM_SECRETO = 6; 

		for (int i = 1; i <= 10; i++) {

			System.out.println("Escribe el número secreto: ");
			num = entrada.nextInt();

			if(num == NUM_SECRETO) {
				System.out.println("Felicidades.");
				break;
			}else {
				System.out.println("Has perdido.");
			}
		}
	}
}