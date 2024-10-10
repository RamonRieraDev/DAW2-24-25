package ejercicios05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejer01 extends JFrame {

	public Ejer01() {
		super("Texto decorado");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JTextField txtCuadrado1 = new JTextField();
		JTextField txtCuadrado2 = new JTextField();
		JTextField txtCuadrado3 = new JTextField();

		txtCuadrado1.setPreferredSize(new Dimension(100, 20));
		txtCuadrado1.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txtCuadrado1.setBackground(Color.WHITE);
			}

			@Override
			public void focusGained(FocusEvent e) {
				txtCuadrado1.setBackground(Color.YELLOW);
			}
		});

		txtCuadrado2.setPreferredSize(new Dimension(100, 20));
		txtCuadrado2.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txtCuadrado2.setBackground(Color.WHITE);
			}

			@Override
			public void focusGained(FocusEvent e) {
				txtCuadrado2.setBackground(Color.YELLOW);
			}
		});

		txtCuadrado3.setPreferredSize(new Dimension(100, 20));
		txtCuadrado3.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txtCuadrado3.setBackground(Color.WHITE);
			}

			@Override
			public void focusGained(FocusEvent e) {
				txtCuadrado3.setBackground(Color.YELLOW);
			}
		});

		add(txtCuadrado1);
		add(txtCuadrado2);
		add(txtCuadrado3);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer01();
	}

}