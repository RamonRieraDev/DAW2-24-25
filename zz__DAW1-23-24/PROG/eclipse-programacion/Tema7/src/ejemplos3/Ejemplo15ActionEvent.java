package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo15ActionEvent extends JFrame implements ActionListener{

	public Ejemplo15ActionEvent() {
			super("Eventos");
			setSize(275, 100);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			setLayout(new FlowLayout());
			
			JButton btnPulsar = new JButton("Púlsame");
			btnPulsar.addActionListener(this);
			JLabel lblMensaje = new JLabel("Aún no has pulsado el botón");
			
			add(btnPulsar);
			add(lblMensaje);
			
			setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Has pulsado el botón!!");
		
	}
	
	public static void main(String[] args) {
		new Ejemplo15ActionEvent();
	}


}
