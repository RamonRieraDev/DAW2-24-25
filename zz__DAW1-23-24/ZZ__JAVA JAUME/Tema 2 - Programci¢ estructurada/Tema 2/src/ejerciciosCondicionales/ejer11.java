package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime tu nota entera del 0 al 10: ");
		float nota = entrada.nextFloat();

		if (nota >= 0 && nota < 5) {
			System.out.println("Tienes un Insuficiente.");
		} else if (nota < 6) {
			System.out.println("Tienes un Suficiente.");
		} else if (nota < 8) {
			System.out.println("Tienes un Bien.");
		} else if (nota < 10) {
			System.out.println("Tienes un Notable.");
		} else if (nota == 10) {
			System.out.println("Tienes un Sobresaliente.");
		} else {
			System.out.println("Número incorrecto.");
		}
		System.out.println("Gracias por intentarlo.");
	}

}