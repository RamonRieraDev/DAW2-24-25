package actividadesGUI5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Actividad01 extends JFrame {

	public Actividad01() {

		super("Texto decorado");
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		setLocationRelativeTo(null);

		JTextField txt1 = new JTextField(10);
		// JTextField.setPreferredSize(new Dimension(100, 20));
		txt1.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txt1.setBackground(Color.WHITE);

			}

			@Override
			public void focusGained(FocusEvent e) {
				txt1.setBackground(Color.YELLOW);

			}
		});

		JTextField txt2 = new JTextField(10);
		// JTextField.setPreferredSize(new Dimension(100, 20));
		txt2.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txt2.setBackground(Color.WHITE);

			}

			@Override
			public void focusGained(FocusEvent e) {
				txt2.setBackground(Color.YELLOW);

			}
		});

		JTextField txt3 = new JTextField(10);
		// JTextField.setPreferredSize(new Dimension(100, 20));
		txt3.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txt3.setBackground(Color.WHITE);

			}

			@Override
			public void focusGained(FocusEvent e) {
				txt3.setBackground(Color.YELLOW);

			}
		});

		add(txt1);
		add(txt2);
		add(txt3);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Actividad01();
	}
}
