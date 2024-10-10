package ejerciciosProgramación1;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.print("Dame un número entero: ");
		int numero = entrada.nextInt();
		
		if (numero < 4) {
			System.out.println("Rojo.");
		} else if (numero < 5) {
			System.out.println("Verde.");
		}else {
			System.out.println("Azul.");
		}
	}
}
