package ejemplosCondicionales;

import java.util.Scanner;

// Programa que pregunta la temperatura de una cámara frigorífica
// y da instrucciones.
public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** CÁMARA FRIGORÍFICA ***");

		System.out.println("¿Qué temperatura marca el termómetro?");
		float temp = entrada.nextFloat();

		if (temp >= -20) {
			System.out.println("Encender cámara.");
		} else {
			System.out.println("Parar cámara.");
		}

		entrada.close();
	}
}
