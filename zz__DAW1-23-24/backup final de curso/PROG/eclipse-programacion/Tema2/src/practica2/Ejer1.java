package practica2;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float temperatura = 0;
		
		while(true)
			{
			
			System.out.println("Introduzca la temperatura de la habitación: ");
			temperatura = entrada.nextInt();
			
			if(temperatura <= 10){
				System.out.println("Hace un frío que pela.");
			}
			else if(temperatura > 10 && temperatura < 20) {
				System.out.println("No se está mal.");
			}
			else if(temperatura >= 20){
				System.out.println("Calorcillo");
		}
	}
	
}
}