package ejemplosCondicionales;
import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {
		
		// Ejemplo de if -    else if     - else:
		//Tenemos una rifa donde se saca un número de 4 cifras al azar.
		//Si el jugador acierta un número, cobrará 10€,
		//si acierta 2 números, cobrará 30€, 
		//si acierta 3, 50€
		//si acierta 4, 100€
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuántos números ha acertado");
		int numeros = entrada.nextInt();

		if(numeros == 1) {
			System.out.println("Le tocan 10 euros de premio.");
		}else if (numeros == 2) {
			System.out.println("Le tocan 30 euros de premio.");
		}else if (numeros == 3) {
			System.out.println("Le tocan 50 euros de premio.");
		}else if (numeros == 3) {
			System.out.println("Le tocan 100 euros de premio.");
		}
		else {
			System.out.println("Solo puede ser un número de 1 a 4.");
		}
	
		System.out.println("Gracias por jugar.");
	}
}
