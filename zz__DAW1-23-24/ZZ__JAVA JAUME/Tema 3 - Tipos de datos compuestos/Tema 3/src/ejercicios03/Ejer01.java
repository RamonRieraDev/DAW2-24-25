package ejercicios03;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String libros[][] = new String[2][4];

		for (int fila = 0; fila < libros.length; fila++) {

			System.out.println("Registro " + (fila + 1));
			System.out.println("------------------------");

			System.out.print("ISBN: ");
			libros[fila][0] = entrada.nextLine();

			System.out.print("Título: ");
			libros[fila][1] = entrada.nextLine();

			System.out.print("Autor: ");
			libros[fila][2] = entrada.nextLine();

			System.out.print("Editorial: ");
			libros[fila][3] = entrada.nextLine();

			System.out.println();
		}

		System.out.printf("%-30s %-30s %-30s %-30s\n", "ISBN", "Título", "Autor", "Editorial");

		System.out.println();

		for (int fila = 0; fila < libros.length; fila++) {

			System.out.printf("%-30s %-30s %-30s %-30s\n", libros[fila][0], libros[fila][1], libros[fila][2],
					libros[fila][3]);

			System.out.println();

		}

	}

}
