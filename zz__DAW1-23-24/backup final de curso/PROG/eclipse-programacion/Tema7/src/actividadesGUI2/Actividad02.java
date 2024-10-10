package actividadesGUI2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Actividad02 extends JFrame {

	public Actividad02() {
		super("Termostato");
		setSize(300, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JSlider sldTemperatura = new JSlider(JSlider.VERTICAL, 0, 25, 17);
		sldTemperatura.setMajorTickSpacing(5);
		sldTemperatura.setMinorTickSpacing(1);
		sldTemperatura.setPaintLabels(true);
		sldTemperatura.setPaintTicks(true);
		sldTemperatura.setPreferredSize(new Dimension(100, 400));

		JLabel lblTemperatura = new JLabel("Temperatura (ºC)");
		
		add(sldTemperatura);
		add(lblTemperatura);
		
		setVisible(true);

	}

	public static void main(String[] args) {

		Actividad02 ventana = new Actividad02();

	}

}