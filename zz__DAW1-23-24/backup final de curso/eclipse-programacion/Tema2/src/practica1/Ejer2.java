package practica1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String palabra;
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("Escribe una palabra:");
			palabra = entrada.nextLine();
			
			for(int j = 1; j <= 5; j++) {
				System.out.println(palabra);
			}
			
			if(palabra.equals("stop")) {
				break;
			}
			
		}

	}

}
