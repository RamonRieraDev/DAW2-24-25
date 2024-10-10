package ejerciciosProgramacion3;

import java.util.Scanner;

public class Ejer03 {
	
	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);
		
		int aleatorio1 = (int)(Math.random()*100 + 1);
		
		int aleatorio2 = (int)(Math.random()*100 + 1);
		
		int suma = aleatorio1 + aleatorio2;
		
		int numero;

		System.out.println("Haz la suma de los siguientes números: " + aleatorio1 + " + " 
		+ aleatorio2 + ".");
		
		while (entrada.hasNextInt()) {
			
			numero = entrada.nextInt();
			
			if (numero == suma) {
				System.out.println("Has acertado campeón.");
				break;
			}else{
				System.out.println("Inténtalo de nuevo.");
			}
			
		}
	}

}
