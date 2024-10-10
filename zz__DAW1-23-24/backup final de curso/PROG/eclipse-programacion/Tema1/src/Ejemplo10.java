
public class Ejemplo10 {

	public static void main(String[] args) {

		// Conversiones implícitas (no van a dar problemas).

		byte num = 100;
		short num2 = num;

		// Conversiones explícitas (pueden dar problemas).

		short num3 = 1000;
		byte num4 = (byte) num3; // Hacemos un CAST a byte.

		System.out.println("Todo bien " + num4);

		// Más conversiones implícitas

		long num5 = 10000;
		float num6 = num5;

		float num7 = 5000;
		double num8 = num7;

		// Más conversiones explícitas

		double num9 = 500;
		float num10 = (float) num9; // Hacemos un cast a float.

	}

}
