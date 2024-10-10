package ejemplosRepaso;

public class Ejemplo03 {

	public static void main(String[] args) {

		sumar(12,15);

	}

	// El método sumar recibe dos argumentos (a y b) de tipo entero.
	// Muestra el resultado de sumar ambos números.
	// No devuelve nada.
	static void sumar(int n1, int n2) {
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
	}
}
