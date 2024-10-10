package actividades;

import java.util.Scanner;

public class Actividad5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el nombre de un producto: ");
		String nombreProducto = entrada.nextLine();

		System.out.println("Dime su precio: ");
		float precio = entrada.nextFloat();

		System.out.println("Dime su descuento: ");
		float descuento = entrada.nextFloat();

		float precioFinal = precio * ((100 - descuento) / 100);

		float precioRebajado = precio - precioFinal;

		System.out.println("El precio final es " + precioFinal + " euros." + "\n" + "El nombre del producto es: "
				+ nombreProducto + "\n" + "El precio es: " + precio 
				+ "\n" + "El descuento es: " + descuento + "\n"
				+ "El precio rebajado es: " + precioRebajado);

	}

}
