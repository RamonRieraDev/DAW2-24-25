package cadenas;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce la contraseña: ");
		String keyword = entrada.nextLine();

		int longitud = keyword.length();

		if(longitud <= 12 && longitud >= 6) {
		
		System.out.println("La contraseña es correcta. Tiene un mínimo de 6 letras"
				+ " y máximo de 12");
		} else {
			System.out.println("La contraseña es incorrecta. Tiene " + longitud + 
					" Tiene que tener mínimo 6 letras y un máximo de 12");
		}
	}
}
