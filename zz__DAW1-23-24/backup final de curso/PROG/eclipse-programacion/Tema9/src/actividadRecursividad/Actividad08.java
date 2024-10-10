package actividadRecursividad;

public class Actividad08 {

	public static void main(String[] args) {

		int n = 4562;

		System.out.println(sumar(n));

	}

	private static int sumar(int n) {

		if (n > 0) {

			// Caso recursivo:
			return n % 10 + sumar(n / 10);
			
		}

		// Caso base:
		return 0;
	}

}
