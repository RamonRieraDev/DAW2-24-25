package hoja01;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {

		System.out.println("Escriba la nota: ");
		Scanner entrada = new Scanner(System.in);
		float nota = entrada.nextFloat();

		if (nota < 4) {
		System.out.println("Rojo.");
		}else if(nota >= 4 && nota < 5) {
			System.out.println("Verde.");
		}else if(nota >= 5) {
			System.out.println("Azul.");
		}

	}

}
