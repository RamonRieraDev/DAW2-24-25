package ejemplos;

import java.awt.FlowLayout;
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

		JLabel lblcorazon = new JLabel(new ImageIcon("iconos/15.png"));
		lblcorazon.setBounds(x, y, 30, 30);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// No lo usamos.
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// No lo usamos.
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int codigo = e.getKeyCode();
				int velocidad = 5;

				if (codigo == KeyEvent.VK_UP) {
					if (y == 0) {

					} else {
						y = y - velocidad;
					}
				} else if (codigo == KeyEvent.VK_DOWN) {
					if (y == 230) {

					} else {
						y = y + velocidad;
					}
				} else if (codigo == KeyEvent.VK_LEFT) {
					if (x > -23) {
						x = x - velocidad;
					} else {
						x = 400;
					}
				} else if (codigo == KeyEvent.VK_RIGHT) {
					if (x < 400) {
						x = x + velocidad;
					} else {
						x = -23;
					}
				}
				lblcorazon.setBounds(x, y, 30, 30);
			}
		});

		add(lblcorazon);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Ejemplo21KeyEvent();

	}

}
