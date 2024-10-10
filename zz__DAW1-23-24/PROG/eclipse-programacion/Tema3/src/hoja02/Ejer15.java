package hoja02;

public class Ejer15 {

	public static void main(String[] args) {

		System.out.println("Artículos");
		System.out.println("===============================");
		
		String precios[][] = {
				{"Tablet Samsung", "120"},
				{"Móvil Sony", "115"},
				{"Ipad Mini", "290"},
				{"Móvil HTC", "95"}
				};

		for (int fila = 0; fila < precios.length; fila++) {
			
			for (int col = 0; col < precios[0].length; col++){
				
				System.out.print(precios[fila][col] + "\t");
			}
			System.out.println();
		}
		
		System.out.println();
		
		float suma = 0;
		
		for (int fila = 0; fila < precios.length; fila++) {
			
			suma = suma + Float.parseFloat(precios[fila][1]);
			
		}
		
		System.out.println("Total: " + suma + " €");
		
		System.out.println();
		
		int posMin = 0;
		int posMax = 0;
		
		for (int fila = 0; fila < precios.length; fila++) {
			
			if (Float.parseFloat(precios[fila][1]) < Float.parseFloat(precios[posMin][1])) {
				posMin = fila;
			} else if (Float.parseFloat(precios[fila][1]) > Float.parseFloat(precios[posMax][1])) {
				posMax = fila;
			}
		}
		System.out.println("El producto " + precios[posMin][0] + " tiene el precio mínimo de la "
				+ "tabla con " + precios[posMin][1] + " €.");
		System.out.println("El producto " + precios[posMax][0] + " tiene el precio máximo de la "
				+ "tabla con " + precios[posMax][1] + " €.");
	}

}
