package actividadRecursividad;

public class Actividad03 {

	public static void main(String[] args) {

		int num = 42; // 26 = 1A, 27 = 1B, 28 = 1C...
		System.out.println("El número " + num + " en hexadecimal es " + transforma(num));

	}

	private static String transforma(int n) {

		String cadena = "";

		if (n >= 0 && n <= 15) {
			return "" + aHex(n);
		} else if (n > 15) {
			return "" + aHex(n / 16) + aHex(n % 16);
		} else {
			return "ERROR";
		}

	}

	private static String aHex(int n) {

		String[] hexadecimales = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

		return hexadecimales[n];
	}
}
