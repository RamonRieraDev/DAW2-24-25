package ejerciciosBucle;

import java.util.Scanner;

public class ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe un número entero del 1 al 10: ");
		int numero = entrada.nextInt();

		while (numero < 1 || numero > 10) {
			System.out.print("Escribe un número entero del 1 al 10: ");
			numero = entrada.nextInt();
			
		}
		System.out.println("Bien hecho. El número elegido es " + numero + ".");
	}

}
