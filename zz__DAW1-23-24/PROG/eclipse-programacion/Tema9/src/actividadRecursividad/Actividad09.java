package actividadRecursividad;

public class Actividad09 {
	// Crea un método int sumar(int[] lista, int n) que calcule la suma de los
	// elementos de un array
	// lista de n números enteros.

	public static void main(String[] args) {
		int[] lista = { 1, 2, 3, 4, 5 };
		int n = lista.length;
		int suma = sumar(lista, n);
		System.out.println("La suma de los elementos del array es: " + suma);
	}

	public static int sumar(int[] lista, int n) {
		// Caso base:
		if (n == 0) {
			return 0;
		} else {
			// Caso recursivo:
			return lista[n - 1] + sumar(lista, n - 1);
		}
	}
}
