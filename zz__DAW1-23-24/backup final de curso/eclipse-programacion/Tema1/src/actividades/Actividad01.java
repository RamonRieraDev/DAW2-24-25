package actividades;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Ingrese el número 1 aquí: ");
		int num1 = in.nextInt();

		System.out.print("Ingrese el número 2 aquí: ");
		int num2 = in.nextInt();

		int resultado = num1 * num2;

		System.out.print("El resultado de multiplicar " + num1 + " por " + num2 + " es: " + resultado);
	}

}
