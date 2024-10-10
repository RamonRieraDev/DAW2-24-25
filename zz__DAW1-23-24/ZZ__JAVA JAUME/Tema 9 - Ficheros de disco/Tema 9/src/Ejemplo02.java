import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejemplo02 {
	
	public static void main(String[] args) {
		
		try {
			//Abrimos el archivo original para lectura.
			FileInputStream original = new FileInputStream("ficheros/gatosMonis.jpg");
			
			//Abrimos el archivo copia para escritura.
			FileOutputStream copia = new FileOutputStream("ficheros/copia.jpg");
			
			
			//Leemo el primer byte del archivo original.
			int byteLeido = original.read();
			
			//Guardamos cada byte leído y leemos el siguiente
			while(byteLeido != -1) {
				
				copia.write(byteLeido);
				byteLeido = original.read();
			}
			
			//Cerramos los dos archivos
			original.close();
			copia.close();
			
			System.out.println("Copia finalizada.");
		} catch (FileNotFoundException e) {
			System.out.println("Error: no existe el archivo.");
		} catch (IOException e) {
			System.out.println("Error en entrada/salida del programa.");
		}
	}

}
