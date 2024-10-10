package actividadesGUI5;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Actividad03 extends JFrame{

	public Actividad03() {
		
		super("Operaciones");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		setLocationRelativeTo(null);
		
		// OJO!! PONER EL ACTIONLISTENER AL FINAL DEL TODO""
		
		JLabel lblOperandoA = new JLabel("Operando A");
		
		
		JLabel lblOperandoB = new JLabel("Operando B");
		
		
		JLabel lblOperandoC = new JLabel("Operando C");
		
		
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Actividad03();
	}
	
}
