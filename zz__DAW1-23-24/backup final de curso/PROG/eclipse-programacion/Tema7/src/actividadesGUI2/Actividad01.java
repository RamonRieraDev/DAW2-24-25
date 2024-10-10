package actividadesGUI2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Actividad01 extends JFrame {

	public Actividad01() {
		super("Velocidad de crucero");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JSlider sldVelocidad = new JSlider(JSlider.HORIZONTAL, 10, 120, 20);
		sldVelocidad.setMajorTickSpacing(20);
		sldVelocidad.setMinorTickSpacing(5);
		sldVelocidad.setPaintLabels(true);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setPreferredSize(new Dimension(300, 50));

		add(sldVelocidad);

		setVisible(true);

	}

	public static void main(String[] args) {

		Actividad01 ventana = new Actividad01();

	}

}