package hoja01;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca el año en curso: ");
		int year = entrada.nextInt();

		System.out.print("Introduzca el número del mes: ");
		int mes = entrada.nextInt();

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.print("31 días");
			break;

		case 2:
			if (year % 100 != 0 && year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
				System.out.print("29 días");
			} else {
				System.out.print("28 días");
			}
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print("30 días");
			break;

		default:
			System.out.println("Tienes que escribir un número entre 1 y 12");
			break;
		}
		entrada.close();
	}

}
