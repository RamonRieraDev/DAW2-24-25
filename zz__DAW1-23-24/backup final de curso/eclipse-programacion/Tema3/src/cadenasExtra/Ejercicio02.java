package cadenasExtra;

import java.util.Scanner;

public class Ejercicio02 {
//	Crea un programa que te pregunte el nombre de un archivo (incluyendo su extensión)
//	y te indique por separado el nombre y la extensión.
//	Usa dos métodos, nombreArchivo() y extensionArchivo(), que reciban como argumento
//	un nombre completo de archivo y devuelvan el nombre y la extensión, respectivamente.
	public static void main(String[] args) {

//		Scanner entrada = new Scanner(System.in);
//
//		System.out.println("*** Separador de nombre y extensión de archivos ***\n");
//		System.out.println("Escribe el nombre de un archivo incluyendo su extensión: ");
//		String archivo = entrada.nextLine();
//
//		System.out.println("Nombre: " + nombreArchivo(archivo));
//		System.out.println("Extensión: " +extensionArchivo(archivo));
//
//	}
//
//	static String nombreArchivo(String archivo) {
//
//		String separacion = ".";
//		String nombreArchivo = "";
//
//		for (int i = 0; i < archivo.indexOf(separacion); i++) {
//
//			nombreArchivo = nombreArchivo + archivo.charAt(i);
//
//		}
//		return nombreArchivo;
//	}
//
//	static String extensionArchivo(String archivo) {
//
//		String separacion = ".";
//		String nombreExtension = "";
//
//		for (int i = archivo.indexOf(separacion) + 1; i < archivo.length(); i++) {
//
//			nombreExtension = nombreExtension + archivo.charAt(i);
//
//		}
//		
//		return nombreExtension;

		Scanner entrada = new Scanner(System.in);
		
		String archivo;
		
		System.out.println("Ingresa nombre archivo con su extensión");
		archivo = entrada.nextLine();
		
		int finArchivo = archivo.lastIndexOf(".");
		
		System.out.println("Archivo: " + archivo.substring(0, finArchivo));
		System.out.println("Extensión: " + archivo.substring(finArchivo));
		
	}

}
