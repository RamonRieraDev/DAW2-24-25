package hoja01;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int temp;
		System.out.println("Introduce la temperatura del reactor nuclear: ");
		temp = entrada.nextInt();
		if (temp > 120)
			System.out.println("TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!");
		else
			System.out.println("OK");

	}

}
