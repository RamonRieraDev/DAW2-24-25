package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
// Crea un método que tome un número decimal y devuelva su cuadrado.
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un número para ver su cuadrado: ");
		double numero = entrada.nextDouble();
		
		System.out.println("El cuadrado de " + numero + " es " + cuadrado(numero));

	}

	static double cuadrado(double numero) {
		
		return Math.pow(numero, 2);
		
		// return numero * numero;
		
	}
	
}
