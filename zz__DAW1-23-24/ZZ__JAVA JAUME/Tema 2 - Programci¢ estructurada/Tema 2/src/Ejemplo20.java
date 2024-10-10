import java.util.Scanner;

public class Ejemplo20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float nota;

		for (int i = 1; i <= 10; i++) {

			System.out.print("Nota " + i + ":");
			nota = entrada.nextFloat();

			if (nota < 0 || nota > 10) {

				System.out.println("Error de datos. El programa terminará.");
				break;
			}
		}

	}

}
