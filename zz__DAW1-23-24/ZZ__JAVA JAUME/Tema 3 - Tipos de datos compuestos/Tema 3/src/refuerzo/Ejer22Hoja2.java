package refuerzo;

import java.util.Scanner;

public class Ejer22Hoja2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String alumnos[][] = new String[3][4];

		System.out.println("Introducción de notas\n=======================");

		for (int fila = 0; fila < alumnos.length; fila++) {

			System.out.print("Nombre: ");
			alumnos[fila][0] = entrada.nextLine();

			System.out.print("Exámenes: ");
			alumnos[fila][1] = entrada.nextLine();

			System.out.print("Tranajos: ");
			alumnos[fila][2] = entrada.nextLine();

			System.out.print("Actitud: ");
			alumnos[fila][3] = entrada.nextLine();

		}

		float notaFinal = 0;

		System.out.println("\nNota de evaluación\n==================");

		for (int fila = 0; fila < alumnos.length; fila++) {

			System.out.println(alumnos[fila][0] + ": " + (50 * Float.parseFloat(alumnos[fila][1])
					+ 40 * Float.parseFloat(alumnos[fila][2]) + 10 * Float.parseFloat(alumnos[fila][3])) / 100);

		}

	}

}
