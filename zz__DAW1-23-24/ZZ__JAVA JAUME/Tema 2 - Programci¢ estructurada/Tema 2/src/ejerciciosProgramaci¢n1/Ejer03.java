package ejerciciosProgramación1;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime un número entero y te diré si es par o impar: ");
		int numero = entrada.nextInt();

		String resultado;

		resultado = numero % 2 == 0 ? "No es impar." : "Es impar.";

		System.out.println(resultado);

	}
}
