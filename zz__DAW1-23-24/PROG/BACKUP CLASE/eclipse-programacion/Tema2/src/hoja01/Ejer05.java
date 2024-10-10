package hoja01;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		System.out.println("Introduzca el mes: ");
		Scanner in = new Scanner(System.in);
		int month = in.nextInt();
		if (month >= 1 && month <= 12) {
			System.out.println("Mes correcto.");
		} else {
			System.out.println("Mes incorrecto.");
		}
	}

}
