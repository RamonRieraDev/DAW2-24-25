package hoja01;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String pregunta[] = new String[5];

		System.out.println("Introduce la pregunta: ");
		pregunta[0] = entrada.nextLine();
		
		char respuesta = 'a';

		for (int i = 1; i < pregunta.length; i++) {

			System.out.print("Introduce la respuesta " + respuesta + ") ");
			respuesta ++;
			pregunta[i] = entrada.nextLine();

		}

		System.out.println(pregunta[0]);
		
		respuesta = 'a';
		
		for (int i = 1; i < pregunta.length; i++) {
			System.out.println("    " + respuesta + ") " + pregunta[i]);
			respuesta++;
		}
	}

}
