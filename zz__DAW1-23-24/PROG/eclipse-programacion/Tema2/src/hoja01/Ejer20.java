package hoja01;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("CALCULADORA");
		
		System.out.println("Introce el número 1: ");
		int num1 = entrada.nextInt();
		
		System.out.println("Introce la operación:\n"
				+ "1) suma\n"
				+ "2) resta\n"
				+ "3) multiplicación\n"
				+ "4) división");
		int oper = entrada.nextInt();
		
		System.out.println("Introce el número 2: ");
		int num2 = entrada.nextInt();
		
		int res = 0;
		
		switch (oper) {
		
			case 1:
				oper = num1 + num2;
				System.out.println("El resultado de " + num1 + " + " + num2 + " = "
						+ oper);
				break;
				
			case 2:
				oper = num1 - num2;
				System.out.println("El resultado de " + num1 + " - " + num2 + " = "
						+ oper);
				break;
				
			case 3:
				oper = num1 * num2;
				System.out.println("El resultado de " + num1 + " * " + num2 + " = "
						+ oper);
				break;
				
			case 4:
				oper = num1 / num2;
				System.out.println("El resultado de " + num1 + " / " + num2 + " = "
						+ oper);
				break;
				
			default:
				System.out.println("Debes escribir un número entero.");
		
		}
		
	}

}
