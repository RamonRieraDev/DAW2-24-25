package hoja02;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Actividad04 extends JFrame {

	public Actividad04() {

		super("Suscripción");
		setSize(300, 330);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(20);
		JLabel lblEmail = new JLabel("Email");
		JTextField txtEmail = new JTextField(20);

		JLabel lblMotivo = new JLabel("Motivo por el que te suscribes");
		JTextArea txtMotivo = new JTextArea();
		txtMotivo.setLineWrap(true);
		txtMotivo.setWrapStyleWord(true);

		JScrollPane scrMotivo = new JScrollPane(txtMotivo);

		scrMotivo.setPreferredSize(new Dimension(235, 100));

		JCheckBox chkInfo = new JCheckBox("Recibir información por correo", true);

		JButton btnEnviar = new JButton("Enviar");

		add(lblNombre);
		add(txtNombre);
		add(lblEmail);
		add(txtEmail);

		add(lblMotivo);
		add(scrMotivo);

		add(chkInfo);

		add(btnEnviar);

		setVisible(true);
	}

	public static void main(String[] args) {

		new Actividad04();

	}

}