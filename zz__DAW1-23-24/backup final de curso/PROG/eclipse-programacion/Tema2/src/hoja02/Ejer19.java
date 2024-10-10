package hoja02;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int precio;
		int precioTotal = 0;
		
		for(int i = 1; i <= 4; i++) {
		System.out.println("Introdue el precio del OBJETO: " + i + "\n");
		precio = entrada.nextInt();
		precioTotal = precioTotal + precio;
		}
		
		System.out.println("El precio total es: " + precioTotal);
		
	}

}
