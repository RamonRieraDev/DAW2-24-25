package ejemplos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Ejemplo11ProgressBar extends JFrame{

	public Ejemplo11ProgressBar() {
		
		super("Cansancio");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lblNivelEnergia = new JLabel("Nivel de energía");
		
		JProgressBar prgNivelEnergia = new JProgressBar(0, 100);
		prgNivelEnergia.setPreferredSize(new Dimension(300, 30));
		prgNivelEnergia.setValue(80);
		prgNivelEnergia.setStringPainted(true);
		prgNivelEnergia.setForeground(Color.red);
		prgNivelEnergia.setBackground(Color.white);
		
		add(lblNivelEnergia);
		add(prgNivelEnergia);
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new Ejemplo11ProgressBar();
		
	}
	
}
