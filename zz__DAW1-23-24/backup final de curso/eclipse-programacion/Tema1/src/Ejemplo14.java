
import java.util.Scanner;

public class Ejemplo14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);//como scanner es un objeto hay que hacerlo nuevo (new) y desde el sistema (System.in)
		
		//entrada.nextLine(); para un string siempre es line
		//entrada.nextInt(); para un int es Int y así con las demás (float, boolean...)
		
		System.out.println("Cómo te llamas?");
		String nombre = entrada.nextLine();
		
		
		System.out.println("\nCuántos años tienes?");
		int edad = entrada.nextInt();
		System.out.println("Te llamas " + nombre + " y Tienes " + edad + " años.");
		
		entrada.close(); //para cerrar la entrada siempre al final del código y a partir de aquí no funcionará. No hace falta ponerlo en realidad
		
	}

}
