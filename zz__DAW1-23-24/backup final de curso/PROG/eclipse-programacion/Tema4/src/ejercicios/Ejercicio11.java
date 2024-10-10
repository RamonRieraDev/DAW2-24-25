package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		int anio = 0;
		
		
		if(esBisiesto(anio) == true) {
			System.out.println("Es bisiesto.");
		}else {
			
				System.out.println("No es bisiesto.");
		}
	}

	static boolean esBisiesto(int anio) {

		Scanner entrada = new Scanner(System.in);

		boolean esBisiesto = false;
		
		System.out.println("Introduce el año: ");
		anio = entrada.nextInt();

		if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
			//System.out.println("El año " + anio + " es bisiesto");
			return esBisiesto = true;

		} else {
			//System.out.println("El año " + anio + " no es bisiesto");
			return esBisiesto = false;
		}

	}

}
