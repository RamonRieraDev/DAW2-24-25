
import java.util.Scanner;

public class Ejemplo10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Calificación (formato palabra y primera letra mayúsculas): ");
		String calificacion = entrada.nextLine();

		// Insuficiente -> 2,5
		// Suficiente -> 5
		// Bien -> 6
		// Notable -> 8
		// Sobresaliente -> 9,5

		switch (calificacion) {

		case "Insuficiente":
			System.out.println("Tienes un 2,5.");
			break;
		case "Suficiente":
			System.out.println("Tienes un 5.");
			break;
		case "Bien":
			System.out.println("Tienes un 6.");
			break;
		case "Notable":
			System.out.println("Tienes un 8.");
			break;
		case "Sobresaliente":
			System.out.println("Tienes un 9,5.");
			break;
		default:	
			System.out.println("La nota no es válida.");
		}

	}

}
