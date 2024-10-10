package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dime la temperatura del reactor nuclear:");
		float temperatura = entrada.nextFloat();

		if (temperatura > 120) {
			System.out.println(": \"TEMPERATURA DEL REACTOR CRÍTICA. " 
		+ "¡CORRED, INSENSATOS!");
		} else {
			System.out.println("Aún podemos vivir tranquilos.");
		}

	}

}
