package hoja03;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] precio = new double[50];

		final double MAYOR50 = 50;

		double suma = 0;

		double sumaTotal = 0;

		System.out.println("Caja registradora");
		System.out.println("===========================");

		for (int i = 0; i < precio.length; i++) {

			System.out.println("Precio " + i + ":");
			precio[i] = entrada.nextDouble();

			if (precio[i] < 0) {
				break;
			}

		}
		System.out.println();
		System.out.println("Ticket de la compra");

		for (int i = 0; i < precio.length && precio[i] > 0; i++) {

			if (suma > MAYOR50) {
				precio[i] = precio[i] - (precio[i] * 0.1);
			}
			
			suma = suma + precio[i];
			
			System.out.println(precio[i]);

			sumaTotal = sumaTotal + precio[i];
		}
		System.out.println();
		System.out.println("Total a pagar: " + sumaTotal + " €.");
		System.out.println("Gracias por la compra.");
	}

}
