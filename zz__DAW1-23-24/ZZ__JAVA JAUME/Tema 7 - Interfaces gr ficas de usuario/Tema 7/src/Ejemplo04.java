import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Ejemplo04 extends JFrame{
	
	public Ejemplo04() {
		
		super("Cuestionario");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JRadioButton rdb1 = new JRadioButton("Hombre", true);
		JRadioButton rdb2 = new JRadioButton("Mujer");

		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdb1);
		grupo.add(rdb2);

		add(rdb1);
		add(rdb2);


		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		Ejemplo04 ejemplo = new Ejemplo04();
	}
	

}
