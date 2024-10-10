package cadenas;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe una frase: ");
		String frase = entrada.nextLine();
		
		System.out.print("Escribe la primera letra: ");
		String letra1 = entrada.nextLine();
		
		System.out.print("Escribe la segunda letra: ");
		String letra2 = entrada.nextLine();
		
		String nuevaFrase = frase.replace(letra1, letra2);
		
		System.out.println(nuevaFrase);
		
	}

}
