package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime el número de un mes.");
		int mes = entrada.nextInt();
		
		if (mes >=1 && mes <=12) {
			System.out.println("Mes correcto.");
		} else {
			System.out.println("Mes no válido.");
		}
		System.out.println("Gracias por intentarlo.");
	}

}
