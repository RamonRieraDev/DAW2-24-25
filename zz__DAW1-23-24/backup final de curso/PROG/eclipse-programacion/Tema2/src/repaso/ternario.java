package repaso;

import java.util.Scanner;

public class ternario {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int edad = 0;
		
		while(true) {
		System.out.println("Introduzca edad: ");
		edad = in.nextInt();
		String entrada = edad >= 18 ? "Entra" : "No entra";
		System.out.println(entrada);
		}
	}

}
