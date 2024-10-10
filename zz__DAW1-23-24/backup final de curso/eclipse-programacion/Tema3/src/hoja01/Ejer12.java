package hoja01;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String matriculas[] = new String[100];
		
		for(int i = 1; i <= matriculas.length; i++) {
			matriculas[i] = "sinmatricula";
			System.out.println("Matricula " + i + ": " + matriculas[i]);
		}
	}

}
