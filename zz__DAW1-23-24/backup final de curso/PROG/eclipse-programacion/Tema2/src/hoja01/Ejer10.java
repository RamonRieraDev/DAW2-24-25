package hoja01;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		//LAS CONSTANTES SIEMPRE ARRIBA!!
		
		final String NOMBRE_REQUERIDO = "ramon";
		
		final String PASSWORD_REQUERIDO = "java8";
		
		System.out.println("Escriba el nombre de usuario/a: ");
		Scanner entrada = new Scanner(System.in);
		String usuario = entrada.nextLine();
		
		
		System.out.println("Escriba la clave de acceso: ");
		//Scanner entrada = new Scanner(System.in); //no hace falta hacer un scanner para cada
		//cosa. con el scanner entrada de arriba sobra.
		String clave = entrada.nextLine();

		if (clave.equals(PASSWORD_REQUERIDO) && usuario.equals(NOMBRE_REQUERIDO)) {
			System.out.println("Acceso permitido.");
		} else {
			System.out.println("Acceso denegado.");
		}

	}

}

