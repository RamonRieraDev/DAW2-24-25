package ejercicios;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Primer número entero es: ");
		int num1 = entrada.nextInt();
		System.out.print("Segundo número entero es: ");
		int num2 = entrada.nextInt();

		max(num1, num2);
		min(num1, num2);

		System.out.println(
				"El número mayor es " + max(num1, num2) + " y el número menor" 
		+ " es " + min(num1, num2) + ".");

	}

	static int max(int x, int y) {

		if (x > y) {

			return x;
		} else {
			return y;
		}
	}

	static int min(int x, int y) {

		if (x < y) {
			return x;
		} else {
			return y;
		}
	}
}
