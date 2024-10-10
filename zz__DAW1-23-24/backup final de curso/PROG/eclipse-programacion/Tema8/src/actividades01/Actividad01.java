package actividades01;

import java.io.FileReader;

// Escribe un programa de línea de comandos cuya tarea sea copiar byte a byte un archivo dentro
// de la carpeta ficheros de tu proyecto. El nombre del archivo lo leerá por consola, y el nombre de la
// copia será el mismo anteponiendo la palabra "copia" a la extensión. 
public class Actividad01 {

	public static void main(String[] args) {
		
		try {
			
			FileReader archivo = new FileReader("ficheros/unaimagen.copia.jpg");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
