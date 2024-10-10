package ejercicios;

public class Ejercicio14Repaso {

	public static void main(String[] args) {

		String[] planetas = {"Mercurio", "Venus", "Tierra", "Marte"};
		
		String planetaABuscar = "Tierra";
		
		buscarPlanetas(planetas, planetaABuscar);

	}

	static int buscarPlanetas(String[] planetas, String planetaABuscar) {
		for (int i = 0; i < planetas.length; i++) {
			if(planetas[i].equals(planetaABuscar)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
}
