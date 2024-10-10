package ejerciciosBucle;

import java.util.Scanner;

public class ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un carácter: ");
		String caracter = entrada.nextLine();

		int contador = 1;
		while (contador <= 100) {
			System.out.println(contador + " " + caracter);
			contador = contador + 1;
		}

	}
}