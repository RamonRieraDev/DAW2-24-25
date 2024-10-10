package practica02;

public class Actividad03 {
//	En esta actividad tienes que escribir un programa para obtener
//	información de este documento XML:
//
//	<?xml version="1.0" encoding="UTF-8"?>
//	<factura>
//		<fecha>2023-12-20</fecha>
//		<cliente>Rubén Martínez</cliente>
//		<articulos>
//			<articulo>
//				<nombre>Cuaderno Oxford A4</nombre>
//				<precio>3.25</precio>
//			</articulo>
//			<articulo>
//				<nombre>Archivador</nombre>
//				<precio>4</precio>
//			</articulo>
//			<articulo>
//				<nombre>Grapadora grande</nombre>
//				<precio>5.5</precio>
//			</articulo>
//		</articulos>
//	</factura>

	public static void main(String[] args) {

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
		
		String[] xmlDescompuesto = xmlOriginal.split(" ");
				
				//System.out.println("Xml sin espacios ni saltos de línea:");
				
				for (int i = 0; i < xmlDescompuesto.length; i++) {
				
					//System.out.print(xmlDescompuesto[i]);
					xml = xml + xmlDescompuesto[i];
				}
				
//		System.out.println("\n" + xml);
		
//		xml = "<factura><fecha>2023-12-20</fecha><cliente>Rubén" +
//				"Martínez</cliente><articulos><articulo><nombre>Cuaderno Oxford " +
//				"A4</nombre><precio>3.25</precio></articulo><articulo><nombre>Archivador</" +
//				"nombre><precio>4</precio></articulo><articulo><nombre>Grapadora" +
//				"grande</nombre><precio>5.5</precio></articulo></articulos></factura>";
		
//		System.out.println("\n");
				
		System.out.println("#### MI JAVA PARSER ####\n");
//		
//		String fecha = xml.substring(xml.indexOf("<fecha>") + 7, xml.indexOf("</fecha>"));
//        System.out.println("Fecha: \n" + fecha + "\n");
//		
//        
//        System.out.println("Artículos:");
//        
//        int posNombreIni = xml.indexOf("<nombre>");
//    
//        int posNombreFin = xml.indexOf("</nombre>");
//        
//        while (posNombreIni != -1) {
//        	
//        	System.out.println(" * " + xml.substring(posNombreIni + "<nombre>".length(), posNombreFin));
//        
//        	posNombreIni = xml.indexOf("<nombre>", posNombreFin);
//
//        	posNombreFin = xml.indexOf("</nombre>", posNombreIni + "<nombre>".length());
//        	}
        
//        
//        for (int i = xml.indexOf("<nombre>"); i != -1; i = xml.indexOf("<nombre>", i + 1)) {
//            int nombreInicio = i + "<nombre>".length();
//            int nombreFin = xml.indexOf("</nombre>", nombreInicio);
//            String articulo = xml.substring(nombreInicio, nombreFin);
//            System.out.println("  * " + articulo);
//        }
        
        // HE HECHO TANTOS INTENTOS QUE, SIENDO SINCERO, NO SABRÍA HACERLO DE NUEVO...
        // DE TODAS LAS ACTIVIDADES ESTA ME HA PARECIDO MUY MUY DIFÍCIL.
        
        
        
        // Otros intentos fallidos:
        
//        while (xml.indexOf("<nombre>") != -1) {
//        	xml.indexOf("</nombre>", xml.indexOf("<nombre>"));
//        	String articulo = xml.substring(xml.indexOf("<nombre>") + 8, xml.indexOf("</nombre>"));
//        	
//            System.out.println("  * " + articulo);
//            continue;
//        }
        
//		String articulo1 = xml.substring(xml.indexOf("<nombre>") + 8, xml.indexOf("</nombre>"));
//        System.out.println("  * " + articulo1);
//        
//        String articulo2 = xml.substring(xml.indexOf("<nombre>") + 8, xml.indexOf("</nombre>"));
//        System.out.println("  * " + articulo2);
//        
//        String articulo3 = xml.substring(xml.indexOf("<nombre>") + 8, xml.indexOf("</nombre>"));
//        System.out.println("  * " + articulo3);
	
        
	
	}
	

}
