package ejerciciosBucle;

import java.util.Scanner;

public class ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe un carácter: ");
		String caracter = entrada.nextLine();
		System.out.print("Escribe el número de veces que quieres repetirlo: ");
		int numCaracter = entrada.nextInt();

		int contador = 1;
		while (contador <= numCaracter) {
			System.out.println(contador + " " + caracter);
			contador = contador + 1;
		}

	}
}