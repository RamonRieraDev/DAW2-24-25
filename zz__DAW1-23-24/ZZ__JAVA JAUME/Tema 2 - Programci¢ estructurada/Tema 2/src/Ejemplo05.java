
//Programa que pregunta un precio de porducto 
//y su es mayor de cincuenta euros tienes un descuento.

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {
		
		//Preguntar el precio del producto.

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dime el precio del producto, \nsi es mayor a 50 "
				+ "euros te hacemos un descuento: ");
		float precio = entrada.nextFloat();
		
		// Comprobamos si el precio supera los 50 euros
		// y en tal caso, indicamos que tendrá descuento.
		
		if (precio > 50) {
			System.out.println("Te aplicamos el descuento.");

		} else {
			System.out.println("No te podemos aplicar el descuento.");
		}
		System.out.println("\nGracias por venir a nuestro local.");
	}

}
