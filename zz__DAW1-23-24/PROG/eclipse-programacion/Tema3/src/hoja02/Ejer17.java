package hoja02;

public class Ejer17 {

	public static void main(String[] args) {

		String notas[][] = {
				{"Jose Luis Martínez", "7"},
				{"Antonio Ruiz", "9"},
				{"Marcos Ramírez", "10"},
				{"Juana Herranz", "4"},
				{"Alberto López", "7"},
				};
		
		System.out.println("Alumno\tNota");
		for (int fila = 0; fila < notas.length; fila++) {
			
			for (int col = 0; col < notas[0].length; col++) {
				System.out.print(notas[fila][col] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int suma = 0;
		
		for (int fila = 0; fila < notas.length; fila++) {
			
				suma = suma + Integer.parseInt(notas[fila][1]);
			
		}
		System.out.println("La nota media es " + suma / notas.length);
		
		System.out.println();
		
		int posMin = 0;
		int posMax = 0;
		
		for (int fila = 0; fila < notas.length; fila++) {
			
			if ()
		}
	}

}
