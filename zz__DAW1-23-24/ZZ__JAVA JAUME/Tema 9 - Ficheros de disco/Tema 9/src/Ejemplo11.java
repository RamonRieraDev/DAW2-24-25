import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo11 {

	public static void main(String[] args) {

		// Escribe un programa que cree la siguiente estructura de carpetas
		// en tu carpeta personal:
		// ejemplo11
		// info
		// Dentro de la carpeta info, aparecerá un archivo de texto
		// "version.txt" con la siguiente información:
		// Ejemplo11
		// Autor: Jaume
		// Versión: 1.0
		// Finalmente, el programa renombrará este archivo como "acercade.txt".

		//
		String ruta = System.getProperty("user.home") + "/ejemplo11/info";
		File carpetas = new File(ruta);
		if (carpetas.mkdirs()) {
			System.out.println("Se ha creado la ruta correctamente.");

		}

		try {
			// Creamos archivo y escribimos los datos.
			// Posam + "/version.txt" perquè amb ruta només arribam fins a les carpetes
			BufferedWriter buffer = new BufferedWriter(new FileWriter(ruta + "/version.txt"));

			buffer.write("Ejemplo11\nAutor: Jaume\nVersión: 1.0");

			buffer.close();
		} catch (IOException e) {
			System.out.println("Error accediendo al archivo.F");
		}

		// Renombramos el archivo
		File original = new File(ruta + "/version.txt");

		File nuevo = new File(ruta + "/acercade.txt");

		original.renameTo(nuevo);

		System.out.println("Fin.");

	}
}
