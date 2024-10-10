package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Numeros pares menores de 200\n");

		int contador = 0;

		do {
			System.out.println(contador);
			contador = contador + 2;
		} while (contador < 200);

	}

}