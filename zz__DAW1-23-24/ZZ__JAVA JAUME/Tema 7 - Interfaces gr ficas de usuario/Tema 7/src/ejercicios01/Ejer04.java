package ejercicios01;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejer04 extends JFrame{
	
	public Ejer04() {
		
		String serie[] = {"Futurama", "Simpsons", "Héroes"};

		JOptionPane.showOptionDialog(null, "Haz clic en tu serie favorita", "Elección de serie",
				0, JOptionPane.INFORMATION_MESSAGE, null, serie, serie[1]);
		
	}
	
	public static void main(String[] args) {
		
		new Ejer04();
	}

}
