import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Escríbeme un número: ");
		float numero = entrada.nextInt();

		doblar(numero);
	}

	static void doblar(float numero) {

		System.out.println("El numero resultante es: " + (numero * 2) + ".");

	}

}
