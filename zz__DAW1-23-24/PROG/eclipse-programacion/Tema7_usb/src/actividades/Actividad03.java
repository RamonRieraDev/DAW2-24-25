package actividades;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Actividad03 extends JFrame{

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Se ha detectado un escaneo de red desde la IP 192.168.0.1", "Alerta de seguridad", JOptionPane.WARNING_MESSAGE);
	}
	
}
