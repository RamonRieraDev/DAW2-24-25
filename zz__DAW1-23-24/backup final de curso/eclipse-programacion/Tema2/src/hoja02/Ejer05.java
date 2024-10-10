package hoja02;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el número que desee: ");
		int num = entrada.nextInt();
		
		int mult = 1;
		
		while (mult <= 10) {
			System.out.println(num * mult);
			num++;
		}

	}

}
