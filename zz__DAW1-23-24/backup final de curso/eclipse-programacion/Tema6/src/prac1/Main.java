package prac1;

public class Main {

	
	public static void main(String[] args) {

		// Como hemos convertido en abstracta la clase Medio no se puede crear objetos con esta clase.
		// Medio me1 = new Medio();
		
//		Mp3 mp1 = new Mp3();
//		
//		Ogg o1 = new Ogg();
		
		// No funciona así:
//		Medio m1 = new Medio("Canción 1", 23);
		
		Medio m1 = new Mp3("Canción 1", 232, "Ramon Riera", "LoFi", 12);

		m1.reproducir();
		
		// Medio no tiene implementado el método guardar. Así que hacemos un cast:
		((Mp3)m1).Guardar();
		
		Ogg o2 = new Ogg("Canción 1", 232, "Ramon Riera", "LoFi", 12);
		
		Guardable g1 = o2;
		
		g1.Guardar();
		
		
	}

}
