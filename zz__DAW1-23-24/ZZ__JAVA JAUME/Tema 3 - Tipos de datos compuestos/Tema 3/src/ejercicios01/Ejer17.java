package ejercicios01;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime el precio de diez productos: ");

		double precios[] = new double[10];
		double precioTotal = 0;
		int cantidadProductos = 0;

		for (int i = 0; i < precios.length; i++) {
			System.out.print("Precio " + (i+1) + ": ");
			precios[i] = entrada.nextDouble();
			if (precios[i] > 10) {
				cantidadProductos++;				
			}

		}
		System.out.print("\nLa cantidad de productos cuyos precios " 
		+ "son superiores a 10€ son: " + cantidadProductos + ".");

		for (int i = 0; i < precios.length; i++) {

			precioTotal = precioTotal + precios[i];
			
		}
		System.out.println("\n\nLa suma total de todos los productos es de: " + precioTotal + ".");

	}

}
