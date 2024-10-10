package ejemplos;

import java.util.Arrays;

// Intercambiar los valores de dos variables
public class Ejemplo09 {

	public static void main(String[] args) {

		int a = 10;
		int b = 25;

		// b valga 25 y a valga 25
		int aux = 0;

		aux = a;

		a = b;

		b = aux;

		System.out.println(a + " " + b);

		// Lo mismo pero ahora intercambiaremos dos posiciones
		// de un array.

		String[] mascotas = { "Perro", "Gato", "Hamster", "Ardilla", "Conejo" };

		// Intercambiamos la posición 1 (Gato) por 3 (ardilla)

		String aux2 = "";

		aux2 = mascotas[1];
		mascotas[1] = mascotas[3];
		mascotas[3] = aux2;

		for (int i = 0; i < mascotas.length; i++) {
			System.out.println(mascotas[i]);
		}
		
		// En lugar de usar un for para ver cómo está la lista
		// se puede usar Arrays.toString() pero antes se tiene
		// que instalar arriba como con el scanner.
		System.out.println(Arrays.toString(mascotas));
		
	}

}
