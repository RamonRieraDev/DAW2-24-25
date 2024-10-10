
/*
 * Programa que pregunta el precio de un producto.
 * Si es menor de 50 euros, no tendrá descuento, si está entre 50
 *  y 100 euros (ambos inclusive), tendrá un descuento del 5%.
 *  Si está entre 100 y 200 (incluyendo 200), tendrá un 10% de descuento.
 *  En otro caso, tendrá un 15%.
 */

import java.util.Scanner;

public class Ejemplo08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Pedimos el precio

		System.out.print("Dime el precio del producto: ");
		float precio = entrada.nextFloat();

		if (precio < 50) {

			System.out.println("No tiene derecho a descuento.");
		} else if (precio <= 100) { // No ponemos el mayor que 50 porque ya ha saltado la condicion siguiente,
			// por tanto, si o si se cumplira pero sera menor que la condicon supeior.
			System.out.println("Tiene el descuento de un 5%.");
		} else if (precio <= 200) {
			System.out.println("Tiene el descuento de un 10%.");
		} else { // No ponemos condicion porque ya es la ultima
			// condicion que se a cumplir, por tanto, si o si se va a cumplitr
			System.out.println("Tiene el descuento de un 15%.");
		}
		System.out.print("Gracias por venir.");

	}

}
