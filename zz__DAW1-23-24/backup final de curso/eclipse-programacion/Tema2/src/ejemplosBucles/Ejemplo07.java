package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo07 {

	public static void main(String[] args) {
		
		// Vamos a pedirle a un usuario que escriba un número entre 1 y 4.
		// Si se equivoca le repetiremos la pregunta hasta que introduzca
		// un número válido.
		
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		do {
			
			System.out.println("Escribe un número entre 1 y 4: ");
			num = entrada.nextInt();
			}while(num < 1 || num > 4);
	
		System.out.println("Has introducido un número correcto. ");
		
	}

}
