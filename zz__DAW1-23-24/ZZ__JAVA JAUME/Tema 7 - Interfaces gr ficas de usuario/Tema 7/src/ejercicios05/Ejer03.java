package ejercicios05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejer03 extends JFrame {

	public static void main(String[] args) {
		new Ejer03();
	}

	public Ejer03() {
		super("Título");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		String[] operacion = { "Suma", "Resta", "Multiplicación", "División" };

		JLabel lblA = new JLabel("Operando A");
		JTextField txtA = new JTextField();
		txtA.setPreferredSize(new Dimension(150, 20));

		JLabel lblB = new JLabel("Operando B");
		JTextField txtB = new JTextField();
		txtB.setPreferredSize(new Dimension(150, 20));

		JLabel lblOperacion = new JLabel("Operación");
		JComboBox cmbOperacion = new JComboBox<>(operacion);

		JLabel lblResultado = new JLabel("Resultado");
		JTextField txtResultado = new JTextField();
		txtResultado.setPreferredSize(new Dimension(150, 20));
		txtResultado.setEditable(false);

		cmbOperacion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					float operandoA = Float.parseFloat(txtA.getText());
					float operandoB = Float.parseFloat(txtB.getText());
					float resultado = 0;
					String seleccion = (String) cmbOperacion.getSelectedItem();

					if (seleccion.equals("Suma")) {
						resultado = operandoA + operandoB;
					} else if (seleccion.equals("Resta")) {
						resultado = operandoA - operandoB;
					} else if (seleccion.equals("Multiplicación")) {
						resultado = operandoA * operandoB;
					} else if (seleccion.equals("División")) {
						resultado = operandoA / operandoB;
					}
					
					txtResultado.setText("" + resultado);
				} catch (NumberFormatException ex) {
					
					txtResultado.setText("ERROR");
				}
			}
		});

		add(lblA);
		add(txtA);
		add(lblB);
		add(txtB);
		add(lblOperacion);
		add(cmbOperacion);
		add(lblResultado);
		add(txtResultado);

		setVisible(true);
	}

}