package ejemplos3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo21KeyEvent extends JFrame {

	private int x = 30, y = 30;

	public Ejemplo21KeyEvent() {

		super("Eventos de teclado");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(null);

		setLocationRelativeTo(null);

		JLabel lblCorazon = new JLabel(new ImageIcon("iconos/15.png"));
		lblCorazon.setBounds(x, y, 24, 24);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// No lo usamos
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// No lo usamos
			}

			@Override
			public void keyPressed(KeyEvent e) {

				int codigo = e.getKeyCode();
				int velocidad = 5;

				if (codigo == KeyEvent.VK_UP) {
					y = y - velocidad;
				} else if (codigo == KeyEvent.VK_DOWN) {
					y = y + velocidad;
				} else if (codigo == KeyEvent.VK_LEFT) {
					x = x - velocidad;
				} else if (codigo == KeyEvent.VK_RIGHT) {
					x = x + velocidad;
				}

				lblCorazon.setBounds(x, y, 24, 24);
			}
		});

		add(lblCorazon);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo21KeyEvent();
	}

}