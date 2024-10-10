package ejemplosCondicionales;

import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("***PORTERO DE DISCOTECA***");

		System.out.print("Cuántos años tienes?");

		int edad = in.nextInt();

		if (edad >= 18) {
			System.out.println("Puedes pasar.");
			System.out.println("Gracias por venir.");
		} else {
			// Si no se cumple la condición del if le diremos que no puede pasar
			System.out.println("No puedes pasar al ser menor de edad.");
		}

		// Esta instrucción siempre se ejecutará porque está fuera del bloque if.
		System.out.println("Fin del programa.");
		in.close();
	}
}
