package hoja01;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {

		System.out.print("Introduzca el número del mes: ");

		Scanner entrada = new Scanner(System.in);
		int mes = entrada.nextInt();
		entrada.nextLine();

		switch (mes) {
		case 1:
			System.out.print("31");
			break;

		case 2:
			System.out.print("29");
			break;

		case 3:
			System.out.print("31");
			break;
		
		case 4:
			System.out.print("30");
			break;
		
		case 5:
			System.out.print("31");
			break;
		
		case 6:
			System.out.print("30");
			break;
		
		case 7:
			System.out.print("31");
			break;
		
		case 8:
			System.out.print("31");
			break;
		
		case 9:
			System.out.print("30");
			break;
		
		case 10:
			System.out.print("31");
			break;
		
		case 11:
			System.out.print("30");
			break;
		
		case 12:
			System.out.print("31");
			break;
			
		}
	}

}
