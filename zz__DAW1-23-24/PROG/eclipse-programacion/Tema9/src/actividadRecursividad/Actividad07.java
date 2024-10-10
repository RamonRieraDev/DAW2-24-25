package actividadRecursividad;

public class Actividad07 {

	public static void main(String[] args) {

		int n = 456789;

		System.out.println(invertir(n));

	}

	private static String invertir(int n) {

		String resultado = "";

		// Caso base:
		if (n > 0) {

			// Caso recursivo:
			resultado = resultado + n % 10 + invertir(n / 10);
		} 
		
			return resultado;
	}

}
