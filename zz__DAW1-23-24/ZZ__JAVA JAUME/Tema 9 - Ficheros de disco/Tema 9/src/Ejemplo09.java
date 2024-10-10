import java.io.File;

public class Ejemplo09 {

	public static void main(String[] args) {

		
		//Borrar un archivo
		File archivo = new File("ficheros/index.html");

		archivo.delete();
		
		//Renombrar un archivo
		File archivoOriginal = new File("ficheros/numeros.txt");
		
		File archivoNuevo = new File("ficheros/nada.txt");
		
		archivoOriginal.renameTo(archivoNuevo);
	}

}
