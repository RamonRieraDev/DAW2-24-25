package practica3B;

import java.util.Scanner;

public class Consola {

	static private Scanner entrada = new Scanner(System.in);

	static public int leerInt(String mensajeError) {

		while (!entrada.hasNextInt()) {
			System.out.println(mensajeError);
			entrada.nextLine();
		}
		int numero = entrada.nextInt();
		return numero;
	}

	static public int leerInt() {

		return leerInt("Tu edad debe ser un número entero.");
	}

	
	static public double leerDouble(String mensajeError) {
		
		while (!entrada.hasNextDouble()) {
			System.out.println(mensajeError);
			entrada.nextLine();
		}
		double numero = entrada.nextDouble();
		return numero;
	}
	
	static public double leerDouble() {

		entrada.nextLine();
		return leerDouble("Entrada incorrecta: se esperaba un número.");
		
	}
	
	static public String leerString() {
		
		entrada.nextLine();
		String cadena = entrada.nextLine();
		return cadena;
		
	}
}
