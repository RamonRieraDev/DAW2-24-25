package ejemplos;

public class Ejemplo16 {
// Printf para mostrar tablas de una mejor manera que las anteriores.
	
	public static void main(String[] args) {

		// Ejemplo de uso de printf.
		float temp = 10;
		float humedad = 60;
		System.out.printf("Hoy hace %f grados y hay una humedad de %f %%. \n", temp, humedad);
		
		System.out.println("");
		
		String[][] alturas = {
				{"Manuel Díaz","1.75"},
				{"Rosa Sánchez","1.70"},
				{"Maria de la Rosa","1.65"},
				{"Jorge Luis Martínez","1.72"}
		};
		
		System.out.printf("%-20s %4s \n", "Nombre", "Estatura");
		System.out.printf("%-20s %4s \n", "====================", "========");
		
		// Ejemplo de uso de printf con arrays.
		for (int fila = 0; fila < alturas.length; fila++) {
			// Para que haya 20 espacios en los nombres se pone %20s y se alineará a la derecha.
			// Para que haya 20 espacios en los nombres se pone %2-0s y se alineará a la izquierda.
			System.out.printf("%-20s %4s \n", alturas[fila][0], alturas[fila][1]);
		}

		
	}

}
