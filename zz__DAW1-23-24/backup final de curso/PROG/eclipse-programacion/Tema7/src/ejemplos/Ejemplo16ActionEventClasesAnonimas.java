package ejemplos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo16ActionEventClasesAnonimas extends JFrame {

	private JLabel lblMensaje;

	public Ejemplo16ActionEventClasesAnonimas() {

		super("Eventos (Clase anónima)");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JButton btnPulsar = new JButton("Púlsame");
		// Clase interna anónima:
		// La ventaja es que esta clase está situada en el mismo nivel
		// que el ActionListener.
		btnPulsar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMensaje.setText("¡Bien pulsado!");
				
			}
		});

		lblMensaje = new JLabel("Aún no has pulsado el botón");

		add(btnPulsar);
		add(lblMensaje);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo16ActionEventClasesAnonimas();
	}
}