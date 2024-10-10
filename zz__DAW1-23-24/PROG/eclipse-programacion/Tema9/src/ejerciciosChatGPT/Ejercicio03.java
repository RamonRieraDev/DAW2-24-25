package ejerciciosChatGPT;

import java.util.List;

public class Ejercicio03 {
// Promedio de elementos: Escribe un método que tome una lista de números enteros y 
// devuelva el promedio de esos números.
	public static void main(String[] args) {
		
		List<Integer> numeros = List.of(2, 2, 4, 4);
		
		System.out.println(media(numeros));
		
	}
	
	private static double media(List<Integer> n) {
		
		int suma = 0;
		
		for (int num : n) {
			suma += num;
		}
		
		return suma / n.size();
	}
	
}
