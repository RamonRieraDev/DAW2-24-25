import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo06 {
	
	public static void main(String[] args) {
		
		//Información del jugagor
		String nombre = "JAMER77";
		int puntos = 10;
		
		try {
			//Abrimos el archivo para escritura
			FileWriter archivo = new FileWriter("ficheros/puntuaciones.txt");
			
			BufferedWriter buffer = new BufferedWriter(archivo);
			
			//Guardamos el nombre del jugador y su puntuación
			buffer.write(nombre + "\n" + puntos);
			
			buffer.close();
			
			System.out.println("Información guardada.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
