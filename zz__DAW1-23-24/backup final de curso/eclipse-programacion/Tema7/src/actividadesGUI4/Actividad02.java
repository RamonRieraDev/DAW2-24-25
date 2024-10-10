package actividadesGUI4;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Actividad02 extends JFrame implements ItemListener{
	
	private JComboBox<String> cmbCurso;
	private JLabel lblCursoSeleccionado;
	
	public Actividad02() {
		
		super("Matrícula");
		setSize(250, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(20);
		
		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(20);
		
		JLabel lblCurso = new JLabel("Curso");

		cmbCurso = new JComboBox<>();
		cmbCurso.addItem("Selecciona un curso");
		cmbCurso.addItem("1º ESO");
		cmbCurso.addItem("2º ESO");
		cmbCurso.addItem("3º ESO");
		cmbCurso.addItem("4º ESO");
		
		cmbCurso.addItemListener(this);
		
		lblCursoSeleccionado = new JLabel();
		
		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(lblCurso);
		add(cmbCurso);
		add(lblCursoSeleccionado);
		
		
		setVisible(true);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		int seleccionado = cmbCurso.getSelectedIndex();
		
		if(seleccionado == 0) {
			lblCursoSeleccionado.setText("");
		}else {
			lblCursoSeleccionado.setText("Has seleccionado " + cmbCurso.getSelectedItem());
		}
		
	}
	
	public static void main(String[] args) {
		new Actividad02();
	}

}
