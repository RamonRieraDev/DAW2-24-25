package hoja02;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("PROGRAMA DE NOTAS");

		int nota = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			do {
				
				System.out.println("Ingrese la " + i + "a nota: ");
				nota = entrada.nextInt();

				if(nota > 10 || nota < 0)
					System.out.println("Error.");
				
				else if (nota < 5)
					System.out.println("Insuficiente.");

				else if (nota == 6)
					System.out.println("Bien.");

				else if (nota == 7 || nota == 8)
					System.out.println("Notable.");

				else if (nota == 9)
					System.out.println("Excelente.");

				else if (nota == 10)
					System.out.println("Sobresaliente.");
				
				
			} while (nota < 0 || nota >= 10);
			
			System.out.println();
			
		}
	}

}