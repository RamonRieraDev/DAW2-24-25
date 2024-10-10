package actividadesGUI3;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Actividad03 extends JFrame {

	public Actividad03() {

		super("Parámetros críticos");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		JProgressBar prgCombustible = new JProgressBar();
		prgCombustible.setPreferredSize(new Dimension(150, 20));
		prgCombustible.setValue(20);
		
		JLabel lblCombustible = new JLabel("Combustible");

		JProgressBar prgPresiónM1 = new JProgressBar();
		prgPresiónM1.setPreferredSize(new Dimension(150, 20));
		prgPresiónM1.setValue(75);
		
		JLabel lblPresiónM1 = new JLabel("Presión motor 1");

		JProgressBar prgPresiónM2 = new JProgressBar();
		prgPresiónM2.setPreferredSize(new Dimension(150, 20));
		prgPresiónM2.setValue(75);
		
		JLabel lblPresiónM2 = new JLabel("Presión motor 2");

		add(prgCombustible);
		add(lblCombustible);
		add(prgPresiónM1);
		add(lblPresiónM1);
		add(prgPresiónM2);
		add(lblPresiónM2);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		new Actividad03();
	}

}
