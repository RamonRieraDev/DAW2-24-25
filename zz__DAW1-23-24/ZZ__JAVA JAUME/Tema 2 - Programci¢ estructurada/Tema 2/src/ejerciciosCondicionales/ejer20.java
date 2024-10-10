package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime tu edad: ");
		int edad = entrada.nextInt();

		boolean mayorDeEdad;

		mayorDeEdad = (edad >= 18) ? true : false;
		
		System.out.println(mayorDeEdad);
	}
}
