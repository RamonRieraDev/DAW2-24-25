package ejerciciosChatGPT;

import java.util.List;

public class Ejercicio04 {
// Buscar elemento máximo: Escribe un método que tome una lista de números enteros y 
// devuelva el elemento máximo de la lista.
	public static void main(String[] args) {
		
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 2);
		
		System.out.println(maximo(numeros));
		
	}
	
	private static int maximo(List<Integer> n) {
		
		int aux = n.get(0);
		
		for (int num : n) {
			if(aux < num) {
				aux = num;
			}
		}
		
		return aux;
	}
	
}
