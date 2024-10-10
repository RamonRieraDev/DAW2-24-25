package ejercicios;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escríbeme un número decimal y te daré su cuadrado.");
		double numero = entrada.nextDouble();

		System.out.println(cuadrado(numero));

	}

	static double cuadrado(double numero) {

		return Math.pow(numero, 2);
	}

}
