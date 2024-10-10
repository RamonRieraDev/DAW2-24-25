package practica1;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double pesos[] = new double[12];
		int posMin;
		int posMax;

		System.out.println("Introduce el peso (en kg) de 12 personas"
				+ "\n========================================\n");
		
		for (int i = 0; i < pesos.length; i++) {

			System.out.print("Persona " + (i + 1) + ": ");
			pesos[i] = entrada.nextDouble();
		}

		posMin = 0;
		posMax = 0;

		for (int i = 1; i < pesos.length; i++) {
			if (pesos[i] < pesos[posMin]) {
				posMin = i;
			}
			if (pesos[i] > pesos[posMax]) {
				posMax = i;
			}
		}
		System.out.println("\nEl mínimo es: " + pesos[posMin] + " kg.");
		System.out.println("El máximo es: " + pesos[posMax] + " kg.");
		
		System.out.println("\nLa diferencia entre el mayor y el menor peso es: " 
		+ pesos[posMax] + " - " + pesos[posMin] + " = " + (pesos[posMax] - pesos[posMin]) + " kg.");
	}
}