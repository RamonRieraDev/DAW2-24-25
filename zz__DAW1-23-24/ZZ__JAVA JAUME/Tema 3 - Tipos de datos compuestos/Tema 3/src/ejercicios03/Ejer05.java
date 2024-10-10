package ejercicios03;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float precios[] = new float[50];

		System.out.println("Caja registradora\n===========================");

		// Pedimos los precios hasta 50 o dar un valor negativo

		for (int i = 0; i < precios.length; i++) {

			System.out.println("Precio " + i + ": ");
			precios[i] = entrada.nextFloat();

			if (precios[i] < 0) {
				break;
			}
		}

		System.out.println("\nTicket de la compra");

		float total = 0;
		final float DESCUENTO = 0.9F;//Descuento del 10%
		final int CONDICION = 50;

		// Mostramos los precios y les aplicamos el descuento a los que les toquen si la compra total
		//supera los 50 euros
		for (int i = 0; i < precios.length; i++) {

			if (precios[i] >= 0 && total < CONDICION) {
				total += precios[i];
				System.out.println(precios[i]);
			} else if (precios[i] >= 0 && total > CONDICION) {
				precios[i]=precios[i]*DESCUENTO;
				total += precios[i];
				System.out.println(precios[i]);
			} else {
				break;
			}

		}
		System.out.println("\nTotal a pagar: " + total + " €."
				+ "\nGracias por la compra.");
		
	}

}
