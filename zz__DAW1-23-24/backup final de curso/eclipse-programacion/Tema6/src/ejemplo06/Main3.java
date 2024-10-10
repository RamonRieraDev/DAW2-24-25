package ejemplo06;

import java.awt.font.NumericShaper;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		// Esta es una manera de hacer try-catch con excepciones (errores). Pero hay que poner 
		// "throw elQueSeaException, elQueSeaException" en el método de fuera del main. 
//		try {
//			dividirPor20();
//		} catch (NumberFormatException nfe) {
//			System.out.println("Tienes que escribir un número entero.");
//		} catch (ArithmeticException ae) {
//			System.out.println("No se puede dividir entre cero.");
//		} catch(Exception e) {
//			System.out.println("Se ha producido un error inesperado.");
//			System.out.println(e.toString());
//		}

		// Esta es otra manera de hacer try-catch con excepciones (errores). Solo poniendo
		// "throws Exception" en el método de fuera del main.
//		try {
//			dividirPor20();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// La otra manera es poner en el método main "throws Exceptions" sin poner nada más.
		
	}

	static void dividirPor20() throws Exception {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");

		System.out.println("\nEscribe un nº entero: ");
		String numero = entrada.nextLine();

		int num;
		num = Integer.parseInt(numero);
		System.out.println("La división de 20 entre " + num + " es " + 20 / num);

	}

}
