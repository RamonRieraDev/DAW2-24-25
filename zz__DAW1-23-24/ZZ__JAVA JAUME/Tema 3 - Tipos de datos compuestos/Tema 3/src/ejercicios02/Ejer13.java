package ejercicios02;

public class Ejer13 {

	public static void main(String[] args) {

		double medidas[][] = { 
				{ 8.5, 1020, 40 }, 
				{ 14.2, 1021, 35 }, 
				{ 11, 1022, 45 }, 
				{ 7, 1023, 50 }, };

		// Obtener el número de filas y columnas.

		System.out.println("Tamaño de la Tabla:");
		System.out.println("Filas: " + medidas.length);
		System.out.println("Columnas: " + medidas[0].length);

		// Mostrar el array

		System.out.println("\nContenido de la tabla:");
		for (int fila = 0; fila < medidas.length; fila++) {

			System.out.println(medidas[fila][0] + "\t" 
					+ medidas[fila][1] + "\t" 
					+ medidas[fila][2]);

		}

		// Mostrar el array usando bucles anidados

		System.out.println("\nContenido de la tabla:");
		for (int fila = 0; fila < medidas.length; fila++) {
			
			for (int columna = 0; columna < medidas[0].length; columna++) {

				System.out.print(medidas[fila][columna] + "\t");
				
				}
			System.out.println();
			}
		
	}

}
