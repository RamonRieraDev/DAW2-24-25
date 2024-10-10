package ejercicios01;

//Segunda parte del problema 14.

import java.util.Scanner;

public class Ejer14c {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero = 35;
		boolean esPrimo = true;
		
		//Bucle que muestra los números que vamos a comprobar si son primos.
		
		for(int candidato = 2; candidato <= 100; candidato++) {
			
			//Si candidato es primo lo mostramos
			System.out.println(candidato);
		}
//		
//		//Empezamos dividiendo por dos ya que todos los números son divisibles por 1 y por el mismo
//		//y acabamos diviendo por un número anterior al que nos han dao.
//
//		for (int i = 2; i < numero; i++) {
//			
//			System.out.println(numero + " / " + i + " da resto " + numero % i + ".");
//
//			if (numero % i == 0) {
//				
//				System.out.println("¡NO ES PRIMO!");
//				esPrimo = false;
//				break;
//			}
//
//		}
//		if (esPrimo) {
//			System.out.println(numero + " es primo.");
//		} else {
//			System.out.println(numero + " es compuesto.");
//		}
		

	}
}
