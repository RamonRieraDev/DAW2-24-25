package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo16ActionEvent extends JFrame implements ActionListener{

	private JLabel lblMensaje;
	
	public Ejemplo16ActionEvent() {
			super("Eventos");
			setSize(275, 100);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setLayout(new FlowLayout());
			
			setLocationRelativeTo(null);
			
			JButton btnPulsar = new JButton("Púlsame");
			btnPulsar.addActionListener(this);
			
			lblMensaje = new JLabel("Aún no has pulsado el botón");
			
			add(btnPulsar);
			add(lblMensaje);
			
			setVisible(true);
		}

	public static void main(String[] args) {
		new Ejemplo16ActionEvent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("¡¡Has pulsado el botón!!");
		lblMensaje.setText("¡Bien pulsado!");
		
	}
	
	
}
