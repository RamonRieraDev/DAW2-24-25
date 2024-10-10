package hoja01;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String movimiento[] = new String[1000];
		
		for (int i = 1; i < movimiento.length; i++) {
			
			System.out.println("Escribe el movimiento del robot:");
			movimiento[i] = entrada.nextLine();
			if (movimiento[i].equals("ejecutar")) {
				break;
			}
		}

		for (int i = 1; i < movimiento.length; i++) {
			if (movimiento[i].equals("ejecutar")) {
				break;
			}
			System.out.println("El movimiento " + i + " es: " + movimiento[i]);
		}
		
	}

}
