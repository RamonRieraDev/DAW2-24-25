package hoja02;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		for(int i = 1; i <= 10; i++) {
			
			double res = Math.pow(2, i);
			
			System.out.println("Las 10 primeras potencias de 2 son:" + res);
			
		}
		
	}

}
