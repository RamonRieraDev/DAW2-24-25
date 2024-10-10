package hoja02;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String[][] nominas = new String[4][3];
		int fila = 0;
		
		for(fila = 0; fila < nominas.length; fila++) {
			System.out.print("Introduce el nombre del trabajador: ");
			nominas[fila][0] = entrada.nextLine();
			
		}
		for(fila = 0; fila < nominas.length; fila++) {
			System.out.println(nominas[fila][0]);
		}
		
	}

}
