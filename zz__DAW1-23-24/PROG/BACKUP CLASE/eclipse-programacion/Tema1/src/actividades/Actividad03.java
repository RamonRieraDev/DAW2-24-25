package Actividades;

import java.util.Scanner;

public class Actividad03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Ingrese el número 1 aquí: ");
		int num1 = in.nextInt();

		System.out.print("Ingrese el número 2 aquí: ");
		int num2 = in.nextInt();

		int resto = num1 % num2;

		int cociente = num1 / num2;

		System.out.println("El resto de la división entre " + num1 + " y " + num2 + " es: " + resto + " y el cociente es: " + cociente);

	}

}
