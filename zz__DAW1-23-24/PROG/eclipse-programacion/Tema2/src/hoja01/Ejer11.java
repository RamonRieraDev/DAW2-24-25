package hoja01;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		System.out.println("Escriba el precio del producto: ");
		Scanner precioIn = new Scanner(System.in);
		float precio = precioIn.nextFloat();
		
		System.out.println("Escriba la cantidad del producto: ");
		Scanner cantIn = new Scanner(System.in);
		int cant = cantIn.nextInt();
		
		float total = cant * precio;

		if (precio < 100) {
			System.out.println("El precio total es: " + precio + " €.");
		}

		else if (precio > 200) {
			System.out.println("El precio total es: " + (precio - (precio * 0.15)) + " €.");
		}

		else if (precio > 100 || precio < 200) {
			System.out.println("El precio total es:" + (precio - (precio * 0.10)) + " €.");
		}

	}

}
