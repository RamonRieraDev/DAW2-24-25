package hoja02;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cómo se escribe 30 en hexadecimal? \n"
				+ "1) 1E \n"
				+ "2) 2F \n"
				+ "3) 33 \n"
				+ "4) Ninguno de los anteriores. "
				+ "Introduzca la respuesta: ");
		
		int respuesta = entrada.nextInt();
		
		while (respuesta < 1 || respuesta > 4) {
			
			System.out.println("Fallaste. El número debe estar entre 1 y 4.\n"
					+ "¿Cómo se escribe 30 en hexadecimal? \n"
					+ "1) 1E \n"
					+ "2) 2F \n"
					+ "3) 33 \n"
					+ "4) Ninguno de los anteriores. "
					+ "Introduzca la respuesta: ");
			
			respuesta = entrada.nextInt();
		}
		
		if (respuesta == 1) {
			System.out.println("Correcto.");
		} else {
			System.out.println("Fallaste");
			}
	}

}
