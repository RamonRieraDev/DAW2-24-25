package ejercicios;
// Escribe un método llamado fahrenheit() que tome como argumento una temperatura en grados
// centígrados y devuelva la temperatura en grados Fahrenheit.

import java.util.Scanner;

public class Ejercicio06 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la temperatura en grados centígrados");
		double temperatura = entrada.nextDouble();
		
		System.out.println(temperatura + " grados centígrados es " + fahrenheit(temperatura) + " grados fahrenheit.");
	}
	
	static double fahrenheit(double temperatura) {
		
		return (temperatura * 9 / 5) + 32;
		
	}
	
}