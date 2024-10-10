package ejemplos;

public class Ejemplo18 {

	// Cómo redondear cifras decimales.
	
	public static void main(String[] args) {

		double num = 10.0 / 3;
		
		System.out.println("num sin redondear: " + num);
		
		// Para redondear con dos decimales multiplicamos por 100.
		// Si fuera con un decimal multiplicaríamos por 10.
		double numRedondeado = Math.round(num * 100) / 100.0;
		
		System.out.println("num redondeado: " + numRedondeado);
		
	}

}
