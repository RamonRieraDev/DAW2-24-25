package actividadesGUI4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Actividad04 extends JFrame{

	public Actividad04() {
		
		super("Paleta");
		setSize(220, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		setLocationRelativeTo(null);
		
		JLabel lblRojo = new JLabel("Rojo");
		
		JSlider sldRojo = new JSlider(0, 255, 255);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintLabels(true);
		sldRojo.setPaintTicks(true);
		
		sldRojo.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// No se usa.
				
			}
		});
		
		JLabel lblVerde = new JLabel("Verde");
		
		JSlider sldVerde = new JSlider(0, 255, 200);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintLabels(true);
		sldVerde.setPaintTicks(true);
		
		sldVerde.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// No se usa.
				
			}
		});
		
		JLabel lblAzul = new JLabel("Azul");
		
		JSlider sldAzul = new JSlider(0, 255, 50);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintLabels(true);
		sldAzul.setPaintTicks(true);
		
		sldAzul.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// No se usa.
				
			}
		});
		
		JButton btnColor = new JButton();
		btnColor.setBackground(Color.ORANGE);
		//btnColor.setBackground(new Color(rojo, verde, azul)));
		btnColor.setPreferredSize(new Dimension(110, 30));
		
		JTextField txtHexa = new JTextField(hexadecimal(/*250, 200, 50*/));
		
		add(lblRojo);
		add(sldRojo);
		
		add(lblVerde);
		add(sldVerde);
		
		add(lblAzul);
		add(sldAzul);
		
		add(btnColor);
		
		add(txtHexa);
		
		
		setVisible(true);
		
	}
	
	private String hexadecimal(/*int rojo, int verde, int azul*/) {
		
		return "#FFC833"/* + rojo + verde + azul */;
	}
	
	public static void main(String[] args) {
		new Actividad04();
	}
	
}
