package hoja01Repaso;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio07 {
// Crea un array de 10 elementos de tipo double llamado notas. Ve leyendo las diez notas desde la
// consola, mediante un bucle while, y guardándolas en el array. A continuación, muestra las diez notas.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[10];
		
		int i = 0;
		while(i < notas.length) {
			
			System.out.println("Introduce la nota " + (i + 1));
			notas[i] = entrada.nextDouble();
			i++;
		}
		
		//System.out.println(Arrays.toString(notas));

		for (int j = 0; j < notas.length; j++) {
			System.out.println("La nota " + (j + 1) + " es: " + notas[j]);
		}
	}

}
