package hoja02;

import java.util.Scanner;

public class Ejer15b {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int exponente = 0;
		int potencia = 1;
		
		do {
			
			System.out.println("3 elevado a " + exponente + " = " + potencia);
			exponente++;
			potencia = potencia * 3;
			
		}while(potencia <= 12000);

	}

}
