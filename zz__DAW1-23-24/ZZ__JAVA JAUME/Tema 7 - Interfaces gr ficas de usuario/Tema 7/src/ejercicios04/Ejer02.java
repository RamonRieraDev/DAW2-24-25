package ejercicios04;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejer02 extends JFrame{

	private JComboBox<String> cmbCursos;
	private JLabel lblCursoElegido;

	public static void main(String[] args) {
		new Ejer02();
	}

	public Ejer02() {

		super("Matrícula");
		setSize(250, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JTextField txtApellidos = new JTextField(20);

		JTextField txtNombre = new JTextField(20);

		JLabel lblCurso = new JLabel("Curso");

		cmbCursos = new JComboBox<String>();
		cmbCursos.addItem("Selecciona un curso");
		cmbCursos.addItem("1º ESO");
		cmbCursos.addItem("2º ESO");
		cmbCursos.addItem("3º ESO");
		cmbCursos.addItem("4º ESO");

		cmbCursos.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				muestraCurso(e);
			}
		});

		lblCursoElegido = new JLabel();

		add(new JLabel("Apellidos"));
		add(txtApellidos);
		add(new JLabel("Nombre"));
		add(txtNombre);
		add(lblCurso);
		add(cmbCursos);
		add(lblCursoElegido);

		setVisible(true);

	}

	private void muestraCurso(ItemEvent e) {

		if (cmbCursos.getSelectedIndex() == 0) {

			lblCursoElegido.setText("");
		} else {
			String curso = (String) e.getItem();
			lblCursoElegido.setText("Curso: " + curso);
		}
	}

}