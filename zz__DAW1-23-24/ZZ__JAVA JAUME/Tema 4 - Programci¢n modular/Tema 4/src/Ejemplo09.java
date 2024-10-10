
public class Ejemplo09 {

	public static void main(String[] args) {
		
		System.out.println("El triple de 5 es: " + triple(5));
		System.out.println("Un círculo de radio 5 tiene un "
				+ "área de " + areaCirculo(5));
		System.out.println("Una esfera de radio 10 tiene un "
				+ "volumen de " + volumenEsfera(10));
		System.out.println("Un triángulo de base 100 y altura 20 tiene "
				+ "un área de " + areaTriangulo(100, 20));
		System.out.println("La lateral inicial de la palabra aljibe "
				+ "es la " + inicial("aljibe"));
		System.out.println("Si un producto cuesta 100 euros, le hacemos un descuento de "
				+ "10% y le aplicamos un IVA del "
				+ "21%, su precio final será " + precioVenta(100, 10, 21));
		
	}

	// Método triple(num)
	static int triple(int num) {
		return num * 3;
	}

	// Método areaCirculo(r)
	static double areaCirculo(float r) {
		return Math.PI * r * r;
	}

	// Método volumenEsfera(r)
	static double volumenEsfera(float r) {
		return 4 * Math.PI * Math.pow(r, 3)/3;
	}

	// Método areaTriangulo(base, altura)
	static float areaTriangulo(float base, float altura) {
		return base * altura / 2;
	}

	// Método inicial(palabra)
	static char inicial(String palabra) {
		return palabra.charAt(0);
	}

	// Método precioVenta(precio, descuento, iva)
	
	static float precioVenta(float precio, float descuento, float iva) {
		
		float precioFinal = precio - precio * descuento / 100;
		precioFinal = precioFinal + precioFinal * iva / 100;
		return precioFinal;
	}

}
