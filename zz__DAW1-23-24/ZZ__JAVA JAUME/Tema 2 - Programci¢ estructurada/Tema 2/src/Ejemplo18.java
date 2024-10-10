import java.util.Scanner;

public class Ejemplo18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Adivina el número entre el 1 y 10.");
		int num;
		do {

			System.out.println("¿Qué número es?");
			num = entrada.nextInt();

		} while (num != 7);

	}

}
