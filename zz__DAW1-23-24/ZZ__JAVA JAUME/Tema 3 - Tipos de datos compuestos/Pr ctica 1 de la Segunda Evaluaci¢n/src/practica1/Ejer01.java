package practica1;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numeros[] = new int[10];
		int contadorPares;

		System.out.println(
				"Voy a pedirte 10 valores. Después te diré " + "cuántos de estos números son pares o impares.");

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Valor " + (i + 1) + ": ");
			numeros[i] = entrada.nextInt();
		}
		System.out.println("\nEstos son los valores introducidos:");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		contadorPares = 0;
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 ==0) {
				contadorPares++;
			}
		}
		System.out.println("\nHay " + contadorPares + " pares y " + (10 - contadorPares + " impares."));
	}
}
