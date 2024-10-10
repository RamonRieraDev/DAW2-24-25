package ejemplos;

import javax.swing.JOptionPane;

public class Ejemplo06PanelesDialogo {

	public static void main(String[] args) {

//		JOptionPane.showMessageDialog(null, "El programa se va a cerrar por un error inesperado.");
//		
//		JOptionPane.showMessageDialog(null, "El programa se va a cerrar por un error inesperado.", "Ejemplo06", JOptionPane.ERROR_MESSAGE);

//		JOptionPane.showConfirmDialog(null, "¿Quires guardar los cambios?");

//		JOptionPane.showConfirmDialog(null, "¿Quires guardar los cambios?", "Ejemplo06", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

//		JOptionPane.showConfirmDialog(null, "¿Quires guardar los cambios?", "Ejemplo06", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//
//		int eleccion = JOptionPane.showConfirmDialog(null, "¿Quires guardar los cambios?", "Ejemplo06",
//				JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//
//		if (eleccion == JOptionPane.YES_OPTION) {
//			System.out.println("Guardando los cambios...");
//		} else {  
//			System.out.println("Cambios no guardados.");
//		}
//		// Si = 0; No = 1; x = -1 (x es cerrar la ventana)
//		System.out.println(eleccion);

		String dni = JOptionPane.showInputDialog(null, "Escribe tu DNI:", "DNI", JOptionPane.INFORMATION_MESSAGE);
		if (dni != null && !dni.trim().equals("")) {
			System.out.println("Tu DNI es " + dni);
		} else {
			System.out.println("No has proporcionado tu DNI.");
		}
		
		

	}

}
