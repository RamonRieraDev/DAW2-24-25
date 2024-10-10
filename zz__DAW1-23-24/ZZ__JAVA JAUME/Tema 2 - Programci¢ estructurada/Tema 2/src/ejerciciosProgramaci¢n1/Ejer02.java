package ejerciciosProgramación1;

import java.util.Scanner;

public class Ejer02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Escriba el usuario: ");
		final String  PASSWORD_REQUERIDO = entrada.nextLine();
		System.out.println("Escriba la contraseña: ");
		final String  CLAVE_REQUERIDA = entrada.nextLine();
		
		if(PASSWORD_REQUERIDO.equals("Jaume") && CLAVE_REQUERIDA.equals("java8")) {
			System.out.println("Acceso permitido.");
		} else {
			System.out.println("Acceso denegado.");
		}
	}

}
