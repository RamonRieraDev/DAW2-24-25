package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejer05 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Dime un número y te dire su tabla de multiplicar: ");
		int numero = entrada.nextInt();

		int contador = 0;

		do {
			System.out.println(numero + " x " + contador + " = " + numero * contador);
			contador++;
		} while (contador <= 10);
	}

}
