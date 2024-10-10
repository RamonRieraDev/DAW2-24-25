package actividades;

import java.util.Scanner;

public class Actividad6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime el nombre de un producto: ");
		String nombreProducto = entrada.nextLine();

		System.out.println("Dime su precio: ");
		float precio = entrada.nextFloat();

		System.out.println("Dime el número de unidades vendidas: ");
		int unidades = entrada.nextInt();

		float totalCompra = unidades * precio;
		System.out.println("El coste total de la compra es de: " + totalCompra + " euros.");

	}

}
