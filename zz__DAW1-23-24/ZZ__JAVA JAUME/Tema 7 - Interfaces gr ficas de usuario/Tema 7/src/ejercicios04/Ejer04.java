package ejercicios04;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class Ejer04 extends JFrame{

	private JLabel lblRojo, lblVerde, lblAzul;
	private JSlider sldRojo, sldVerde, sldAzul;
	private JButton btnColor;
	private JTextField txtColor;
	private int rojo, verde, azul;
	
	public static void main(String[] args) {
		 
		new Ejer04();
	}
	
	public Ejer04() {
		
		super("Paleta");
		setSize(225, 330);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		rojo = 255;
		verde = 200;
		azul = 51;
		
		
		lblRojo = new JLabel("Rojo");
		sldRojo = new JSlider(JSlider.HORIZONTAL, 0, 255, rojo);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintTicks(true);
		sldRojo.setPaintLabels(true);
		sldRojo.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				rojo = sldRojo.getValue();
				btnColor.setBackground(new Color(rojo, verde, azul));				
				txtColor.setText(colorHexadecimal(rojo, verde, azul));
			}
		});

		
		lblVerde = new JLabel("Verde");
		sldVerde = new JSlider(JSlider.HORIZONTAL, 0, 250, verde);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintTicks(true);
		sldVerde.setPaintLabels(true);
		sldVerde.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				verde = sldVerde.getValue();
				btnColor.setBackground(new Color(rojo, verde, azul));
				txtColor.setText(colorHexadecimal(rojo, verde, azul));

			}
		});
		
		lblAzul = new JLabel("Azul");
		sldAzul = new JSlider(JSlider.HORIZONTAL, 0, 255, azul);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintTicks(true);
		sldAzul.setPaintLabels(true);
		sldAzul.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				azul = sldAzul.getValue();
				btnColor.setBackground(new Color(rojo, verde, azul));
				txtColor.setText(colorHexadecimal(rojo, verde, azul));

			}
		});
		
		btnColor = new JButton();
		btnColor.setBackground(null);
		btnColor.setPreferredSize(new Dimension(100, 27));
		btnColor.setBackground(new Color(rojo, verde, azul));
		
		
		txtColor = new JTextField();
		txtColor.setPreferredSize(new Dimension(70,20));
				
		add(lblRojo);
		add(sldRojo);
		
		add(lblVerde);
		add(sldVerde);
		
		add(lblAzul);
		add(sldAzul);
		
		add(btnColor);
		add(txtColor);
		
		setVisible(true);
	}
	
	private String colorHexadecimal(int rojo, int verde, int azul) {
		
		String rojoHex = Integer.toHexString(rojo).toUpperCase();
		String verdeHex = Integer.toHexString(verde).toUpperCase();
		String azulHex = Integer.toHexString(azul).toUpperCase();
		
		
		return "#" + rojoHex + verdeHex + azulHex;
		
	}
}
