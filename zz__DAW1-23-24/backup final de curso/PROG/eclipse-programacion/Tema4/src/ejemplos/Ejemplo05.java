package ejemplos;

public class Ejemplo05 {

	public static void main(String[] args) {

		System.out.println("Sumando 12 y 15 es " + sumar(12, 15));

		int suma = sumar(12, 15);
		System.out.println("Sumando 12 y 15 es " + suma);

	}

	// El método sumar recibe dos argumentos (a y b) de tipo entero.
	// No Muestra el resultado de sumar ambos números.
	// Sí devuelve la suma de los argumentos (a y b).
	static int sumar(int a, int b) {

		return a + b;

	}
}
