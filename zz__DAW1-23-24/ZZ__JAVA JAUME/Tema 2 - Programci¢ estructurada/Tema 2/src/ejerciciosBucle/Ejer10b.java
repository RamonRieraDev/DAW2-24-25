package ejerciciosBucle;

import java.util.Scanner;

public class Ejer10b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		
		boolean preguntar = true;
		
		
		
		while (preguntar) {
			System.out.println("¿Cómo se escribe 30 en hexadecimal?\r\n" + "1) 1E\r\n" + "2) 2F\r\n" + "3) 33\r\n"
					+ "4) Ninguno de los anteriores.");
			int num = entrada.nextInt();
			
			if (num == 1) {
				System.out.println("Enhorabuena, has acertado.\nFin.");
				preguntar = false;
			}else if (num > 4 || num < 1) {
				System.out.println("Has fallado, suerte para la próxima vez.\nFin.");

			}else {
				
			}
			
		}
		
	}

}
