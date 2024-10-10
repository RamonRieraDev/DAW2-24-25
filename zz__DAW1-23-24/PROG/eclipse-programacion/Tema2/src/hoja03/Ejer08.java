package hoja03;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Escribe un número.");
		num = entrada.nextInt();
		System.out.println("Ahora te diré cuántos números hay del 1 has el " + num);
		
		for (int i = 1; i < num; i++) {
			System.out.print(i + ", ");
		}
		
	}

}
