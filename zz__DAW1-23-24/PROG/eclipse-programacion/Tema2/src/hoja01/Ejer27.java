package hoja01;

import java.util.Scanner;

public class Ejer27 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba un número: ");
		
		int numero = entrada.nextInt();
		
		String resultado = (numero % 2 == 0) ? "Es par" : "Es impar";
		
		System.out.println(resultado);

	}

}
