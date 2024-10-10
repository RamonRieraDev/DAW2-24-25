package hoja01;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		
		System.out.println("Escriba la clave de acceso: ");
		
		Scanner claveIn = new Scanner(System.in);
		
		String clave = claveIn.nextLine();
		
		final String CLAVE_REQUERIDA = "java8";
		
		if(clave.equals(CLAVE_REQUERIDA)){
			System.out.println("Acceso permitido.");
		}else {
			System.out.println("Acceso denegado.");
		}
		
	}

}