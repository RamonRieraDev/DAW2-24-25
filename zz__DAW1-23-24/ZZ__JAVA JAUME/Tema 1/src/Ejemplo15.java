
//Que el programa pida el descuento que queremos aplicar.

// Programa que lee un precio, lo muestra después 
// en pantalla y le hace un 10% de descuento.
// Además enseñar el precio descontado.

import java.util.Scanner;

public class Ejemplo15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Cuánto valen las manzanas?");
		
		float precio = entrada.nextFloat();
		
		
		
		
		System.out.println("¿Qué descuento quieres aplicar?");

		float descuento = entrada.nextFloat();
		
		float precioRebajado = (precio * (100 - descuento) / 100);
		
		
		
		
		// Recomendable poner las operaciones fuera de los prints
		
		System.out.println("Las manzanas valen: " + precioRebajado + " euros.");
		
		float precioDescontado = precio - precioRebajado;
		
		System.out.println("El precio descontado es: " + precioDescontado + " euros.");

	}

}
