package hoja02;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int exponente = 0;
		double potencia = 1;
		
		do {
			
			System.out.println("3 elevado a " + exponente + " = " 
			+ potencia);
			exponente++;
			potencia = Math.pow(3,  exponente);
			
		}while(potencia <= 12000);

	}

}
