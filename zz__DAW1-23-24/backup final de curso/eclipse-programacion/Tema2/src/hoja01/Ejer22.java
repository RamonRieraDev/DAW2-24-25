package hoja01;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un número entre 1 y 10:");
		
		boolean correcto = entrada.hasNextInt();
		
		if(correcto) {
			System.out.println("Es un número entero.");
			
			int num = entrada.nextInt();
			if(num >= 1 && num <=10) {
				System.out.println("Tu número está entre 1 y 10.");
			}else {
				System.out.println("Pero tu número no está entre 1 y 10.");
			}
		}else {
			System.out.println("No es un número entero.");
		}
	}

}
