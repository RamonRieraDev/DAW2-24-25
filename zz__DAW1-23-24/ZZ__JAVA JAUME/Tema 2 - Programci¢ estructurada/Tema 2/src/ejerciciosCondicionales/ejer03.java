package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el precio del producto:");
		float precio = entrada.nextFloat();

		if (precio > 80) {
			System.out.println("Tienes un descuento del 10%.");
			double precioFinal = precio * 0.90;
			System.out.println("El precio final es de " + precioFinal 
					+ " euros.");
		} else if (precio < 5) {
			float precioGastos = precio + 2;
			System.out.println("No tienes descuento. Paga 2 euros más por "
					+ "gastos de gestión. \nEl precio final es "
					+ "de " + precioGastos + " euros.");
		}
		System.out.println("Gracias por venir.");
	}

}
