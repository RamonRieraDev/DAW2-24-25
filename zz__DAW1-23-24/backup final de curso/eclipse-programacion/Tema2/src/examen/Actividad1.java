package examen;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double num = 0;

		System.out.println("### Control de CO2 ###");
		System.out.println(" ");
		
		while (true) {

			System.out.print("Concentración de CO2?");
			num = entrada.nextDouble();

			if (num >= 300 && num < 700) {
				System.out.println("La concentración de CO2 es baja.");
			} else if (num >= 700 && num < 900) {
				System.out.println("La concentración de CO2 es moderada.El aire no se "
						+ "está reciclando correctamente.");
			} else if (num >= 900) {;
				System.out.println("La concentración de CO2 es demadiado alta. Aire "
						+ "perjudicial para la salud.");
			} else if (num < 300) {
				break;
			}

		}
		System.out.println(" ");
		System.out.println("Ha abandonado la aplicación.");
	}

}
