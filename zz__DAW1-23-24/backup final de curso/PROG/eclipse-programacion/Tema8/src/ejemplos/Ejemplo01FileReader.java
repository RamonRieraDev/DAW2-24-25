package ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo01FileReader {

	public static void main(String[] args) {

		try {
			// Creamos un FileReader para acceder al archivo.
			FileReader archivo = new FileReader("ficheros/nombres.txt");

			// Creamos un BufferedReader para acceder al archivo usando un buffer
			// (más eficiente).
			BufferedReader buffer = new BufferedReader(archivo);

//			// Leemos la primera línea.
//			String linea = buffer.readLine();
//			System.out.println(linea);
//
//			// Leemos la segunda línea.
//			linea = buffer.readLine();
//			System.out.println(linea);
//
//			// Leemos la tercera línea. Saldrá null porque no existe una
//			// 3ª línea.
//			linea = buffer.readLine();
//			System.out.println(linea);
			
			// Leemos el archivo línea a línea.
			String linea = buffer.readLine();
			while(linea != null) {
				System.out.println(linea);
				linea = buffer.readLine();
			}
			System.out.println("Fin de la lectura.");

			// Cerramos buffer de entrada.
			buffer.close();

		} catch (FileNotFoundException e) {
			System.out.println("Error: no se ha encontrado el archivo.");
			
			// Para averiguar porqué no se puede leer ese archivo. Por ejemplo:
			// que no se tenga permiso de acceso a ese archivo.
		} catch (IOException e) {
			System.out.println("Se ha producido un error entrada/salida.");
		}

	}

}
