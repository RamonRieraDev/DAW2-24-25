package actividadRecursividad;

public class Actividad10 {
	// Escribe un método int multiplicar(int[] lista, int n) que calcule la
	// multiplicación de los
	// elementos de un array lista de n números enteros.

	public static void main(String[] args) {

		int[] lista = { 1, 2, 3, 4, 5 };
		int n = lista.length;
		int producto = multiplicar(lista, n);
		System.out.println("La multiplicación de los elementos del array es: " + producto);

	}

	private static int multiplicar(int[] lista, int n) {
		// Caso base:
		if (n == 0) {
			return 1;
		} else {
			// Caso recursivo:
			return lista[n - 1] * multiplicar(lista, n - 1);
		}
	}

}
