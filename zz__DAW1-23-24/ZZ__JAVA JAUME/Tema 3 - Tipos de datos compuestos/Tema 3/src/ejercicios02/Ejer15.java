package ejercicios02;

public class Ejer15 {

	public static void main(String[] args) {

		String productos[][] = { 
				{ "Tablet Samsung", "120" }, 
				{ "Móvil Sony", "115" }, 
				{ "Ipad Mini", "290" },
				{ "Móvil HTC", "95" }, 
				};

		System.out.println("Filas: " + productos.length);
		System.out.println("Columnas: " + productos[0].length);		
		System.out.println();
		
		for (int fila = 0; fila < productos.length; fila++) {

			for (int columna = 0; columna < productos[0].length; columna++) {

				System.out.print(productos[fila][columna] + "\t");
			}
			System.out.println();

		}
		
		//Sumamos ahora los precios
		float total = 0;
		//float precio = 0;
		for(int fila = 0; fila< productos.length; fila++) {
			
			//precio = Float.parseFloat(productos[fila][1]);
			//total = total + precio;
			
			total = total + Float.parseFloat(productos[fila][1]);
		}
		System.out.println();
		System.out.println("\nEl precio final es de: " + total + " euros.\n\n");
		
		int posMin = 0;
		int posMax = 0;
		
		for(int fila = 0; fila < productos.length; fila++) {
			
				if(Float.parseFloat(productos[fila][1]) < 
						Float.parseFloat(productos[posMin][1])) {				
					posMin = fila;
				}
				
				if(Float.parseFloat(productos[fila][1]) > 
						Float.parseFloat(productos[posMax][1])) {
					posMax = fila;
				}
			
		}
		
		System.out.println("El producto más barato es: " + productos[posMin][0] + 
				" con un precio de " + productos[posMin][1] + " euros");
		
		System.out.println("El producto más caro es: " + productos[posMax][0] + 
				" con un precio de " + productos[posMax][1] + " euros");
		
	}

}
