package ejercicios;

import java.util.Scanner;

public class Ejer03 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Tu nombre es " + name());

	}

	static String name() {

		System.out.print("Dime tu nombre: ");
		String nombre = entrada.nextLine();
		return nombre;

	}

}
