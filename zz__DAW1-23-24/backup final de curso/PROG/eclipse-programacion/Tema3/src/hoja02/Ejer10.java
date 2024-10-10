package hoja02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		float[] temperatura = new float[8];
		
		Scanner entrada = new Scanner(System.in);
		
		int posMin;
		int max;
		float aux;
		
		for (int i = 0; i < temperatura.length; i++) {
			
			System.out.print("Introduce la temperatura de la hora: " + (i + 1) + ":");
			temperatura[i] = entrada.nextFloat();
			
		}
		
		
		for (int i = 0; i < temperatura.length; i++) {
			
			posMin = i;
			
			for (int j = i + 1; j < temperatura.length; j++) {
				
				if(temperatura[j] < temperatura[posMin]) {
					posMin = j;
				}
			}
			
			aux = temperatura[i];
			temperatura[i] = temperatura[posMin];
			temperatura[posMin] = aux;
			
			System.out.println(temperatura[i]);
			
		}
		
	}

}
