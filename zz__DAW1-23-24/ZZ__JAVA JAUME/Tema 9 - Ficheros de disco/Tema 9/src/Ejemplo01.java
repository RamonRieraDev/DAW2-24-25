import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		//Preguntamos que archivo quiere abrir.
		System.out.println("¿Qué archivo quieres coger?");	
		String nombreArchivo = entrada.nextLine();
		
		//Abrimos el archivo para lectura


		try {
			FileInputStream archivo = new FileInputStream("ficheros/" + nombreArchivo);
			
			//Leemos el primer byte
			int byteLeido = archivo.read();
			int contadorBytes = 0;
			//Vamos leyendo el archivo byte a byte.
			while(byteLeido != -1) {
				
				System.out.println(byteLeido);
				byteLeido = archivo.read();
				
				contadorBytes++;
				
			}
			System.out.println("Hay " + contadorBytes + " bytes.");
			//Cerramos el archivo
			archivo.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
