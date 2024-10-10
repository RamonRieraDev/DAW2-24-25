package actividades;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		float numero1 = entrada.nextFloat();
		
		System.out.println("Dame otro número para dividirlo con el anterior: ");
		float numero2 = entrada.nextFloat();
		
		float operacion = numero1 % numero2;
		
		System.out.println("El resto final es: " + operacion);
		
		

	}

}
