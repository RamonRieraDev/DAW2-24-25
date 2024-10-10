package ejemplosBucles;

import java.util.Scanner;

public class Ejemplo04 {
	
	public static void main(String[] args) {
		
		// Mostramos nuestro nombre tantas veces como indique el usuario.
		// Ntes del nombre se muestra también el número de repetición.
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Cuántas veces quieres que aparezca" + "tu nombre en pantalla? ");

		int cont = 1;

		int rep = entrada.nextInt();

		while (cont <= rep) {
			System.out.println(cont + " - Ramon");
			cont++;
		}
		
		System.out.println("\nFin del programa.");
		
	}

}
