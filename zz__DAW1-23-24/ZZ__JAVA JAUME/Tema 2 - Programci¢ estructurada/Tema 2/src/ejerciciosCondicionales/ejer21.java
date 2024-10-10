package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer21 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime tu nombre: ");
		String nombre = entrada.nextLine();

		String mensaje;

		mensaje = (nombre.equals("Jaume")) ? "Adelante." : "Desconocido";
	}
}
