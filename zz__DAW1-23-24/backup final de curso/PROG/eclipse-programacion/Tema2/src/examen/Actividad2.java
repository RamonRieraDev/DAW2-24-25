package examen;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;

		System.out.println("***** Cálculo del máximo *****");
		System.out.println(" ");

		while (true) {
			System.out.print("Dime el primer número: ");
			num1 = entrada.nextInt();

			System.out.print("Dime el segundo número: ");
			num2 = entrada.nextInt();

			if (num1 > num2) {
				System.out.println("El mayor es " + num1);
			} else if (num1 < num2) {
				System.out.println("El mayor es " + num2);
			} else if (num1 == num2) {
				System.out.println("Los dos números son iguales.");
			}
			System.out.println(" ");
		}
	}

}
