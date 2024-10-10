package hoja01;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		System.out.println("Escriba la nota del examen del 0 al 10: ");
		Scanner notasIn = new Scanner(System.in);
		int notas = notasIn.nextInt();

		if (notas >= 0 && notas < 5) {
			System.out.println("Insuficiente");
		}
		
		else if (notas == 5) {
			System.out.println("Suficiente");
		}

		else if (notas == 6) {
			System.out.println("Bien");
		}

		else if (notas == 7 || notas == 8) {
			System.out.println("Notable");
		}

		else if (notas == 9 || notas == 10) {
			System.out.println("Sobresaliente");
		}
	}

}
