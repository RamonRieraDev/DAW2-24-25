package hoja02Repaso;

public class Ejercicio13 {
//	La tabla siguiente muestra tres magnitudes meteorológicas medidas en cuatro momentos del
//	día. Guarda estos datos en un array bidimensional llamado medidas.
public static void main(String[] args) {
	
	double[][] medidas = {{8.5, 1020, 40},
						   {14.2, 1021, 35},
						   {11, 1022, 45},
						   {7, 1023, 50}};
	
	System.out.printf("%-6s %-10s %-6s\n", "Temp.", "Pres.", "Hume.");
	System.out.printf("%-6s %-10s %-6s\n", "======", "==========", "======");
	
	for (int fila = 0; fila < medidas.length; fila++) {
		System.out.printf("%-6s %-10s %-6s\n", medidas[fila][0], medidas[fila][1], medidas[fila][2]);
	}
	
	}
}
