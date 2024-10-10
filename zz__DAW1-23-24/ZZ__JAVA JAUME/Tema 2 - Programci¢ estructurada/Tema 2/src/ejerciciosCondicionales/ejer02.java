package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el precio del producto:");
		float precio = entrada.nextFloat();

		if (precio > 80) {
			System.out.println("Tienes un descuento del 10%.");
			float  precioFinal = precio * 0.90F;
			System.out.println("El precio final es de " + precioFinal + " euros.");
		} else {
			System.out.println("No tienes descuento. Precio final es " + precio + " euros.");
		}
		System.out.println("Gracias por venir.");
	}

}
