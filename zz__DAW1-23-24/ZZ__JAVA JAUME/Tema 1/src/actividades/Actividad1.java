package actividades;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame un número para multiplicarlo: ");
		float numero1 = entrada.nextFloat();

		System.out.println("Dame otro número para multiplicarlo: ");
		float numero2 = entrada.nextFloat();

		float operacion = numero1 * numero2;

		System.out.println("El resultado final es: " + operacion);

	}

}
