package ejerciciosCondicionales;

import java.util.Scanner;

public class ejer17a {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dame un número: ");
		float numero1 = entrada.nextFloat();

		System.out.print("Dame otro número: ");
		float numero2 = entrada.nextFloat();

		System.out.println("Indicame la operación a realizar " + "con el número correspondiente:" + "\n1) Suma\n"
				+ "2) Resta\n" + "3) Multiplicación\n" + "4) División");
		int operacion = entrada.nextInt();

		switch (operacion) {

		case 1:
			System.out.println(numero1 + numero2);
			break;
		case 2:
			System.out.println(numero1 - numero2);
			break;
		case 3:
			System.out.println(numero1 * numero2);
			break;
		case 4:
			System.out.println(numero1 / numero2);
			break;
		default:
			System.out.println("Número incorrecto.");
		}

	}

}