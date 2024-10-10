package cadenas;

import java.util.Arrays;

public class Ejer14 {

	public static void main(String[] args) {

		String[] mascotas = { "Gato", "Tortuga", "Agapornis" };

		String aux;

		int posMin = 0;

		for (int i = 0; i < mascotas.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < mascotas.length; j++) {

				if (mascotas[j].compareTo(mascotas[posMin]) < 0) {
					posMin = j;
				}

			}
			aux = mascotas[posMin];
			mascotas[posMin] = mascotas[i];
			mascotas[i] = aux;
		}
		System.out.println(Arrays.toString(mascotas));
	}

}
