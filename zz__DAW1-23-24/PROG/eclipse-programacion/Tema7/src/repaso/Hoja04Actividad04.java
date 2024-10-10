package repaso;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Hoja04Actividad04 extends JFrame{

	private JSlider sldRojo;
	private JSlider sldVerde;
	private JSlider sldAzul;
	private JButton btnColor;
	private JTextField txtColor;
	
		public Hoja04Actividad04() {
			
			super("Paleta");
			setSize(230, 400);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLayout(new FlowLayout());
			setLocationRelativeTo(null);

			JLabel lblRojo = new JLabel("Rojo");
			sldRojo = new JSlider(0, 255, 255);
			sldRojo.setPaintLabels(true);
			sldRojo.setPaintTicks(true);
			sldRojo.setMajorTickSpacing(50);
			sldRojo.setMinorTickSpacing(25);
			sldRojo.addChangeListener(new ChangeListener() {
				
				@Override
				public void stateChanged(ChangeEvent e) {

					if(sldRojo.getValueIsAdjusting()) {
						btnColor.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
						txtColor.setText(hexadecimal(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
					}
					
				}
			});
			
			JLabel lblVerde = new JLabel("Verde");
			sldVerde = new JSlider(0, 255, 200);
			sldVerde.setPaintLabels(true);
			sldVerde.setPaintTicks(true);
			sldVerde.setMajorTickSpacing(50);
			sldVerde.setMinorTickSpacing(25);
			sldVerde.addChangeListener(new ChangeListener() {
				
				@Override
				public void stateChanged(ChangeEvent e) {

					if(sldVerde.getValueIsAdjusting()) {
						btnColor.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
						txtColor.setText(hexadecimal(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
					}
					
				}
			});
			
			JLabel lblAzul = new JLabel("Azul");
			sldAzul = new JSlider(0, 255, 50);
			sldAzul.setPaintLabels(true);
			sldAzul.setPaintTicks(true);
			sldAzul.setMajorTickSpacing(50);
			sldAzul.setMinorTickSpacing(25);
			sldAzul.addChangeListener(new ChangeListener() {
				
				@Override
				public void stateChanged(ChangeEvent e) {

					if(sldAzul.getValueIsAdjusting()) {
						btnColor.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
						txtColor.setText(hexadecimal(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
					}
					
				}
			});
			
			btnColor = new JButton();
			btnColor.setPreferredSize(new Dimension(80, 40));
			btnColor.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
			
			txtColor = new JTextField(20);
			txtColor.setText(hexadecimal(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
			
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
		
		public static void main(String[] args) {
			
			new Hoja04Actividad04();
			
		}

		public String hexadecimal(int rojo, int verde, int azul) {
			
			return "#" + Integer.toHexString(rojo) +  Integer.toHexString(verde) +  Integer.toHexString(azul);
			//No hexadecimal:
//			return "Rojo:" + sldRojo.getValue() + "  Verde:" + sldVerde.getValue() + "  Azul:" + sldAzul.getValue();
		}
		
		
}
