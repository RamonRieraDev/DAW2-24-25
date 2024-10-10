package hoja02Repaso;

import java.util.Arrays;

public class Ejercicio09 {
//	Crea un programa que muestre los siguientes precios (guardados en un array llamado precios)
//	ordenados de menor a mayor, usando el método de selección.
	public static void main(String[] args) {

		double[] precios = {43, 58, 44, 62, 80, 15, 15, 10, 90, 56};
		
		double aux;
		int posMin;
		
		for (int i = 0; i < precios.length - 1; i++) {
			posMin = i;
			
			for (int j = i + 1; j < precios.length; j++) {
				if(precios[j] < precios[posMin]) {
					posMin = j;
				}
			}
		
			aux = precios[posMin];
			precios[posMin] = precios[i];
			precios[i] = aux;
			
		}
	
		System.out.println(Arrays.toString(precios));
		
	}

}
