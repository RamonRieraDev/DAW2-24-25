package cadenas;

import java.util.Arrays;

public class Ejer14b {

	public static void main(String[] args) {

		String[] mascotas = { "Gato", "Tortuga", "Agapornis" };

		String aux;

		// int posMin = 0;

		for (int i = 0; i < mascotas.length; i++) {

			// posMin = i;

			for (int j = 0; j < mascotas.length - 1; j++) {

				if (mascotas[j].compareTo(mascotas[j + 1]) > 0) {
					aux = mascotas[j];
					mascotas[j] = mascotas[j + 1];
					mascotas[j + 1] = aux;
				}
			}
		}

		System.out.println(Arrays.toString(mascotas));
	}

}
