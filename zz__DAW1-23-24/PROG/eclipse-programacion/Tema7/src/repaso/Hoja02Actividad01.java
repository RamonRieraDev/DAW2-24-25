package repaso;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Hoja02Actividad01 extends JFrame{

	public Hoja02Actividad01(){
		
		super("Velocidad de crucero");
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JSlider sldVelocidad = new JSlider(10, 120, 90);
		
		sldVelocidad.setPaintLabels(true);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setMinorTickSpacing(5);
		sldVelocidad.setMajorTickSpacing(20);
		
		add(sldVelocidad);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Hoja02Actividad01();
	}
}
