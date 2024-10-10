
//Programa que pregunta la temperatura, y si es menor 
//de 20ºC muestra un mensaje de "hace fresquito".

import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Pregunta la temperatura

		System.out.println("Dime que temperatura hace: ");
		float temperatura = entrada.nextFloat();

		if (temperatura < 20) {
			System.out.println("Hace fresquito.");
		}

	}

}
