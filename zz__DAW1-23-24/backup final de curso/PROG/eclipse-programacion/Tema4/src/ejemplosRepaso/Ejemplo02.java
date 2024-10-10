package ejemplosRepaso;

public class Ejemplo02 {

	public static void main(String[] args) {

		int num = 11;

		doblar(num);

	}

	// El método doblar recibe un argumento (num) de tipo entero.
	// Muestra el resultado de multiplicarlo por 2.
	// No devuelve nada.
	static void doblar(int numero) {

		System.out.println("El doble de " + numero + " es " + numero * 2 + ".");

	}

}
