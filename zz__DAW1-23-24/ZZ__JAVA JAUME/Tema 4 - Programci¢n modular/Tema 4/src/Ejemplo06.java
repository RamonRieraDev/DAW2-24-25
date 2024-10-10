import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dame dos números decimales y haremos su suma.");
		System.out.print("Número 1: ");
		float numero1 = entrada.nextFloat();

		System.out.print("Número 2: ");
		float numero2 = entrada.nextFloat();
		
		sumar(numero1, numero2);

	}

	static void sumar(float numero1, float numero2) {

		System.out.println("El resultado final de la suma es: " 
		+ (numero1 + numero2) + ".");

	}

}
