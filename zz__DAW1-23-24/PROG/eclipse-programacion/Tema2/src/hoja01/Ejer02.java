package hoja01;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double precio;
		double descuento;
		System.out.println("Introducir el precio del producto: ");
		precio = entrada.nextDouble();
		if (precio > 80) {
			descuento = precio - (precio * 0.10);
			System.out.println("Precio final: " + descuento);
		}
		else {
			System.out.println("precio final: " + precio);
		}
	}
}
