package hoja01Repaso;

import java.util.Iterator;

public class Ejercicio05 {
// Crea un array llamado notas con cinco posiciones y ve asignando a cada una de ellas el valor de
// un examen que hayas hecho este curso (no sólo de programación). Haz que después se muestren
// todos los valores mediante un bucle while.
// VARIACIÓN PARA PRACTICAR EL PRINTF !!!!
	public static void main(String[] args) {

		String[][] notas = {{"P", "8,75"}, {"BBDD", "8"}, {"LM", "9"}};
		
		System.out.printf("%-4s %-4s\n", "Asig", "Nota");
		System.out.printf("%-4s %-4s\n", "====", "====");
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%-4s %-4s\n", notas[i][0], notas[i][1]);
		}

	}

}
