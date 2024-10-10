package hoja02Repaso;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio04 {
// Escribe un programa que pida 10 precios de productos y los guarde en un array llamado
//	productos. Después recorrerá el array hasta encontrar un precio menor que 0. Si lo encuentra
//	escribirá el mensaje "Se ha encontrado un valor no válido en la posición x. El programa terminará"
//	(x es la posición del array donde está ese dato). Si no lo encuentra, calculará la suma de todos los
//	precios y la mostrará.
//	Utiliza una variable semáforo llamada preciosCorrectos, que valdrá true si todos los precios son
//	mayores o iguales a cero, y false si se encuentra un número negativo.
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double[] productos = new double[10];
		
		double suma = 0;
		
		for (int i = 0; i < productos.length; i++) {
			System.out.print("Escribe el precio del prodcuto " + (i + 1) + ": ");
			productos[i] = entrada.nextDouble();
			
			if(productos[i] < 0) {
				System.out.println("Se ha encontrado un valor no válido en la posición " + i 
						+ ". El programa terminará");
				break;
			} else {
				suma = suma + productos[i];
			}

		}
		
		System.out.println("La suma total de los precios es " + suma + ".");
		
	}

}
