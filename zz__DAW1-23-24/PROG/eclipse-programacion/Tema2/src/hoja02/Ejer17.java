package hoja02;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("TABLA DE MULTIPLICAR\n");
		
		System.out.println("Introduce el número para ver su "
				+ "tabla de multiplicar:\n");
		
		int num = entrada.nextInt();
		
		for(int i = 0; i <= 10; i++ ) {
			
			System.out.println(num + " * " + i + " = " + num * i);
			
		}

	}

}
