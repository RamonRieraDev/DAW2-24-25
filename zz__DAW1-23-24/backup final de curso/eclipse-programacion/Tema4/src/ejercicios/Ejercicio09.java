package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {
// Crea un método int max(int x, int y) que devuelva el mayor de los números x e y. 
// Análogamente, crea el método int min(int x, int y).
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int x;
		int y;

		System.out.print("Escribe el primer número: ");
		x = entrada.nextInt();

		System.out.print("Escribe el segundo número: ");
		y = entrada.nextInt();

		System.out.println("El número mayor es " + max(x, y));

		System.out.println("El número menor es " + min(x, y));

	}

	static int max(int x, int y) {

		if (x < y) {
			return y;
		}
		return x;

	}

	static int min(int x, int y) {

		if (x > y) {
			return y;
		}
		return x;

	}

}
