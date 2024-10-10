package ejerciciosChatGPT;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio07 {
// Buscar cadena más larga: Escribe un método que tome una lista de cadenas y devuelva la cadena más larga de la lista.
	
	public static void main(String[] args) {
		
		List<String> cadenas = new ArrayList<>();
		cadenas.add("1");
		cadenas.add("12");
		cadenas.add("123");
		cadenas.add("1234567");
		
		System.out.println(cadenas.get(1));
		
		System.out.println(cadenaMasLarga(cadenas));
	}
	
	private static String cadenaMasLarga(List<String> s) {
		
		String masLargo = s.get(0);
		
		for (String cadena : s) {
			if(masLargo.length() < cadena.length()) {
				masLargo = cadena;
			}
		}
		
		return masLargo;
		
	}
	
}
