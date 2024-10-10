package hoja02;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Actividad03 extends JFrame {

	public Actividad03() {

		super("Comentarios");

		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		JLabel lblComentario = new JLabel("Deja un comentario");
		JTextArea txtComentario = new JTextArea();
		JScrollPane scrComentario = new JScrollPane(txtComentario);
		scrComentario.setPreferredSize(new Dimension(450, 300));

		JButton btnEnviar = new JButton("Enviar");

		add(lblComentario);
		add(scrComentario);
		add(btnEnviar);

		setVisible(true);
	}

	public static void main(String[] args) {

		new Actividad03();

	}

}