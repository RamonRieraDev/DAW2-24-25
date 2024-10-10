package refuerzo;

public class Ejer16Hoja2 {
	
	public static void main(String[] args) {
		
		String alumnos[][] = {
				{"Jose Luis Martínez", "7"},
				{"Antonia Ruiz", "9"},
				{"Marcos Ramírez", "10"},
				{"Juana Herranz", "4"},
				{"Alberto López", "7"},
		};
		
		float total = 0;
		
		for (int fila = 0; fila < alumnos.length; fila++) {
			
			total = total + Float.parseFloat(alumnos[fila][1]);
			
		}
		System.out.println(total);
		
		System.out.println("La nota media del curso es de " + total/alumnos.length + ".");
		
	}

}
