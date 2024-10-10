package actividades;

import java.util.ArrayList;
import java.util.List;

public class ArrayListActoresFallOut {

	public static void main(String[] args) {
		
		List<String> actores = new ArrayList<>();
		
		actores.add("Ella Purnell");
		actores.add("Walton Goggins");
		actores.add(2, "Aaron Clifton Moten");
		
		System.out.println("\nLista de actores: " + actores.toString());
		
		System.out.println("\nEn la posición 0 está: " + actores.get(0));
		System.out.println("\nEn la posición 1 está: " + actores.get(1));
		
		mostrarLista(actores);
		
		String borrado = actores.remove(1);
		System.out.println("\nSe ha borrado el/la actor/actriz: " + borrado);
		
		System.out.println("\nEliminar " + actores.get(0));
		boolean resultado = actores.remove("Ella Purnell");
		System.out.println("\nResultado de borrar Ella Purnell: " + resultado);
		mostrarLista(actores);
		
		System.out.println("\nSustituir Walton Goggins por Moisés Arias: ");
		borrado = actores.remove(0);
		actores.add(0, "Moisés Arias");
		System.out.println("\nSe ha borrado el/la actor/actriz: " + borrado);
		System.out.println("\nSe ha añadido el/la actor/actriz: " + actores.get(0));
		
		actores.add("Ella Purnell");
		actores.add("Walton Goggins");
		actores.add(2, "Aaron Clifton Moten");
		
		mostrarLista(actores);
		
		System.out.println("\nBuscando el/la actor/actriz: ");
		boolean existe = actores.contains("Ella Purnell");
		System.out.println("¿Existe Ella Purnell?: " + existe);
		
	}
	
	private static void mostrarLista(List<String> lista) {
		
		System.out.println("\n Lista de actores: ");
		for(String actores : lista) {
			System.out.println(" - " + actores);
		}
		
	}
	
}
