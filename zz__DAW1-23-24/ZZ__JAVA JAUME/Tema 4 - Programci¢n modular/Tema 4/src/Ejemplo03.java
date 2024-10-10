import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Dime un número y te motraré su tabla de multiplicar: ");
		int numero = entrada.nextInt();

		tabla(numero);
	}

	static void tabla(int num) {

		System.out.println("Tabla del " + num);
		System.out.println("============");

		for (int i = 0; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}

		// Probamos de cambiar el valor num
		num = 20;
	}

}
