package ejemplos;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo17ActionEventClasesAnonimas extends JFrame {

	private JButton btnAzul;
	private JButton btnRojo;
	private JLabel lblMensaje;
	private JLabel lblPulsaciones;
	private int numPulsaciones = 0;

	public Ejemplo17ActionEventClasesAnonimas() {

		super("Elegir botón (Clases Anonimas)");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		btnAzul = new JButton("Azul");
		btnAzul.setBackground(new Color(150, 150, 255));
		btnAzul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JButton btnPulsado = (JButton) e.getSource();

				lblMensaje.setText("Has pulsado el botón azul.");

				actualizaPulsaciones();
			}
		});

		btnRojo = new JButton("Rojo");
		btnRojo.setBackground(Color.RED);
		btnRojo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JButton btnPulsado = (JButton) e.getSource();

				lblMensaje.setText("Has pulsado el botón rojo.");

				actualizaPulsaciones();
			}

		});

		lblMensaje = new JLabel("Pulsa alguno de los botones.");
		lblPulsaciones = new JLabel("");

		add(btnAzul);
		add(btnRojo);
		add(lblMensaje);
		add(lblPulsaciones);

		setVisible(true);

	}

	private void actualizaPulsaciones() {
		numPulsaciones++;
		lblPulsaciones.setText("Has pulsado " + numPulsaciones + " veces.");
	}

	public static void main(String[] args) {
		new Ejemplo17ActionEventClasesAnonimas();
	}

}