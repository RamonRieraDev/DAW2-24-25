package ejerciciosDoWhile;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		int opcion;
		
		do {
			System.out.println("¿Quién es el autor de la novela \"Ready Player One\"?\r\n"
					+ "1) Douglas Capland\r\n"
					+ "2) Isaac Asimov\r\n"
					+ "3) Ernest Cline\r\n"
					+ "4) Ray Bradbury");
			opcion = entrada.nextInt();
		} while(opcion< 1 || opcion > 4);
		if (opcion == 3) {
			System.out.println("Has acertado, enhorabuena.");
		} else {
			System.out.println("Has fallado, inténtalo de nuevo.");
		}
	}

}
