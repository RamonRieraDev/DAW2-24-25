package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduzca la contraseña correcta: ");
		String contrasena = entrada.nextLine();
		
		if (contrasena.equals(1234)) {
			
			System.out.println("Acceso válido.");
			
		} else {
			
			System.out.println("Acceso no válido.");
		}

		
	}

}
