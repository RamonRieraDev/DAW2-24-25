package ejercicios02;

public class Ejer14 {

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
		System.out.println("El precio final es de: " + total + " euros.");
	}

}
