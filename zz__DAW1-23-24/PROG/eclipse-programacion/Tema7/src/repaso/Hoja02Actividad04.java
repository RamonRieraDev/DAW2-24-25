package repaso;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Hoja02Actividad04 extends JFrame
{

	public Hoja02Actividad04() {
		
		super("Suscripción");
		setSize(280, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(25);
		
		JLabel lblEmail =  new JLabel("Email");
		JTextField txtEmail = new JTextField(25);		
		
		JLabel lblMotivo =  new JLabel("Motivo por el que te suscribes");
		JTextArea txtMotivo = new JTextArea();
		JScrollPane scrMotivo = new JScrollPane(txtMotivo);
		scrMotivo.setPreferredSize(new Dimension(260, 150));
		
		JCheckBox chcRecibir = new JCheckBox("Recibir información por correo", true);
		
		JButton btnEnviar = new JButton("Enviar");
		
		add(lblNombre);
		add(txtNombre);
		add(lblEmail);
		add(txtEmail);
		add(lblMotivo);
		add(scrMotivo);
		add(chcRecibir);
		add(btnEnviar);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Hoja02Actividad04();
	}
}
