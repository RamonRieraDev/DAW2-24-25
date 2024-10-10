package hoja02;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Actividad01 extends JFrame {

	public Actividad01() {

		super("Velocidad de crucero");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

		JSlider sldVelocidad = new JSlider(10, 120, 90);

		sldVelocidad.setPaintLabels(true);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setMajorTickSpacing(20);
		sldVelocidad.setMinorTickSpacing(5);

		add(sldVelocidad);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Actividad01();

	}

}