package ejercicios;

import java.util.Scanner;
// Crea un método que tome un número decimal y devuelva su cubo.
public class Ejercicio05 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número para ver su cuadrado: ");
		double numero = entrada.nextDouble();

		System.out.println("El cubo de " + numero + " es " + cubo(numero));

	}

	static double cubo(double numero) {
		
		return Math.pow(numero, 3);
		
		// return numero * numero * numero;

	}
}
