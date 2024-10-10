package ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo07TransformarArchivo {

	public static void main(String[] args) {
		
		final String NOMBRE_ARCHIVO_ORIGINAL = "ficheros/nombres.txt";
		
		final String NOMBRE_ARCHIVO_TEMPORAL = "ficheros/nombres.tmp";
		
		// Abrir el archivo original para lectura.
		
		
		try {
			BufferedReader bufferLectura = new BufferedReader(new FileReader(NOMBRE_ARCHIVO_ORIGINAL));
			
			// Abrir el archivo temporal para escritura.
			BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO_TEMPORAL)); 
			
			// Bucle:
			//  - Leer la primera línea del original.
			String linea = bufferLectura.readLine();
			while(linea != null) {
				bufferEscritura.write(linea.toUpperCase());
			}
			
			bufferEscritura.close();
			bufferLectura.close();
			
			//  - Pasamos la línea a mayúsculas.
			
			//  - Escribir la línea en el archivo temporal.
			
			// Cerrar los buffers.
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		// Eliminar el archivo original.
		
		// Renombrar el archivo temporal para que se llame como el temporal. 
	}
	
}
