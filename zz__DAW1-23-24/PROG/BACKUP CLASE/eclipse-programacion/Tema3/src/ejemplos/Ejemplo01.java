package ejemplos;

public class Ejemplo01 {

	public static void main(String[] args) {
		
		//Creamos un array con 10 posiciones de tipo float.
		float[] precios = new float[10];

		// Damos algunos valores al array.
		precios[0] = 10;
		precios[1] = 65;
		
		// Accedemos a los datos guardados en el array.
		System.out.println("Posición 0: " + precios[0]);
		System.out.println("Posición 0: " + precios[1]);
		
		// Al crear un array sus posiciones se inicializan a valores
		// por defecto (0 si es un array numérico, false si es un array
		// booleano y null si es un array de objetos).
		System.out.println("Posición 0: " + precios[2]);
		
	}

}
