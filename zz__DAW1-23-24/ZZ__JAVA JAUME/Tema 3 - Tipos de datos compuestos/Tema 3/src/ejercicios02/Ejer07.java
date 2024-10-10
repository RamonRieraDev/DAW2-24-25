package ejercicios02;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int espectadores[] = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };

		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < espectadores.length; i++) {

			if (espectadores[i] > espectadores[posMax]) {
				posMax = i;
			}
			if (espectadores[i] < espectadores[posMin]) {
				posMin = i;
			}
		}
		System.out.println("El día con menos espectadores tuvo " + espectadores[posMin] + ".");
		System.out.println("El día con más espectadores tuvo " + espectadores[posMax] + ".");
	}
}
