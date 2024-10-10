package ejemplos1;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ejemplo03JTextField extends JFrame{

	public Ejemplo03JTextField() {
	
		super("Datos personales");
		setSize(260, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Para que los componentenes se alinien a la izquierda: 
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// JTextField es para crear una línea donde poner un texto
		JLabel lblNombre =  new JLabel("Nombre:");
		JTextField txtNombre = new JTextField(20);
		
		JLabel lblEdad =  new JLabel("Edad:");
		JTextField txtEdad = new JTextField(20);
		
		JLabel lblSatisfaccion =  new JLabel("¿Estás satisfecho con el programa?");
		JRadioButton rdbSatisfecho = new JRadioButton("Satisfecho");
		JRadioButton rdbNoSatisfecho = new JRadioButton("No satisfecho", true);
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbNoSatisfecho);
		grupo.add(rdbSatisfecho);
		
		JCheckBox chkAceptacion = new JCheckBox("He leído y acepto los términos");
		JCheckBox chkAceptaPublicidad = new JCheckBox("Acepto recibir publicidad"); 
		
		add(lblNombre);
		add(txtNombre);
		
		add(lblEdad);
		add(txtEdad);
		
		add(lblSatisfaccion);
		add(rdbSatisfecho);
		add(rdbNoSatisfecho);
		
		add(chkAceptacion);
		add(chkAceptaPublicidad);
		
		JButton btnGuardar = new JButton("Guardar");
		
		add(btnGuardar);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Ejemplo03JTextField ventana = new Ejemplo03JTextField();
	}
	
}
