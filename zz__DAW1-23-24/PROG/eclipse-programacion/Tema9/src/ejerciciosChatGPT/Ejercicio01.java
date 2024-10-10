package ejerciciosChatGPT;

import java.util.List;

public class Ejercicio01 {
// Suma de elementos: Escribe un método que tome una lista de números enteros y 
// devuelva la suma de todos los elementos.
	public static void main(String[] args) {
		
		List<Integer> numeros = List.of(1, 2, 3, 4, 5);
		System.out.println(SumaNumeros(numeros));
		
	}
	
	private static int SumaNumeros(List<Integer> numeros) {
		
		int total = 0;
		
		for(Integer suma : numeros) {
			total += suma;
		}
		
		return total;
	}
	
}
