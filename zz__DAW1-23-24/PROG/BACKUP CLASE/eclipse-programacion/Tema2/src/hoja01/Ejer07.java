package hoja01;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner inNum = new Scanner(System.in);
		System.out.println("Introduzca un número del 1 al 10 para adivinar el número secreto: ");
		int num = inNum.nextInt();

		final int NUM_SEC = 7;
		if (num == NUM_SEC) {
			System.out.println("Felicidades! El número secreto es correcto.");
		} else {
			System.out.println("Has fallado! El número secreto es incorrecto.");
		}

	}

}
