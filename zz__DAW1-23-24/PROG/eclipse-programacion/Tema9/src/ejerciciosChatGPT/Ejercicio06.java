package ejerciciosChatGPT;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio06 {
// Concatenación de cadenas: Escribe un método que tome una lista de cadenas y 
// devuelva la concatenación de todas las cadenas en una sola cadena.
	public static void main(String[] args) {
		
		List<String> frase = new ArrayList<>();
		
		frase.add("Hola");
		frase.add(", ");
		frase.add("Mundo");
		frase.add("!");
		frase.add(":)");
		
		System.out.println(concatenar(frase));
		
	}
	
	private static String concatenar(List<String> s) {
		
		String sumaFrase = "";
		
		for (String frase : s) {
			sumaFrase += frase;
		}
		
		return sumaFrase;
		
	}
	
}
