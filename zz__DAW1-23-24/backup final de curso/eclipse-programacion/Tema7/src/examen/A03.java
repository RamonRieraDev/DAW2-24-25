package examen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class A03 extends JFrame {

	private double cargaTotal = 0;
	private JTextArea txtCarga;
	private JLabel lblResultado;

	public A03() {

		super("Playload");
		setSize(500, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);

		JLabel lblCargas = new JLabel("Elija las cargas (carga máxima, 150.0 kg):");

		String[][] cargas = { { "Detector de partículas de alta energía", "19.2" },
				{ "Subsistema espectrómetro de plasma", "12.5" }, { "Analizador de polvo cósmico", "40" },
				{ "Magnetómetro", "4.5" }, { "Detector de ondas de plasma", "51" }, { "Espectrómetro de masas", "43" },
				{ "Instrumento para radioastronomía planetaria", "80" } };

		String[] carga = new String[cargas.length];

		for (int i = 0; i < carga.length; i++) {
			carga[i] = cargas[i][0] + " (" + cargas[i][1] + ") kg";
		}

		JComboBox<String> cmbDetector = new JComboBox<>(carga);
		cmbDetector.setPreferredSize(new Dimension(450, 40));

		JButton btnAnyadir = new JButton("Añadir carga");
		btnAnyadir.setPreferredSize(new Dimension(200, 40));
		btnAnyadir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String aux = "";

				if (Double.parseDouble(cargas[cmbDetector.getSelectedIndex()][1]) <= 150) {

					txtCarga.setText(aux = aux + "" + cargas[cmbDetector.getSelectedIndex()][0] + " ... "
							+ cargas[cmbDetector.getSelectedIndex()][1]);

					lblResultado.setText("" + cargas[cmbDetector.getSelectedIndex()][1] + " kg");

					cargaTotal = cargaTotal + Double.parseDouble(cargas[cmbDetector.getSelectedIndex()][1]);

				} else if (Double.parseDouble(cargas[cmbDetector.getSelectedIndex()][1]) > 150) {
					JOptionPane.showMessageDialog(null, "El peso de la carga ha superado el máximo permitido",
							"Payload", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		txtCarga = new JTextArea();
		txtCarga.setPreferredSize(new Dimension(480, 200));

		JLabel lblTotal = new JLabel("Carga total:");

		lblResultado = new JLabel();
		lblResultado.setFont(new Font("Arial", Font.PLAIN, 80));

		add(lblCargas);
		add(cmbDetector);
		add(btnAnyadir);
		add(txtCarga);
		add(lblTotal);
		add(lblResultado);

		setVisible(true);

	}

	public static void main(String[] args) {

		new A03();

	}
}
