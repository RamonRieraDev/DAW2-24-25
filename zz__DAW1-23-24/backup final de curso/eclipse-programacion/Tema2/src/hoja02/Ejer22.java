package hoja02;

import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("LAS TABLAS DE MULTIPLICAR DEL 1 AL 10");

		for (int i = 1; i <= 10; i++) {

			System.out.println("TABLA DEL " + i);

			for (int j = 1; j <= 10; j++) {
				int res = i * j;
				System.out.println(i + "x" + j + "=" + res + "\t");
			}

		}
	}

}
