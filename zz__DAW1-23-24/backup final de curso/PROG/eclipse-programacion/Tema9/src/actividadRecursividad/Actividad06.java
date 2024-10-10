package actividadRecursividad;

public class Actividad06 {

	public static void main(String[] args) {

		int[] numeros = { 2, 1, 4, 6, 3, 5, 7 };
		int n = numeros.length;
		System.out.println(minimo(numeros, n));
	}

	private static int minimo(int[] numeros, int n) {

		// caso base:
		if (n == 1) {
			return numeros[0];
		}

		int resultado = minimo(numeros, n - 1);

		// caso recursivo:
		if (resultado < numeros[n - 1]) {
			return resultado;
		} else {
			return numeros[n - 1];
		}

	}
}
