package practica2;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe la estación del año que quieres");
		String nombre = entrada.nextLine();

		while (true) {
			if (nombre.equals("invierno")) {
				System.out.println("El invierno empieza el 22 de Diciembre");
			} else if (nombre.equals("primavera")) {
				System.out.println("La primavera empieza el 21 de Marzo");
			} else if (nombre.equals("verano")) {
				System.out.println("El verano empieza el 21 de Junio");
			} else if (nombre.equals("otoño")) {
				System.out.println("El otoño empieza el 23 de Septiembre");
			} else if (nombre.equals("stop")) {
					break; 
			} else {
					System.out.println("Tienes que escribir el nombre\n"
							+ "de una estación");
				}
			 
			System.out.println("Escribe la estación del año que quieres");
			nombre = entrada.nextLine();
		}

	}
}
