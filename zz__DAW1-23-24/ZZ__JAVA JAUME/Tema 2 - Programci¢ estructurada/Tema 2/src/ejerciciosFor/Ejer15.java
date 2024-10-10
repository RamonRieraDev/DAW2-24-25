package ejerciciosFor;

import java.util.Scanner;

public class Ejer15 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float precio;
		float precioTotal = 0;
		
		for(int i=1; i<= 4; i++) {
			System.out.println("Precio " + i + ": ");
			precio = entrada.nextFloat();
			precioTotal= precioTotal + precio;
			
		}
		System.out.println("\nTotal compra: " + precioTotal + ".");

	}

}
