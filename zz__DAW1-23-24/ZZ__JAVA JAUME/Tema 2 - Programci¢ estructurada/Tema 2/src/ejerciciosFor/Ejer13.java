package ejerciciosFor;

import java.util.Scanner;

public class Ejer13 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime un número y te dire su tabla de multiplicar: ");
		int numero = entrada.nextInt();

		for (int contador = 0; contador <= 10; contador++) {
			System.out.println(numero + " x " + contador + " = " + numero * contador);

		}
	}

}
