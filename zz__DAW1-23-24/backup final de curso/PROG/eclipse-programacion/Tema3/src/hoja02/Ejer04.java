package hoja02;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double[] productos = new double[10];
		
		double total = 0;
		
		for (int i = 0; i < productos.length; i++) {
			
			System.out.println("Introduce el producto número " + (i + 1));
			productos[i] = entrada.nextDouble();
			
			if(productos[i] < 0) {
				System.out.println("se ha encontrado un valos no válido en la posición " + i
						+ ". El programa terminará.");
			}
			total = total + productos[i];
		}
		System.out.println("El total de todos los productos es de: " + total + " euros.");
	}

}
