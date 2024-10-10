package ejerciciosBucle;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo se escribe 30 en hexadecimal?\r\n" + "1) 1E\r\n" + "2) 2F\r\n" + "3) 33\r\n"
				+ "4) Ninguno de los anteriores.");
		int num = entrada.nextInt();

		while (num < 1 || num > 4) {
			System.out.println("Tiene que ser un número entre 1 y 4. Inténtalo otra vez.");
			num = entrada.nextInt();
		}
		if (num == 1) {
			System.out.println("Enhorabuena, has acertado.\nFin.");
		}else {
			System.out.println("Has fallado, suerte para la próxima vez.\nFin.");

		}
	}

}
