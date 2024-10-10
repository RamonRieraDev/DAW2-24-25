package hoja03;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numRandom1 = (int) (Math.random() * 100 + 1);
		int numRandom2 = (int) (Math.random() * 100 + 1);
		int res = 0;
		char letra;

		while (true) {
			numRandom1 = (int) (Math.random() * 100 + 1);
			numRandom2 = (int) (Math.random() * 100 + 1);
			System.out.println("Resuelve la suma de estos números:");
			System.out.println(numRandom1 + " + " + numRandom2);

			res = entrada.nextInt();

			if (numRandom1 + numRandom2 == res) {
				System.out.println("Has acertado.");
				System.out.println("¿Quieres continuar? (s/n)");
				letra = entrada.next().charAt(0);
				if (letra == 's') {
					continue;
				}else if(letra == 'n'){
					System.out.println("Gracias por haber usado este programa.");
					break;
				}
			} else {
				System.out.println("No has acertado.");
			}
		}
	}

}
