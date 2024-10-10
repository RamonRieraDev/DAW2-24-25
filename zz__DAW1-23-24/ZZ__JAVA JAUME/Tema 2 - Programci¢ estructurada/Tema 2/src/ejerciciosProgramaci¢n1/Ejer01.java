package ejerciciosProgramación1;

import java.util.Scanner;

public class Ejer01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba la contraseña: ");
		final String  CLAVE_REQUERIDA = entrada.nextLine();
		
		if(CLAVE_REQUERIDA.equals("java8")) {
			System.out.println("Acceso permitido.");
		} else {
			System.out.println("Acceso denegado.");
		}
	}

}
