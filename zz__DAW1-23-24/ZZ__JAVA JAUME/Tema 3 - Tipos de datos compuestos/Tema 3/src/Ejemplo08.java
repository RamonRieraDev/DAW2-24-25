
public class Ejemplo08 {

	public static void main(String[] args) {

		String empleados[][] = { 
				{ "Vázquez del Valle", "Elier", "1300" }, 
				{ "Buendía Galindo", "Fernando", "1500" },
				{ "Aguiló Pizà", "Jaume", "800" }, 
				{ "González Torelló", "Guillermo", "2000" },
				{ "Alfaro Esparcia", "María del Carmen", "1700" }, 
				{ "Losada Novo", "Iván", "1900" },
		};
		
		//Buscar el mínimo y el máximo sueldo.
		
		int posMin = 0;
		int posMax = 0;
		
		for(int fila = 0; fila < empleados.length; fila++) {
			
			if(Float.parseFloat(empleados[fila][2]) < 
					Float.parseFloat(empleados[posMin][2])) {				
				posMin = fila;
			}
			
			if(Float.parseFloat(empleados[fila][2]) > 
					Float.parseFloat(empleados[posMax][2])) {
				posMax = fila;
			}
		}
		
		System.out.println("El empleado que menos gana es: " 
		+ empleados[posMin][1] + " " + empleados[posMin][0] + " (" 
				+ empleados[posMin][2] + " euros).\n" );
		
		System.out.println("El empleado que más gana es: " 
				+ empleados[posMax][1] + " " + empleados[posMax][0] + " (" 
						+ empleados[posMax][2] + " euros)." );
	}
}
