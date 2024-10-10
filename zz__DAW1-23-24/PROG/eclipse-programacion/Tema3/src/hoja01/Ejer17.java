package hoja01;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		double[] precio = new double[10];
		
		double total = 0;
		
		int mayor10 = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < precio.length; i++) {
			
			System.out.println("Introduzca el precio del producto número " + (i + 1));
			precio[i] = entrada.nextDouble();
			
			total = total + precio[i];
			
			if (precio[i] > 10) {
				mayor10++;
			}
			
		}

		System.out.println("El total es " + total + " €.");
		System.out.println("Hay " + mayor10 + " productos con precio mayor a 10 €.");
	}

}
