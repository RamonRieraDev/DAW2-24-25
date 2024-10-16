package ejemplos;

import java.io.File;

public class Ejemplo05File {

	public static void main(String[] args) {
		
		File carpeta = new File("trabajos");
		
		boolean resultado = carpeta.mkdir();
		
		if(resultado) {
			System.out.println("Carpeta creada.");
		} else {
			System.out.println("No se ha podido crear la carpeta.");
		}
		
		// Crear una serie de carpetas.
		File carpeta2 = new File("apuntes/prog/tema8");
		
		// resultado = carpeta2.mkdir();
		// Así no se podrá a no ser que sea con mkdirs.
		resultado = carpeta2.mkdirs();
		
		if(resultado) {
			System.out.println("Carpeta creada.");
		} else {
			System.out.println("No se ha podido crear la carpeta.");
		}
		
		// Borrar una carpeta.
		resultado = carpeta.delete();
		
		if(resultado) {
			System.out.println("Carpeta borrada.");
		} else {
			System.out.println("No se ha podido borrar la carpeta.");
		}
		
		// Borrar un archivo.
		File archivo = new File("ficheros/contactos.txt");
		
		resultado = archivo.delete();
		
		if(resultado) {
			System.out.println("Archivo borrada.");
		} else {
			System.out.println("No se ha podido borrar el archivo.");
		}
		
	}
	
}
