package hoja01;

import java.util.Scanner;

public class Ejer03 {

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
		
		if (precio < 5) {
			precio = precio + 2;
			System.out.println("Precio final: " + precio);
		}
	}
}
