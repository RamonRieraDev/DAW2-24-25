
public class Ejemplo09 {

	public static void main(String[] args) {
		
		int asistentes = 5000;
		
		long personas = asistentes;
		
		// Conversión implícita
		System.out.println(personas);
		
		// Conversión implícita
		float gente = personas;
		
		System.out.println(gente);
		
		// Conversión explícita, necesario hacer un cast para que no de error
		long jugadores = 1000;
		
		int players = (int) jugadores; //hacer cast = amoldar; es lo que hay entre paréntesis
		
		System.out.println(players);
		
		// Conversión explícita
		double precio = 2300.50;
		
		float precio2 = (float) precio;
		
		System.out.println(precio2);
	}

}
