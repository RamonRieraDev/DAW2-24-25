package pruebas;

public class Prueba01 {

	public static void main(String[] args) {

		String frase = "hola";
		
		System.out.println(frase.substring(0, frase.length() - 1));
		
		String xmlOriginal = 
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
		
		String xml = "";


	}

}
