package hoja02;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double res;
		int resInt;

		for (int i = 1; i <= 10; i++) {

			res = Math.pow(2, i);
			resInt = (int) res;
			System.out.println("Las 10 primeras potencias de 2 son:" + res);

		}

	}

}
