package actividades;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Actividad01 extends JFrame{

	public static void main(String[] args) {
		
		JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?", "Confirmación de formateo", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		
	}
	
}
