package ejerciciosBucle;

import java.util.Scanner;

public class ejer05 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime un número y te dire su tabla de multiplicar: ");
		int numero = entrada.nextInt();

		int contador = 0;

		while (contador <= 10) {

			System.out.println(numero + " x " + contador + " = " + numero * contador);
			contador = contador + 1;
		}
	}

}
