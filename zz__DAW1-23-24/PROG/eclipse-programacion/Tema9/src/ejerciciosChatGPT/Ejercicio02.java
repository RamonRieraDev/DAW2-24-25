package ejerciciosChatGPT;

import java.util.List;

public class Ejercicio02 {
// Producto de elementos pares: Escribe un método que tome una lista de números enteros y 
// devuelva el producto de todos los números pares.
	public static void main(String[] args) {
		
		List<Integer> numeros = List.of(1, 2, 3, 4, 5);
		System.out.println(productoPares(numeros));
		
	}
	
	private static int productoPares(List<Integer> numeros) {
		
		int producto = 1;
		
		for (int productoPares : numeros) {
			if(productoPares % 2 == 0) {
				producto = producto * productoPares;
			}
		}
		
		return producto;
	}
	
}
