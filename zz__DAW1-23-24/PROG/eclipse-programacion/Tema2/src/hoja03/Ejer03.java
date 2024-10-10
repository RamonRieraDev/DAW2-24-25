package hoja03;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int numRandom1 = (int)(Math.random() * 100 + 1);
		int numRandom2 = (int)(Math.random() * 100 + 1);
		int res = 0;
		
		while(true) {
			System.out.println("Resuelve la suma de estos números:");
			System.out.println(numRandom1 + " + " + numRandom2);
			res = entrada.nextInt();
			if(numRandom1 + numRandom2 == res) {
				System.out.println("Has acertado.");
				break;
			}else {
				System.out.println("No has acertado.");
			}
			
		}
		
	}

}
