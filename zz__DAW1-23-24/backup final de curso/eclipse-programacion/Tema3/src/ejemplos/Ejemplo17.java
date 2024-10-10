package ejemplos;

import java.util.Iterator;

public class Ejemplo17 {

	public static void main(String[] args) {

		String notas[][] = {
				{"Jose Luis Martínez", "7"},
				{"Antonio Ruiz", "9"},
				{"Marcos Ramírez", "10"},
				{"Juana Herranz", "4"},
				{"Alberto López", "7"},
				};
		
		System.out.printf("%-20s %-4s \n","Nombre", "Nota");
		System.out.printf("%-20s %-4s \n","====================", "====");
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%-20s %-4s \n", notas[i][0], notas[i][1]);
		}

	}

}
