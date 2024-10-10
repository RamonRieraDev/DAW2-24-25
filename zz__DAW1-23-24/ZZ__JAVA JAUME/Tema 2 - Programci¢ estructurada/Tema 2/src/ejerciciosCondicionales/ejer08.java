package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dime ordenador en inglés: ");
		String palabra = entrada.nextLine();
		
		if (palabra.equals("Computer")) {
			
			System.out.println("Felicidades.");
			
		} else {
			
			System.out.println("Inténtalo de nuevo.");
		}

		System.out.println("Gracias por intentarlo.");
	}

}
