package hoja02;

public class Ejer14 {

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
		
	}

}
