package ejemploMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo02Map {

	public static void main(String[] args) {
		
		// Mapa que relacione DNI (clave) y persona (valor):
		Map<String, String> personas = new HashMap<>();
		
		// Añadimos algunas personas:
		personas.put("10101010A", "Agustín Fernández");
		personas.put("20202020B", "Marga Llompart");
		personas.put("30303030C", "Tatiana Riera");
		personas.put("40404040D", "Juan José Almedo");
		
		// Preguntamos al usuario un DNI y le decimos el nombre de la persona:
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n" + "Introduce el DNI: ");
		String dni = sc.nextLine();
		System.out.println(personas.get(dni));
		
		if(personas.containsKey(dni)) {
			System.out.println("\n" + "El nombre es: " + personas.get(dni));
		} else {
			System.out.println("\n" + "DNI no encontrado.");
		}
		
		// Eliminamos a la persona cuyo DNI hemos leído:
		personas.remove(dni);
		System.out.println(personas.toString());
		
		// Ver en forma de tabla la información del mapa:
		System.out.println("\n" + "DNI:      Nombre:");
		for(String clave : personas.keySet()) {
			System.out.println(clave + " " + personas.get(clave));
		}
		
		// Lista de nombres en el mapa:
		System.out.println("\n" + "Nombres guardados en el mapa: ");
		for(String nombres : personas.values()) {
			System.out.println("- " + nombres);
		}
	}
}
