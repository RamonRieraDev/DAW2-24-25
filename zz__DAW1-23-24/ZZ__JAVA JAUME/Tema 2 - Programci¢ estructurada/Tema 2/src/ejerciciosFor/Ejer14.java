package ejerciciosFor;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Numeros pares menores de 200\n");
		
		for (int i = 3; i < 500; i=i+3) {

			System.out.println(i);
		}
	}

}