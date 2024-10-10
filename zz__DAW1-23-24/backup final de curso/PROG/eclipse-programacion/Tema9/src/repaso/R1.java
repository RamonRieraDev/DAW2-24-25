package repaso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class R1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Preguntar al usuario qué nombre quiere dar a la carpeta y al archivo
		// y cambiarles el nombre usando File.renameTo().
		
		JFileChooser elegirArchivo = new JFileChooser();
		
		int eleccion = elegirArchivo.showOpenDialog(null);
		
		if(eleccion != JFileChooser.APPROVE_OPTION) {
			System.out.println("No se ha elegido un archivo.");
			return;
		}
		
		File archivoOriginal = elegirArchivo.getSelectedFile();
		System.out.println(archivoOriginal.toString());
		
		System.out.println("Nombre nuevo: ");
		String nombreArchivo = sc.nextLine();
		
//		System.out.println("Nombre nuevo: ");
//		String carpetaNueva = sc.nextLine();

		archivoOriginal.renameTo(new File("ficheros/" + nombreArchivo));
		//carpeta.renameTo(new File("ficheros/" + carpetaNueva));
		
	}
	
}
