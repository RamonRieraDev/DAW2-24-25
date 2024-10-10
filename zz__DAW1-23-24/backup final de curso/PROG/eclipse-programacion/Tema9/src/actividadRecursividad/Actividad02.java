package actividadRecursividad;

public class Actividad02 {

	public static void main(String[] args) {

		System.out.println(transforma(32));

	}

	private static String transforma(int n) {

		String cadena = "";
		
		if(n < 0) {
			return "ERROR";
			
		} else if (n == 0) {
			return "0";
		}
		
		while (n > 0) {
			cadena = n % 2 + cadena;
			n = n / 2;
		}
		return cadena;

	}
}
