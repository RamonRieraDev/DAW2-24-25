
import java.util.Scanner;

public class Ejemplo16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Qué edad tienes?");
		int edad = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("¿Qué tipo de entrada quieres?");
		String tipo = entrada.nextLine();
		
		
		System.out.println("¿Cúal es tu nombre completo?");
		String nombre = entrada.next();
		
		
	}

}
