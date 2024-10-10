package ejercicios01;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejer05 extends JFrame{
	
	public Ejer05() {
		
		String servidor[] = {"Apache", "II S", "Nginx", "Node.JS"};

		JOptionPane.showOptionDialog(null, "¿Qué servidor web desea para su hosting?", "Elección de servidor web",
				0, JOptionPane.INFORMATION_MESSAGE, null, servidor, servidor[0]);
		
	}
	
	public static void main(String[] args) {
		
		new Ejer05();
	}

}
