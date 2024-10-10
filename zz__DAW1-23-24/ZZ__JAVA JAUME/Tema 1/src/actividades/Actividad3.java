package actividades;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame un número entero: ");
		int numero1 = entrada.nextInt();

		System.out.println("Dame otro número entero para dividirlo con el anterior: ");
		int numero2 = entrada.nextInt();

		int operacion = numero1 / numero2;

		int resto = numero1 % numero2;

		System.out.println("El resultado final es: " + operacion + " y el resto es " + resto);

	}

}
