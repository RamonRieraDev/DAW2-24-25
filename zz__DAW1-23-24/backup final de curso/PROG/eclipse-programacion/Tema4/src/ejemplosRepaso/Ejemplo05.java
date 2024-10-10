package ejemplosRepaso;

public class Ejemplo05 {

	public static void main(String[] args) {

		int a = 11;
		int b = 12;
		
		System.out.println(a + " + " + b + " = " + suma(a, b));
		
	}

	// El método sumar recibe dos argumentos (a y b) de tipo entero.
	// No Muestra el resultado de sumar ambos números.
	// Sí devuelve la suma de los argumentos (a y b).
	static int suma(int n1, int n2) {
		return n1 + n2;
	}
}
