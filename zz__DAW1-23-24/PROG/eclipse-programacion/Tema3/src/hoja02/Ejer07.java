package hoja02;

public class Ejer07 {

	public static void main(String[] args) {

		String[] dia = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

		int[] espectadores = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };

		int posMin = 0;

		int posMax = 0;
	

		for (int i = 0; i < espectadores.length; i++) {

			if (espectadores[i] < espectadores[posMin]) {
				posMin = i;
				
			}
			if (espectadores[i] > espectadores[posMax]) {
				posMax = i;
			}
		}
		
		
		System.out.println("El día de más audiencia fue el: " + dia[posMax] 
				+  " con " + espectadores[posMax] + " espectadores");
		
		System.out.println("El día de menos audiencia fue el: " + dia[posMin] 
				+  " con " + espectadores[posMin] + " espectadores");
	}

}
