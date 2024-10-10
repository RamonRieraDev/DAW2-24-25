package hoja02;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese el primer número de la división: ");
		int dividendo = entrada.nextInt();

		System.out.println("Ingrese el segundo número de la división: ");
		int divisor = entrada.nextInt();

		int res;

		if (dividendo < divisor) {

			System.out.println("El resultado debe ser mayor o igual al divisor");

		} else {

			res = dividendo - divisor;
			
			System.out.println(dividendo + " - " + divisor + " = " + res);

			while (res >= divisor) {

				res = dividendo - divisor;

				System.out.println(dividendo + " - " + divisor + " = " + res);
				
				dividendo = res;

			}

			System.out.println("El resto es: " + res);
			
		}

		

	}

}
