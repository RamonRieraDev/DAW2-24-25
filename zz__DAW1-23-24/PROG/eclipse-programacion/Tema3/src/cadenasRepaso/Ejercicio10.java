package cadenasRepaso;

import java.util.Scanner;

public class Ejercicio10 {
//	Programa que lee una frase y nos dice por cuántas palabras está formada. Usa el
//	método indexOf(int caracter, int posicion).
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String frase;
		int palabra = 1;

		System.out.println("Escribe una frase: ");
		frase = entrada.nextLine();

//		for (int i = 0; i < frase.length(); i++) {
//
//			if (frase.indexOf(" ") != -1) {
//				palabra++;
//			}
//			i = i + frase.indexOf(" ");
//		}

		int posEspacio = frase.indexOf(" ", 0);
		
		while(posEspacio != -1) {
			palabra++;
			posEspacio = frase.indexOf(" ", posEspacio + 1);
		}

		System.out.println(palabra);	
	}

}
