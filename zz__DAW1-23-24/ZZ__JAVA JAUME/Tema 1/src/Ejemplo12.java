
import java.util.Scanner;

public class Ejemplo12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Te llamas " + nombre + ".");
		
		System.out.println("Edad: ");
		int edad = entrada.nextInt();
		
		System.out.println("Tiene " + edad + " años.");
		

	}

}
