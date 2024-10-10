package actividades;

import java.util.Scanner;

public class Actividad04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Ingrese el nombre del alumno: ");
		String nombre = in.nextLine();

		System.out.print("Ingrese las notas de la 1ª evaluación: ");
		double notas1 = in.nextDouble();
		System.out.print("Ingrese las notas de la 2ª evaluación: ");
		double notas2 = in.nextDouble();
		System.out.print("Ingrese las notas de la 3ª evaluación: ");
		double notas3 = in.nextDouble();

		double media = (notas1 + notas2 + notas3) / 3;

		System.out.println("La media de las 3 evaluaciones es: " + media);

	}

}
