package practica02;

import java.util.Iterator;

public class Actividad02 {
//	Escribe un programa que almacene estos datos en un array llamado produccion. Después procederá
//	a ordenar la tabla de menor a mayor (según el campo kg).
	
	public static void main(String[] args) {

System.out.println("Información sobre la producción de naranjas, en kg, de menor a mayor producción: \n");
		
		String[][] produccion = {
				{"Navel Lane Late", "8.5"},
				{"Navelina", "4"},
				{"Washington Navel", "6.7"},
				{"Thomson", "4.9"},
				{"Newhall", "10.1"},
				{"Navelate", "6.3"},
				{"Ricalate", "5.5"},
				};

		int posMin;
		String[] aux;
		
		for (int i = 0; i < produccion.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < produccion.length; j++) {
				if (Double.parseDouble(produccion[j][1]) < Double.parseDouble(produccion[posMin][1])) {
					posMin = j;
				}
			}

			aux = produccion[posMin];
			produccion[posMin] = produccion[i];
			produccion[i] = aux;
		}
		
		System.out.printf("%-18s %4s\n", "Variedad", "Peso");
		System.out.printf("%-18s %4s\n", "==================", "====");
		for (int fila = 0; fila < produccion.length; fila++) {
			
			System.out.printf("%-18s %-4s\n", produccion[fila][0], produccion[fila][1]);
			
		}
	}
}
