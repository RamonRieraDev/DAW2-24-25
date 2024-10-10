package repaso;

import java.io.File;

public class R3 {

	public static void main(String[] args) {

		File file = new File("ficheros");

		//borrar(file);
		
		System.out.println(file.listFiles());

	}
/**
 * 
 * @param file
 */
	public static void borrar(File file) {
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				borrar(f);
			}
		}
		file.delete();
	}

}
