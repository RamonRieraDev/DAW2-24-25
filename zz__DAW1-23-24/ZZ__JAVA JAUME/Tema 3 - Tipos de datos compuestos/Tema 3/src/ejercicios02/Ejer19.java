package ejercicios02;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		//
		String nominas[][] = new String[4][3];

		for (int fila = 0; fila < nominas.length; fila++) {

			System.out.println("Empleado nº " + fila);
			System.out.println("----------------------");

			System.out.print("Nombre: ");
			nominas[fila][0] = entrada.nextLine();

			System.out.print("Apellidos: ");
			nominas[fila][1] = entrada.nextLine();

			System.out.print("Sueldo: ");
			nominas[fila][2] = entrada.nextLine();
			
			System.out.println();
		}

		System.out.println("Nóminas");
		System.out.println("===========================");

		for (int fila = 0; fila < nominas.length; fila++) {

			for (int columnas = 0; columnas < nominas[0].length; columnas++) {

				System.out.print(nominas[fila][columnas] + "\t");
			}
			System.out.println();
		}

		// Calculamos el total de sueldos.

		float total = 0;
		
		for(int fila = 0; fila < nominas.length; fila++) {
			
			total = total + Float.parseFloat(nominas[fila][2]);
		}
		
		System.out.println("\nEn total la empresa paga " + total 
				+ " euros en sueldos cada mes.");
	}

}
