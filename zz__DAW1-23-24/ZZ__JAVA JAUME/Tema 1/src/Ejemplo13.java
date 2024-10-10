
// Programa que lee un precio, lo muestra después 
// en pantalla y le hace un 10% de descuento.

import java.util.Scanner;

public class Ejemplo13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuánto valen las manzanas?");
		
		float precio = entrada.nextFloat();
		
		float descuento = 0.90F;
		
		float precioRebajado = (precio * descuento);
		
		// Recomendable poner las operaciones fuera de los prints
		
		System.out.println("Las manzanas valen " + precioRebajado + " euros.");
		

	}

}
