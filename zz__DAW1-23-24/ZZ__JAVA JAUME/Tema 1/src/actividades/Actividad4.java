package actividades;

import java.util.Scanner;

public class Actividad4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime tu nombre: ");
		String nombre = entrada.nextLine();

		System.out.println("Dime la nota de tu primera evaluación: ");
		float primeraEvaluacion = entrada.nextFloat();

		System.out.println("Dime la nota de tu segunda evaluación: ");
		float segundaEvaluacion = entrada.nextFloat();

		System.out.println("Dime la nota de tu tercera evaluación: ");
		float terceraEvaluacion = entrada.nextFloat();

		float notaFinal = (primeraEvaluacion + segundaEvaluacion + terceraEvaluacion) / 3;

		System.out.println("La media de las tres evaluaciones es: " + notaFinal);

	}

}