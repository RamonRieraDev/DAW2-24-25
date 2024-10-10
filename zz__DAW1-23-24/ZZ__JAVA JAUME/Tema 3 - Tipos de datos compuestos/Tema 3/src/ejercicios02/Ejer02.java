package ejercicios02;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double estaturas[] = new double[10];
		boolean estaturaEncontrada = false;

		for (int i = 0; i < estaturas.length; i++) {
			
			System.out.print("Estatura " + (i + 1) + ": ");
			estaturas[i] = entrada.nextDouble();
		}

		for (int i = 0; i < estaturas.length; i++) {

			if (estaturas[i] > 1.90) {
				estaturaEncontrada = true;
				break;
			}

		}
		if(estaturaEncontrada) {
			System.out.println("Hay almenos una estatura de más 1,90 m.");
		}else {
			System.out.println("Todas las estaturas son menores al 1,90 m");
		}

	}

}
