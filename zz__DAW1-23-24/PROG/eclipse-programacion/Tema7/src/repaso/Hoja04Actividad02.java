package repaso;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class Hoja04Actividad02 extends JFrame {

	public Hoja04Actividad02() {

		super("Matrícula");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);

		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(27);

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(27);
		
		JLabel lblCursoSeleccionado = new JLabel("");
		
		JLabel lblCurso = new JLabel("Curso");
		String [] cursos = {"Selecciona un curso", "1º", "2º", "3º"};
		JComboBox<String> cmbCursos = new JComboBox<> (cursos);
		cmbCursos.setPreferredSize(new Dimension(250, 20));
		
		cmbCursos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(cmbCursos.getSelectedItem() == null || cmbCursos.getSelectedItem() == cursos[0]) {
					lblCursoSeleccionado.setText("");
				} else {
					lblCursoSeleccionado.setText("Curso: " + (String) cmbCursos.getSelectedItem());
				}
				
			}
		});

		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(lblCurso);
		add(cmbCursos);
		add(lblCursoSeleccionado);

		setVisible(true);

	}

	public static void main(String[] args) {

		new Hoja04Actividad02();
	}
}
