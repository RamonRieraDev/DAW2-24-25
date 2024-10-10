package practica02;

import java.util.Arrays;

public class Repaso {

	public static void main(String[] args) {

		String xml = 
				"<factura>" +
				"<fecha>2023-12-20</fecha>" +
				"<cliente>Rubén Martínez</cliente>" +
				"<articulos>" +
				"<articulo>" +
				"<nombre>Cuaderno Oxford A4</nombre>" +
				"<precio>3.25</precio>" +
				"</articulo>" +
				"<articulo>" +
				"<nombre>Archivador</nombre>" +
				"<precio>4</precio>" +
				"</articulo>" +
				"<articulo>" +
				"<nombre>Grapadora grande</nombre>" +
				"<precio>5.5</precio>" +
				"</articulo>" +
				"</articulos>" +
				"</factura>";
		

		
		int inicio = xml.indexOf("<fecha>");
		int fin = xml.indexOf("</fecha>");
		
		System.out.println(xml.substring(inicio + "<fecha>".length(), fin));

	}

}
