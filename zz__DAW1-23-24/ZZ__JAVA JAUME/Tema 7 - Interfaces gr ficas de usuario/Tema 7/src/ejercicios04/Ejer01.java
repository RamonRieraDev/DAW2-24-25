package ejercicios04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer01 extends JFrame {

	private JButton btnBladeRunner;
	private JButton btnBlackRain;
	private JButton btnAsalto;
	private JButton btnCasoWinslow;

	private JLabel lblImagen;

	public Ejer01() {

		super("Fotogramas");
		setSize(850, 550);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		//Panel Superior
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout());

		btnBlackRain = new JButton("Black Rain");
		btnCasoWinslow = new JButton("El caso Winslow");
		btnAsalto = new JButton("Asalto al distrito 13");
		btnBladeRunner = new JButton("Blade Runner");

		btnBladeRunner.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblImagen.setIcon(new ImageIcon("iconos/bladerunner.jpg"));
			}
		});

		btnBlackRain.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblImagen.setIcon(new ImageIcon("iconos/blackrain.jpg"));
			}
		});

		btnAsalto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblImagen.setIcon(new ImageIcon("iconos/asalto.jpg"));
			}
		});

		btnCasoWinslow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblImagen.setIcon(new ImageIcon("iconos/casowinslow.jpg"));
			}
		});

		panelBotones.add(btnBlackRain);
		panelBotones.add(btnCasoWinslow);
		panelBotones.add(btnAsalto);
		panelBotones.add(btnBladeRunner);

		//Panel Inferior
		
		JPanel panelInferior = new JPanel();
		panelInferior.setLayout(new FlowLayout());
		
		lblImagen = new JLabel (new ImageIcon("iconos/bladerunner.jpg"));
		
		panelInferior.add(lblImagen);
		
		//Ventana
		add(panelBotones, BorderLayout.NORTH);
		add(panelInferior, BorderLayout.CENTER);

		
		setVisible(true);

		btnBladeRunner.requestFocus();

	}

	public static void main(String[] args) {

		new Ejer01();

	}

}