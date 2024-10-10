package ejemplosRepaso;

public class Ejemplo04 {

	public static void main(String[] args) {

		int num = 11;
		
		System.out.println("El doble de " + num + " es " + doblar(num) + ".");

	}
	
	// El método doblar recibe un argumento (num) de tipo entero.
	// No Muestra el resultado de multiplicarlo por 2.
	// Sí devuelve el doble del argumento (num).
	static int doblar(int n) {
		return n * 2;
	}
	
}
