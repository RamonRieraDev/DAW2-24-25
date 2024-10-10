package ejercicios06;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejer03 extends JFrame {

	private String ordenadores[] = { "Amstrad CPC 464", "Commodore 64", "Commodore Amiga", "Sinclair ZX Spectrum" };

	private ImageIcon imgOrdenador1;
	private ImageIcon imgOrdenador2;
	private ImageIcon imgOrdenador3;
	private ImageIcon imgOrdenador4;

	private JLabel lblImagen;

	private JComboBox cmbOrdenadores;

	public Ejer03() {
		super("Ordenadores de 8 bits");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// Panel superior
		JPanel panelSuperior = new JPanel();

		cmbOrdenadores = new JComboBox<>(ordenadores);
		cmbOrdenadores.setPreferredSize(new Dimension(250, 30));
		cmbOrdenadores.setSelectedItem(this);

		panelSuperior.add(cmbOrdenadores);

		// Panel inferior
		JPanel panelInferior = new JPanel();
		imgOrdenador1 = new ImageIcon("iconos/ordenador1.png");
		imgOrdenador2 = new ImageIcon("iconos/ordenador2.png");
		imgOrdenador3 = new ImageIcon("iconos/ordenador3.png");
		imgOrdenador4 = new ImageIcon("iconos/ordenador4.png");

		lblImagen = new JLabel(imgOrdenador1);

		panelInferior.add(lblImagen);

		// Ventana

		cmbOrdenadores.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				int seleccion = cmbOrdenadores.getSelectedIndex();

				if (seleccion == 0) {
					lblImagen.setIcon(imgOrdenador1);
				} else if (seleccion == 1) {
					lblImagen.setIcon(imgOrdenador2);
				} else if (seleccion == 2) {
					lblImagen.setIcon(imgOrdenador3);
				} else if (seleccion == 3) {
					lblImagen.setIcon(imgOrdenador4);
				}

			}

		});

		add(panelSuperior, BorderLayout.NORTH);
		add(panelInferior, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer03();
	}

}