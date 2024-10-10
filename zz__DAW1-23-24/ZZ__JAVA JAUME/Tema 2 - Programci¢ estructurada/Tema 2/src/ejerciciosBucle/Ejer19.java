package ejerciciosBucle;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float nota;
		float suma = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.print("Nota " + i + ": ");
			nota = entrada.nextFloat();

			while (nota < 0 || nota > 10) {
				System.out.print("Nota " + i + ": ");
				nota = entrada.nextFloat();
			}
			suma = suma + nota;
		}
		System.out.println("Bien hecho. La media es: " + suma / 5 + ".");
	}

}
