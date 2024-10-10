package hoja04;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Actividad02 extends JFrame implements ItemListener {

	private JComboBox<String> cmbCurso;
	private JLabel lblCursoElegido;

	public Actividad02() {
		super("Matrícula");
		setSize(270, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(23);
		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(23);

		JLabel lblCurso = new JLabel("Curso");
		cmbCurso = new JComboBox<>();

		cmbCurso.addItem("Selecciona un curso");
		cmbCurso.addItem("1º ESO");
		cmbCurso.addItem("2º ESO");
		cmbCurso.addItem("3º ESO");
		cmbCurso.addItem("4º ESO");

		cmbCurso.setPreferredSize(new Dimension(180, 30));

		cmbCurso.addItemListener(this);

		lblCursoElegido = new JLabel();

		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(lblCurso);
		add(cmbCurso);
		add(lblCursoElegido);

		setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {

		int seleccionado = cmbCurso.getSelectedIndex();

		if (seleccionado == 0) {
			lblCursoElegido.setText("");
		} else {
			lblCursoElegido.setText("Curso: " + cmbCurso.getItemAt(seleccionado));
		}

	}

	public static void main(String[] args) {
		new Actividad02();
	}

}