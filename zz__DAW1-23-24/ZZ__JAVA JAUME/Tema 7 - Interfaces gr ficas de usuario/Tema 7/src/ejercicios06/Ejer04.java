package ejercicios06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejer04 extends JFrame {

	public static void main(String[] args) {
		new Ejer04();
	}

	private int verde, azul = 0;

	public Ejer04() {

		super("Colores");
		setSize(250, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));

		JLabel lblColor = new JLabel("COLOR");

		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblColor.setForeground(Color.BLACK);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblColor.setForeground(Color.RED);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				verde = e.getX();
				azul = e.getY();
				lblColor.setForeground(new Color(0, verde, azul));
			}
		});

		add(lblColor);
		setVisible(true);
	}

}