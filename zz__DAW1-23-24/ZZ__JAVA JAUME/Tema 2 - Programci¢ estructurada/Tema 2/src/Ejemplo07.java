
//Programa que te pregunta el nombrey si te llamas Pablo 
//que puedes pasar y si no te lo prohibe.

import java.util.Scanner;

public class Ejemplo07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime tu nombre: ");
		String nombre = entrada.nextLine();

		if (nombre.equals("Pablo") ) {
			System.out.println("Puedes pasar.");
		} else {
			System.out.println("No puedes pasar.");
		}

	}

}
