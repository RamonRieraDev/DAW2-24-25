package hoja01;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner inPre = new Scanner(System.in);
		Scanner inUni = new Scanner(System.in);
		System.out.println("Introducir precio: ");
		System.out.println("Introducir unidad(es): ");
		double pre = inPre.nextDouble();
		int uni = inUni.nextInt();
		double tot = pre * uni;
		if (tot >= 75) {
			tot = tot * 1.15;
		} else {
			tot = tot * 1.05;
		}
		System.out.println("El total es: " + tot + "€");
	}

}
