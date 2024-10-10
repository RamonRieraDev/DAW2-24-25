package practica3A;

import java.util.Scanner;

public class Consola {

	static private Scanner entrada = new Scanner(System.in);

	static public int leerInt(String mensajeError) {

		while (!entrada.hasNextInt()) {

			System.out.println(mensajeError);
			entrada.nextLine();

		}
		int numero = entrada.nextInt();
		entrada.nextLine();
		return numero;
	}

	static public int leerInt() {

		return leerInt("Tu edad debe ser un número entero.");

	}
}
