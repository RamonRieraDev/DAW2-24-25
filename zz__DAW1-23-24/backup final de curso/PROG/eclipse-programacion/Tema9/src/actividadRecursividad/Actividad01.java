package actividadRecursividad;

public class Actividad01 {

	public static void main(String[] args) {

		System.out.println(transforma(6));
		
	}

	private static String transforma(int n) {

		if (n > 1) {
			// Caso recursivo:
			return transforma(n / 2) + n % 2;
		} else if (n == 1){
			// Caso base:
			return "1";
		} else if (n == 0) {
			return "0";
		} else {
			return "ERROR";
		}
	}
}
