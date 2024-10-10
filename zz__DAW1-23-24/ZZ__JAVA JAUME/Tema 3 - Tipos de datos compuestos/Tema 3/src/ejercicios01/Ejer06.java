package ejercicios01;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float contadorPrecios = 0;

		float precios[] = new float[10];

		for (int i = 0; i < precios.length; i++) {

			System.out.print("Precio " + i + ": ");
			precios[i] = entrada.nextFloat();
		}
		
		for (int i = 0; i < precios.length; i++) {

			System.out.println(precios);
		}

	}
}
