package practica01;

public class Actividad02 {
//	Escribe un programa que almacene estos datos en un array llamado produccion. Después:
//		• Mostrará la tabla de forma que las columnas no queden descolocadas.
//		• Calculará el promedio de kg producidos.
//		• Calculará la variedad que más produce, y la que menos.
	
	public static void main(String[] args) {
		
		System.out.println("Información sobre la producción de naranjas, en kg, de cada variedad de naranja: \n");
		
		String[][] produccion = {
				{"Navel Lane Late", "8.5"},
				{"Navelina", "4"},
				{"Washington Navel", "6.7"},
				{"Thomson", "4.9"},
				{"Newhall", "10.1"},
				{"Navelate", "6.3"},
				{"Ricalate", "5.5"},
				};

		int posMax = 0;
		int posMin = 0;
		double promedio = 0;
		double promedioRed = 0;
		
		System.out.printf("%-18s %4s\n", "Variedad", "Peso");
		System.out.printf("%-18s %4s\n", "==================", "====");
		for (int fila = 0; fila < produccion.length; fila++) {
			
			System.out.printf("%-18s %-4s\n", produccion[fila][0], produccion[fila][1]);
			
		}
	
		for(int i = 1; i < produccion.length; i++) {
			
			if (Double.parseDouble(produccion[i][1]) > Double.parseDouble(produccion[posMax][1])) {
				posMax = i;
			}
		}
		
		for(int i = 1; i < produccion.length; i++) {
			
			if (Double.parseDouble(produccion[i][1]) < Double.parseDouble(produccion[posMin][1])) {
				posMin = i;
			}
		}
		
		for(int i = 0; i < produccion.length; i++) {
			
			promedio = (promedio + Double.parseDouble(produccion[i][1]) / produccion.length);
			
			promedioRed = Math.round(promedio * 100) / 100.0;
		}
		
		System.out.println("\n Análisis de producción:");
		System.out.println("  * Variedad que produce más: " + produccion[posMax][0] + " " + "(" + produccion[posMax][1] + " kg).");
		System.out.println("  * Variedad que produce menos: " + produccion[posMin][0] + " " + "(" + produccion[posMin][1] + " kg).");
		System.out.println("  * Promedio producido por un naranjo " + promedioRed  + " kg.");
		
	}

}
