package ejercicios01;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float contadorNotas = 0;

		float notas[] = new float[5];
		
		int i = 0;

		while(i < notas.length) {

			System.out.print("Nota " + i + ": ");
			notas[i] = entrada.nextFloat();
			
			i++;
		}
		
		System.out.println("\nLas notas obtenidas son:\n");
		
		while(contadorNotas<notas.length) {
			
			System.out.println(notas);
			contadorNotas++;
		}

	}
}
