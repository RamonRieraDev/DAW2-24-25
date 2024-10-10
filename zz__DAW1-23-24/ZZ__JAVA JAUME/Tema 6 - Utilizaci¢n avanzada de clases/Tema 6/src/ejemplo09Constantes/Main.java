package ejemplo09Constantes;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
		//Pedir al usuario un número de día de la semana y, si es 
		//sábado(6) o domingo(7), indicarle que es festivo
				
		System.out.println("Dime un número que indique un día de "
				+ "la semana (del 1 al 7): ");
		int numero = entrada.nextInt();
		
		if (numero == DiasSemana.SABADO || numero == DiasSemana.DOMINGO) {
			System.out.println("Es un día festivo.");
		} else {
			System.out.println("No es un día festivo.");
		}
		
	}

}
