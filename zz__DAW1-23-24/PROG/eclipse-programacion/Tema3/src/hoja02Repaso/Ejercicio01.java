package hoja02Repaso;

import java.util.Scanner;

public class Ejercicio01 {
//	Crea un programa que guarde la siguiente tabla de edades en forma de array. A continuación
//	deberá buscar si hay alguna persona con 35 años. Si la hay, se mostrará el mensaje "Localizada
//	persona de 35 años". Utiliza una variable semáforo llamada edadEncontrada.

	public static void main(String[] args) {

		int[] edades = {20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19};
		
		boolean edadEncontrada = false;
		
		int i;
		for (i = 0; i < edades.length; i++) {
			if(edades[i] == 19) {
				//System.out.println("Localizada persona de 20 años");
				edadEncontrada = true;
				break;
			}
		}
		
		if(edadEncontrada) {
		System.out.println("Localizada persona de 20 años en la posición " + i + " del array edades.");
		} else {
			System.out.println("No se ha encontrado a ninguna persona con esa edad.");
		}
	}

}
