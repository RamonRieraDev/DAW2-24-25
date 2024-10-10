package practica1;

import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String palabra;

		int inicioBucle = 1;

		int contadorPalabra = -1;
		
		//Inicio del bucle. Mostramos mensaje y pedimos la palabra.

		while (inicioBucle > 0) {

			System.out.println("Escribe una palabra cualquiera (\"basta\" para terminar): ");
			palabra = entrada.nextLine();
			contadorPalabra++;
			
			//Según la condición mostrará un mensaje u otro.

			if (palabra.equals("basta") && contadorPalabra > 1) {
				System.out.println("Has escrito " + contadorPalabra + " palabras.");
				break;
			} else if (palabra.equals("basta") && contadorPalabra == 0) {
				System.out.println("No has escrito ninguna palabra.");
				break;
			}else if (palabra.equals("basta") && contadorPalabra == 1){
				System.out.println("Has escrito una palabra.");
				break;
			}

		}

	}
}
