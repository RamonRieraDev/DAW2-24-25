package hoja01;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float precio[] = new float[10];
		
		for (int i = 0; i < precio.length; i++) {
			System.out.println("Ingrese precio del roducto: " + (i + 1) + " :");
			precio[i] = entrada.nextInt();
		}

		System.out.println("Los números son: ");
		for (int i = 0; i < precio.length; i++) {
			System.out.println(i + " - " + precio[i]);
		}
	}
}
