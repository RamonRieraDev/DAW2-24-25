package ejerciciosChatGPT;

import java.util.List;

public class Ejercicio05 {
// Longitud promedio de cadenas: Escribe un método que tome una lista de cadenas y 
// devuelva la longitud promedio de esas cadenas.
	public static void main(String[] args) {
		
		List<String> nombres = List.of("Ramon", "Agustín", "Marga", "Tatiana");
		
		System.out.println(media(nombres));
		
	}
	
	private static double media(List<String> c) {
		
		double resultado = 0;
		
		for (String cadena : c) {
			resultado += cadena.length();
		}
		
		return resultado / c.size();
	}
	
}
