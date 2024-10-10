package repaso;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un nombre de archivo y te lo crearé en la carpeta ficheros");
		String nombreArchivo = sc.nextLine();
		
		File archivo = new File("ficheros/" + nombreArchivo);
		try {
			archivo.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Dime un nombre de carpeta y te lo crearé en la carpeta ficheros");
		String nombreCarpeta = sc.nextLine();
		
		File carpeta = new File("ficheros/" + nombreCarpeta);
		boolean resultado = carpeta.mkdir();
		
		if(resultado) {
			System.out.println("ok");
		} else {
			System.out.println("No se ha creado la carpeta.");
		}
	}
	
}
