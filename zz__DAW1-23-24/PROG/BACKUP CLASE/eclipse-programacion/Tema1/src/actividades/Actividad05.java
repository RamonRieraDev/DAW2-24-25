package Actividades;

import java.util.Scanner;

public class Actividad05 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Ingrese el nombre del producto: ");
		String nombre = in.nextLine();
		System.out.print("Ingrese el precio del producto: ");
		double precio = in.nextDouble();
		System.out.print("Ingrese el descuento que se le debe hacer: ");
		double descuento = in.nextDouble() / 100;

		System.out.println("El producto llamado: " + nombre + " cuesta: " + precio + " €. " + "\nCon un descuento del: "
				+ descuento + " % el precio final es: " + (precio - (precio * descuento)) + " €.");

	}

}
