package ejemplosCondicionales;
import java.util.Scanner;

public class Ejemplo12 {

	public static void main(String[] args) {

		System.out.println("Introduzca precio: ");

		Scanner entrada = new Scanner(System.in);

		// Dada una compra, si supera los 100 euros, tendrá un descuento de
		// del 10%, si no, lo tendrá del 5%.

		double compra = entrada.nextFloat();

		double total;

//		if(compra >= 100) {
//			total = compra - (compra * 0.1);
//		} else {
//			total = compra - (compra * 0.05);
//		}
//		System.out.println("El total es de: " + total);

		total = (compra >= 100) ? (total = compra - (compra * 0.1)) : 
			(total = compra - (compra * 0.05));

		System.out.println("El total es de: " + total);

	}

}
