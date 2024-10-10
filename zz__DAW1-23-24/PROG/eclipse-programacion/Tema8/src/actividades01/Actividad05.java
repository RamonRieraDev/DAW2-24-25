package actividades01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Actividad05 {

	public static void main(String[] args) {
		
		String nombre;
		String palabra;
		int contPalabra = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe el nombre del archivo: ");
		nombre = entrada.nextLine();
		
		System.out.print("Escribe la palabra a buscar: ");
		palabra = entrada.nextLine();
				
		try {
			FileReader ARCHIVO = new FileReader("ficheros/" + nombre);
			BufferedReader buferLectura = new BufferedReader(ARCHIVO);
			
			String linea = buferLectura.readLine();
			
			int apariciones;
			
			while(linea != null) {
			
				apariciones = numApariciones(linea, palabra);
				
				contPalabra = contPalabra + apariciones;
								
				linea = buferLectura.readLine();
				
				if(apariciones > 0) {
					contPalabra++;
				}
				
			}
			
			buferLectura.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Error de lectura.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("La palabra " + palabra + " aparece en " + contPalabra + " líneas.");
		
		System.out.println("La palabra " + palabra + " aparece " + contPalabra + " veces.");
		
	}
	
	private static int numApariciones(String linea, String palabra) {
		
		int numPalabras = 0;
		int index = linea.indexOf(palabra);
		
		while(index != -1) {
			
			index = linea.indexOf(palabra, index + palabra.length());
			
			numPalabras++;
			
		}
		
		return numPalabras;
		
	}
	
}
