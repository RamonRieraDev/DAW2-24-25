package hoja02;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Los múltiplos de 3 menores de 500 son:\n");
		
		for(int i = 0; i < 500; i = i + 3) {
			
			System.out.println(i);
			
		}

	}

}
