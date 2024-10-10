package ejemplos;

// Actividad: escribe una tabla con edades y alturas 
// de un grupo de personas
// 		Edad	Altura
//		12		1.5
// Ambas double porque no se pueden mezclar valores.
// La tabla se llamará datos (al menos 4 filas).
public class Ejemplo12 {

	public static void main(String[] args) {
		double[][] datos = { { 12, 1.50 },
							 { 23, 1.68 },
							 { 45, 1.85 },
							 { 47, 1.72 } };

		System.out.println("\nEdad\tAltura");
		for (int fila = 0; fila < datos.length; fila++) {

			for (int col = 0; col < datos[0].length; col++) {
				System.out.print(datos[fila][col] + "\t");
			}
			System.out.println();
		}
	}
}
