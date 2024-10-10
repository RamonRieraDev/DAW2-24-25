package ejemploMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo03Map {

	public static void main(String[] args) {
		
		Map<Integer, String> coches = new HashMap<>();
		
		coches.put(1, "Seat Panda\n");
		coches.put(2, "Peugeot 3008");
		coches.put(7, "Peugeot 3008 7");
		coches.put(9, "Peugeot 3008 9");
		
		//System.out.println(coches.toString());
		System.out.println(coches);
	}
}
