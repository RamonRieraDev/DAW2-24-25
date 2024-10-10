package ejemploMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ejemplo05MapClases {

	public static void main(String[] args) {
		
		Map<Mascota, Dueno> clinica = new HashMap<>();
		
		Mascota mascota1 = new Mascota(123, "Jazz", "Perro");
		Mascota mascota2 = new Mascota(202, "Funky", "Gato");
		Mascota mascota3 = new Mascota(145, "Bebop", "Periquito");
		
		Dueno dueno1 = new Dueno("10020200G", "Agustín", "Lucero");
		Dueno dueno2 = new Dueno("20200300H", "Marga", "Rita");
		Dueno dueno3 = new Dueno("40500600K", "Tati", "Ana");
		
		clinica.put(mascota1, dueno1);
		clinica.put(mascota2, dueno2);
		clinica.put(mascota3, dueno3);
		
//		System.out.println("LISTADO DE CLIENTES:");
//		for(Mascota mascota : clinica.keySet()) {
//			System.out.println(mascota.getNombre()
//					+ clinica.get(mascota) + "\n");
//		}
		
		System.out.println("\nTOSTRING:");
		System.out.println(clinica.values());
	}

	
}
