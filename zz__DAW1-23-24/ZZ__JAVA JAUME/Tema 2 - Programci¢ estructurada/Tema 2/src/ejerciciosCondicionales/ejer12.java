package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime el número de un mes y " 
		+ "te daré su nombre: ");
		int mes = entrada.nextInt();

		if (mes == 1) {
			System.out.println("Enero.");
		} else if (mes == 2) {
			System.out.println("Febrero.");
		} else if (mes == 3) {
			System.out.println("Marzo.");
		} else if (mes == 4) {
			System.out.println("Abril.");
		} else if (mes == 5) {
			System.out.println("Mayo.");
		} else if (mes == 6) {
			System.out.println("Junio.");
		} else {
			System.out.println("Número incorrecto.");
		}
		System.out.println("Gracias intentarlo.");
	}

}
