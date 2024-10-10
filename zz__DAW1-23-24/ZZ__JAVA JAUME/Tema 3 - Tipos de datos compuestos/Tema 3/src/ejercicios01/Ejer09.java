package ejercicios01;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String test[] = { "¿Quién creó el Altair 8800, el primer ordenador personal?", "a) Bill Gates",
				"b) Steve Jobs", "c) Ed Roberts", "d) Gary Kildall" };

		for (int i = 0; i < test.length; i++) {

			System.out.println(test[i]);
		}
		
		System.out.print("\nRespuesta:");
		String respuesta = entrada.nextLine();
		
		if (respuesta.equals("c") || respuesta.equals("C")) {
			
			System.out.println("\nEnhorabuena, has acertado.");
			
		} else {
			
			System.out.println("\nHas fallado.");
		}
	}
}
