package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		// Mostramos nuestro nombre tantas veces como indique el usuario.
		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuántas veces quieres que aparezca" + "tu nombre en pantalla? ");

		int cont = 1;

		int rep = entrada.nextInt();

		while (cont <= rep) {
			System.out.println("Ramon");
			cont++;
		}

		System.out.println("\nFin del programa.");

	}

}
