package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
//  Escribe un método que pida al usuario su nombre y devuelva la cadena introducida.

	public static void main(String[] args) {

		System.out.println("Te llamas " + nombrePersona() + ".");

	}

	static String nombrePersona() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el nombre: ");
		String nombre = entrada.nextLine();

		return nombre;

	}

}
