package hoja02;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número de la división: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Ingrese el segundo número de la división: ");
		int num2 = entrada.nextInt();
		
		int res;
		
		
		
		res = num1 - num2;
		
		while (res >= num2) {
			
			res = num1 - num2;
			
			System.out.println(num1 + " - " + num2 + " = " + res);
			
			
			
		}

		System.out.println("El resto es: " + res);
		
	}

}
