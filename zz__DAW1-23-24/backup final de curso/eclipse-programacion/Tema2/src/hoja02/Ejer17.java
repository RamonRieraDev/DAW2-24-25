package hoja02;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Introduce el número para ver su tabla de multiplicar: ");
		int num = in.nextInt();
		
		for (int i = 1; i <= 10; i++) {

			int res = num * i;
			System.out.println(num + " por " + i + " = " + res);
		}

	}

}