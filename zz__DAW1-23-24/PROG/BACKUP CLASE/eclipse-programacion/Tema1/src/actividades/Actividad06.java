package Actividades;

import java.util.Scanner;

public class Actividad06 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Escriba el nombre del producto: ");
		String nombre = in.nextLine();
		System.out.print("Escriba el precio del producto: ");
		double precio = in.nextDouble();
		System.out.print("Escriba el número de unidades vendidas: ");
		int unidades = in.nextInt();

		double coste = unidades * precio;

		System.out.println("El coste total de la compra es de: " + coste + " €");

	}

}
