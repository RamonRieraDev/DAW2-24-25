package actividadesGUI4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Actividad01 extends JFrame implements ActionListener{

	private JLabel lblImagen;
	private JButton btnBlackRain;
	private JButton btnCasoWinslow;
	private JButton btnAsaltoDistrito13;
	private JButton btnBladeRunner;
	
	public Actividad01() {
		super("Fotogramas");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		setLocationRelativeTo(null);

//		// PANEL SUPERIOR
//		JPanel panelSuperior = new JPanel();
//		panelSuperior.setPreferredSize(new Dimension(50, 380));
		
		btnBlackRain = new JButton("Black rain");
		btnBlackRain.addActionListener(this);
		
		btnCasoWinslow = new JButton("El caso winslow");
		btnCasoWinslow.addActionListener(this);
		
		btnAsaltoDistrito13 = new JButton("Asalto al distrito 13");
		btnAsaltoDistrito13.addActionListener(this);
		
		btnBladeRunner = new JButton("Blade runner");
		btnBladeRunner.addActionListener(this);
		
		lblImagen = new JLabel();
		
		//lblImagen.setIcon(new ImageIcon("iconos/pelis/el_caso_winslow.jpg"));
		
		add(btnBlackRain);
		add(btnCasoWinslow);
		add(btnAsaltoDistrito13);
		add(btnBladeRunner);
		add(lblImagen);

		setVisible(true);
	}

	
	public static void main(String[] args) {
		
		new Actividad01();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object btn = e.getSource();
		
		if(btn == btnBlackRain) {
			lblImagen.setIcon(new ImageIcon("/Users/Ramon Riera/OneDrive/Escritorio/iconos/pelis/black_rain.jpg"));
		}
		
		if(btn == btnCasoWinslow) {
			lblImagen.setIcon(new ImageIcon("/Users/Ramon Riera/OneDrive/Escritorio/iconos/pelis/el_caso_winslow.jpg"));
		}
		
		if(btn == btnAsaltoDistrito13) {
			lblImagen.setIcon(new ImageIcon("/Users/Ramon Riera/OneDrive/Escritorio/iconos/pelis/asalto_distrito_13.jpg"));
		}
		
		if(btn == btnBladeRunner) {
			lblImagen.setIcon(new ImageIcon("/Users/Ramon Riera/OneDrive/Escritorio/iconos/pelis/blade_runner.jpg"));
		}
		
		
		
		
		
		
		
	}
}
