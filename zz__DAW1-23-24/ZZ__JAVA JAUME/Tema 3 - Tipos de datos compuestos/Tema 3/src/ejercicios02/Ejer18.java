package ejercicios02;

public class Ejer18 {

	public static void main(String[] args) {

		String alumnos[][] = { 
				{ "Jose Luis", "7" }, 
				{ "Antonia Ruiz", "9" }, 
				{ "Marcos Ramírez", "10" },
				{ "Juana Herranz", "4" }, 
				{ "Alberto López", "7" }, 
				};

		System.out.println("Alumnos        Notas");
		System.out.println("=============  =======");
		
		float notaMedia = 0;

		for (int fila = 0; fila < alumnos.length; fila++) {
	
			for(int columna = 0; columna < alumnos[0].length; columna++) {
				
				System.out.print(alumnos[fila][columna] + "\t");
			}
			notaMedia += Float.parseFloat(alumnos[fila][1]);
			System.out.println();
		}
	
		System.out.println("\n\nLa nota media de los alumnos es: " 
		+ notaMedia / alumnos.length);
		
		int filaMin = 0;
		int filaMax = 0;
		
		for(int fila = 0; fila < alumnos.length; fila++) {
			
			if(Float.parseFloat(alumnos[fila][1]) < 
					Float.parseFloat(alumnos[filaMin][1])) {				
				filaMin = fila;
			}
			
			if(Float.parseFloat(alumnos[fila][1]) > 
					Float.parseFloat(alumnos[filaMax][1])) {				
				filaMax = fila;
			}
			
		}
		
		System.out.println("\n\n" + alumnos[filaMin][0] 
				+ " tiene la nota más baja, un " + alumnos[filaMin][1] + ".");
		
		System.out.println("\n" + alumnos[filaMax][0] 
				+ " tiene la nota más baja, un " + alumnos[filaMax][1] + ".");
	}

}
