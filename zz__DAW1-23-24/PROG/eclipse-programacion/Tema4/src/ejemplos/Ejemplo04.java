package ejemplos;

public class Ejemplo04 {

	public static void main(String[] args) {

		System.out.println("El doble de 15 es " + doblar(15));
		
		int doble = doblar(20);

		System.out.println("El doble de 20 es " + doble);
	}

	// El método doblar recibe un argumento (num) de tipo entero.
	// No Muestra el resultado de multiplicarlo por 2.
	// Sí devuelve el doble del argumento (num).
	static int doblar(int num) {

		return 2 * num;

	}
}
