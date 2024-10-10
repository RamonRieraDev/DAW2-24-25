package hoja01;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

		System.out.println("Escriba el número del mes: ");
		Scanner entrada = new Scanner(System.in);
		int mes = entrada.nextInt();

		if (mes >= 1 && mes <= 4) {

			if (mes == 1) {
				System.out.println("El nombre del mes es: Enero");
			}

			else if (mes == 2) {
				System.out.println("El nombre del mes es: Febrero");
			}

			else if (mes == 3) {
				System.out.println("El nombre del mes es: Marzo");
			}

			else if (mes == 4) {
				System.out.println("El nombre del mes es: Abril");
			}

		} else {
			System.out.println("No está entre el 1 y el 4.");
		}

	}

}
