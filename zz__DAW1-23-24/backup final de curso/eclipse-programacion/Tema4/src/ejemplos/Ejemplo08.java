package ejemplos;

public class Ejemplo08 {
// 
	public static void main(String[] args) {
	
		System.out.println("El área del triángulo de base 10 y altura 20 es " + area(10, 20));

	}

	// Devuelve el área de un triángulo con los argumentos de base y altura recibidos.
	static double area(double base, double altura) {
		
		return (base * altura) / 2;
		
	}
}
