package hoja02;

import java.util.Scanner;

public class Ejer20b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int res = 2;

		for (int i = 1; i <= 10; i++) {
			
			res = res * 2;
			System.out.println("Las 10 primeras potencias de 2 son:" + res);

		}

	}

}