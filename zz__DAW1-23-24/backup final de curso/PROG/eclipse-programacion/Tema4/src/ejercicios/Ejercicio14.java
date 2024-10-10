package ejercicios;

public class Ejercicio14 {
// Crea un método que tome un array de Strings, y un String. 
// Devolverá la posición del String dentro del array, ó -1 si no lo encuentra. 
// Utiliza dos instrucciones return.
	public static void main(String[] args) {

		String[] planetas = {"Mercurio", "Venus", "Tierra", "Marte", "Júpiter", 
				"Saturno", "Urano", "Neptuno", "Plutón"};
		
		String planetaABuscar = "Tierra";
		
		//planetaABuscar = "Tierra";
		
		int pos = buscarPlanetas(planetas, planetaABuscar);
		if(pos == -1) {
			System.out.println(planetaABuscar + " no es un planeta.");
		}else {
			System.out.println(planetaABuscar + " es un planeta y está en la posición "
					+ pos);
		}
		
		
	}

	static int buscarPlanetas(String[] planetas, String planetaABuscar) {
		
		for (int i = 0; i < planetas.length; i++) {
			if(planetas[i].equals(planetaABuscar)) {
				return i;
			}
		}
		
		return - 1;
		
	}
	
}
