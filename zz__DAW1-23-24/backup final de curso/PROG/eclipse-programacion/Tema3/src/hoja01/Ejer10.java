package hoja01;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double compra[] = new double[100];

		for (int i = 1; i < compra.length; i++) {
			System.out.print("Introduce el precio del producto " + i + ": ");
			compra[i] = entrada.nextDouble();
			if (compra[i] == 0) {
				System.out.println("Fin del programa");
				break;
			}
		}

		for (int i = 1; i < compra.length; i++) {
			if (compra[i] == 0) {
				break;
			}
			System.out.println("El producto " + i + " cuesta: " + compra[i]);
		}

	}
}
