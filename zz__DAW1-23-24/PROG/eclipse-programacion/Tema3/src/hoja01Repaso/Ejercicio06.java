package hoja01Repaso;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio06 {
// Escribe un programa que pida por consola los precios de diez productos y los guarde en un array.
// Haz que después se muestren todos los valores mediante un bucle for.

// VARIACIÓN PARA PRACTICAR EL PRINTF Y METER 2 DATOS EN LA TABLA !!!!
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String[][] precios = new String[2][2];
		
		int i;
		for (i = 0; i < precios.length; i++) {
			System.out.print("Introduce el producto: ");
			precios[i][0] = entrada.nextLine();
			System.out.print("Introduce el precio del producto: ");
			precios[i][1] = entrada.nextLine();
		}
		
//		int j;
//		for (j = 0; j < precios.length; j++) {
//			System.out.print("Introduce el precio del producto: ");
//			precios[j][1] = entrada.nextLine();
//		}
		
		System.out.printf("%-20s %-10s\n", "Producto", "Precio");
		System.out.printf("%-20s %-10s\n", "====================", "==========");
		
		// PARA PRINTF: 
		for (int fila = 0; fila < precios.length; fila++) {
			
				System.out.printf("%-20s %-10s\n", precios[fila][0], precios[fila][1]);
			
		}
		
// 		SIN PRINTF: (NO ES MUY BUENO)
//		for (int fila = 0; fila < precios.length; fila++) {
//			for (int columna = 0; columna < precios[0].length; columna++) {
//				System.out.println(precios[fila][columna]);
//			}
//			
//		}
	}

}
