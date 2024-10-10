import java.io.File;

public class Ejemplo08 {

	public static void main(String[] args) {

		//Creamos una carptea configuracion en la carpeta del poryecto
		File carpeta = new File("configuracion");
		boolean creada = carpeta.mkdir();

		if (creada) {
			System.out.println("La carpeta se ha creado correctamente.");
		} else {
			System.out.println("La carpeta no se ha creado.");
		}
		
		//Creamos una ruta con varias carpetas
		File ruta = new File("diogenes/datos/jaime");
		
		if(ruta.mkdirs()) {
			System.out.println("La ruta se ha creado.");
		}else {
			System.out.println("La ruta no se ha creado.");
		}
		
		//Creamos una carpeta llamada "Ejemplo08" en nuestra carpeta personal
		String rutaEjemplo08 = System.getProperty("user.home") + "/ejemplo08";
		File ejemplo08 = new File(rutaEjemplo08);
		
		
		if(ejemplo08.mkdir()) {
			System.out.println("Se ha creado la carpeta.");
		} else {
			System.out.println("No se ha creado la carpeta.");
		}
	}
}
