package ejemplosRepaso;

public class Ejemplo08 {

	public static void main(String[] args) {

		System.out.println("Área: " + area(10, 20));
		
	}
	// Devuelve el área de un triángulo con los argumentos de base y altura recibidos.
	static double area(double b, double a) {
		return a * b / 2;
	}

}
