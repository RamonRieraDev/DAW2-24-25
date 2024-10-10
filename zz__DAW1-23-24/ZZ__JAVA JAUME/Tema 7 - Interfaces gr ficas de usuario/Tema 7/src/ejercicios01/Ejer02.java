package ejercicios01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejer02 extends JFrame {

	public Ejer02() {

		JOptionPane.showInputDialog(null, "Escribe tu DNI:", 
				"Confirmación de identidad", 
				JOptionPane.QUESTION_MESSAGE);

	}

	public static void main(String[] args) {
		Ejer02 ejercicio = new Ejer02();
	}

}
