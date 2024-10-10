package actividadRecursividad;

public class Actividad11 {
// Crea un método que permita obtener el mayor elemento de un array de números decimales
// (double).
	public static void main(String[] args) {

		double[] numeros = { 0.24, 0.934, 0.44 };

		int n = numeros.length;
		
		System.out.println(maximo(numeros, n));

	}
	
	private static double maximo(double[] numeros, int n) {
		

		// caso base:
		if (n == 1) {
			return numeros[0];
		}

		double resultado = maximo(numeros, n - 1);

		// caso recursivo:
		if (resultado > numeros[n - 1]) {
			return resultado;
		} else {
			return numeros[n - 1];
		}
	}
}
