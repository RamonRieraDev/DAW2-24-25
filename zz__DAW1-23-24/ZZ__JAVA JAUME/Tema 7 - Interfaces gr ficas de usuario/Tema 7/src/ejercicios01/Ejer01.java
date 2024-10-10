package ejercicios01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejer01 extends JFrame {

	public Ejer01() {

		JOptionPane.showConfirmDialog(null, "¿Formatear el disco duro?", 
				"Confirmación de formateo",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

	}

	public static void main(String[] args) {
		Ejer01 ejercicio = new Ejer01();
	}

}
