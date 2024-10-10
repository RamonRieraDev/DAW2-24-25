package hoja01;

import javax.swing.JOptionPane;

public class Actividad05 {

	public static void main(String[] args) {
		String [] servidores = {"Apache", "IIS", "Nginx", "Node.JS"};
		int respuesta = JOptionPane.showOptionDialog(null, "¿Qué servidor web desea para su hosting?", 
				"Elección de servidor web", 0, JOptionPane.INFORMATION_MESSAGE, null, servidores, servidores[1]);
	}
}
