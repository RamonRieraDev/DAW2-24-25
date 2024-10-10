package ejemplosCondicionales;

import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("***PORTERO DE DISCOTECA***");
		
		System.out.print("Cuántos años tienes?");
		
		int edad = in.nextInt();
		
		if (edad >= 18) {
			System.out.println("Puedes pasar.");
		}
		
		System.out.println("Fin del programa.");
	}

}
