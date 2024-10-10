package ejemploRecursividad;

import java.util.Iterator;

public class Ejemplo03BusquedaBinaria {

	public static void main(String[] args) {

		int[] edades = { 10, 20, 30, 40, 50, 70, 80, 90 };

		int x = 92; // Número que buscaremos.
		int pos = busqueda(x, edades);
		
		if (pos != -1) {
			System.out.println("Se ha encontrado el número " + x + " en la posición " + pos + " del array.");
		} else {
			System.out.println("No se ha encontrado el número " + x + " en el array.");
		}
	}

	private static int busqueda(int x, int[] numeros) {

		int i = 0; // Extremo izquierdo de búsqueda.
		int f = numeros.length - 1; // Extremo derecho de búsqueda.
		int m; // Punto medio entre i y f.

		while (i <= f) {

			// Calculamos la posición en medio de i y f.
			m = (i + f) / 2;

			// Comparamos el valor en m con el valor buscado.
			if (x == numeros[m]) {
				// Hemos encontrado el
				return m;
			} else if (x < numeros[m]) {
				f = m - 1;
			} else {
				i = m + 1;
			}
		}
		return -1;
	}

}
