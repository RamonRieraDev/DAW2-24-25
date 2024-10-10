package cadenas;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] mascotas = new String[5];

		System.out.println("Escribe 5 mascotas:");
		
		for (int i = 0; i < mascotas.length; i++) {
		System.out.println("Mascota " + (i + 1) + ":");
			mascotas[i] = entrada.nextLine();
		}
		
		
		// System.out.println("Introduce una palabra: ");

		int min = 0;
		
		// Método de encontrar el mínimo:
		for (int i = 1; i < mascotas.length; i++) {
			
			// En lugar de if (mascotas[i] < mascotas[min]), se hace:
			if (mascotas[i].compareTo(mascotas[min]) < 0) {
				min = i;
			}
		}
		System.out.println("Alfabéticamente la primera mascota es " + mascotas[min]);
	}

}
