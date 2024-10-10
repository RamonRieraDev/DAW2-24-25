package hoja01;

import javax.swing.JOptionPane;

public class Actividad04 {
	
	public static void main(String[] args) {
		String [] series = {"Futurama", "Los Simpson", "Héroes"};
		int respuesta = JOptionPane.showOptionDialog(null, "Haz clic en tu serie favorita", "Elección de serie",
				0, JOptionPane.INFORMATION_MESSAGE, null, series, series[1]);
	}
}
