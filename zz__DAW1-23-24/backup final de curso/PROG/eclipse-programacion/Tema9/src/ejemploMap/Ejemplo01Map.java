package ejemploMap;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo01Map {

	public static void main(String[] args) {

		// Clave String, Valor String:
		Map<String, String> coches = new HashMap<>();

		// Añadimos unos coches al mapa:
		coches.put("1000DEF", "Peugeot 308 5P");
		coches.put("2000EBA", "Mercedes CL 200");
		coches.put("3000ABC", "Renault Megane");

		// Accedemos a la información (valor) de un coche a partir de
		// su matrícula:
		System.out.println(coches.get("1000DEF"));
		System.out.println(coches.toString());

		// Reemplazamos la información de la matrícula 1000DEF:
		coches.put("1000DEF", "Peugeot 307 5 puertas");
		System.out.println("\n" + coches.get("1000DEF"));
		System.out.println(coches.toString());

		// Borramos una entrada del mapa:
		coches.remove("1000DEF");
		System.out.println("\n" + coches.toString());
		
		// Comprobamos si la matrícula está o no:
		System.out.println("\n" + "Existe la matrícula 2000EBA en el mapa? " + coches.containsKey("2000EBA"));
		
		// Comprobamos si los datos de un coche (valor) están en el mapa:
		System.out.println("\n" + "Existe la matrícula Renault Megane en el mapa? " + coches.containsValue("Renault Megane"));
	
		// Reemplazamos un valor:
		coches.replace("2000EBA", "Mercedes CL300");
		System.out.println("\n" + coches.toString());
		// DIFERENCIA ENTRE PUT Y REPLACE: put añade pero no actualiza. Replace sí actualiza. Si no pones bien
		// la clave en replace y no la reconoce el programa no hace nada.
		
		// Añadimos una entrada siempre que no exista la clave:
		coches.putIfAbsent("1500FFF", "Ford Fiesta");
		System.out.println("\n" + coches.toString());
		
		// Recorremos un mapa:
		for(String matricula : coches.keySet()) {
			System.out.println("\n" + "Matrícula: " + matricula + "\n" + "Descripción: " + coches.get(matricula));
		}
		
		// Mostramos las descripciones de los coches:
		System.out.println("\n" + "Descripciones de los coches del mapa:");
		for(String descripcion : coches.values()) {
			System.out.println(descripcion);
		}
		
		// Mostramos el tamaño del mapa (número de filas):
		System.out.println("\n" + "Tamaño del mapa: " + coches.size() + " filas.");
		
		// Vemos si el mapa está vacío:
		System.out.println("\n" + "¿Está vacío el mapa? " + coches.isEmpty());
		
		// Borramos todo el contenido del mapa:
		coches.clear();
		System.out.println("\n" + "¿Está vacío el mapa? " + coches.isEmpty());
	}

}
