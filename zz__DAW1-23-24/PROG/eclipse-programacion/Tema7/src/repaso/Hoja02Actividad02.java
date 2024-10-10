package repaso;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Hoja02Actividad02 extends JFrame{

	public Hoja02Actividad02() {
		
		super("Termostato");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JSlider sldTerm = new JSlider(JSlider.VERTICAL, 0, 25, 16);
		
		sldTerm.setPaintLabels(true);
		sldTerm.setPaintTicks(true);
		sldTerm.setMinorTickSpacing(1);
		sldTerm.setMajorTickSpacing(5);
		
		add(sldTerm);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Hoja02Actividad02();
	}
}
