package hoja03;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float temperatura = 0;
		
		while (temperatura >= 0 && temperatura <= 50) {
			System.out.println("Escribe la temperatura:");
			temperatura = entrada.nextFloat();
			
			if (temperatura >= 10 && temperatura <= 30) {
				System.out.println("Temperatura correcta.");
			}else if (temperatura > 30 && temperatura <= 40) {
				System.out.println("Activar ventiladores a media potencia.");
			}else if (temperatura > 40 && temperatura <= 50) {
				System.out.println("Activar ventiladores a máxima potencia");
			}
			
		}
		System.out.println("La temperatura debe de estar entre 0 y 50.");
		System.out.println("Fin del programa.");
	}

}
