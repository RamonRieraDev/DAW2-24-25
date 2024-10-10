package hoja01;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca el día: ");
		
		String dia = entrada.nextLine();
		dia = dia.toLowerCase();
		
		dia = dia.equals("entre semana") ? "20:00" : "14:00";
		
		System.out.println("La hora de cierre es: " + dia);
	}

}
