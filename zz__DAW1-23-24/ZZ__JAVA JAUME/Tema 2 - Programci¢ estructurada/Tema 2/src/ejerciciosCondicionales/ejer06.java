package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime el precio del producto: ");
		float precio = entrada.nextFloat();

		System.out.print("Dime cuántas unidades son: ");
		int unidades = entrada.nextInt();

		float coste = precio * unidades;
		float precioFinal = coste;

		if (coste > 75) {

			System.out.println("Tiene un descuento de un 15%.");
			precioFinal = coste * 0.85F;

		} else {

			precioFinal = coste * 0.95F;
			System.out.println("Tiene un descuento de un 5%.");

		}
		System.out.println("Gracias por venir.");

	}
}
