package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Ejemplo07JSliders extends JFrame{

	public Ejemplo07JSliders() {
		super("Volumen");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		setLocationRelativeTo(null);;
		
		JLabel lblVolumen = new JLabel("Volumen");
		JSlider sldVolumen = new JSlider(JSlider.VERTICAL, 0, 100, 20);	
		sldVolumen.setMajorTickSpacing(10);
		sldVolumen.setMinorTickSpacing(5);
		sldVolumen.setPaintLabels(true);
		sldVolumen.setPaintTicks(true);
		sldVolumen.setPreferredSize(new Dimension(100, 300));
		
		add(lblVolumen);
		add(sldVolumen);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		Ejemplo07JSliders ventana = new Ejemplo07JSliders();
		
	}

}
