package hoja02;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("TRIVIAL");
		
		int num = 0;
		
		do {
			System.out.println("¿Quién es el autor de la novela \"Ready Player One\"?\n"
					+ "1) Douglas Capland\n"
					+ "2) Isaac Asimov\n"
					+ "3) Ernest Cline\n"
					+ "4) Ray Bradbury");
			num = entrada.nextInt();
			
		}while(num < 0 || num > 4);

		if(num == 3) {
			System.out.println("HAS ACERTADO.");
		}else {System.out.println("HAS FALLADO.");}

		entrada.close();
}
}
