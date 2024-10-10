package repaso;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Hoja02Actividad03 extends JFrame{

	public Hoja02Actividad03() {
		
		super("Comentarios");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		
		JLabel lblComentario = new JLabel("Deja un comentario");
		
		JTextArea txtComentario = new JTextArea("En un lugar de La Mancha, de cuyo nombre no quiero acordarme");
		
		JScrollPane scrComentario = new JScrollPane(txtComentario);
		scrComentario.setPreferredSize(new Dimension(350, 150));
		
		JButton btnEnviar = new JButton("Enviar");
		
		add(lblComentario);
		add(scrComentario);
		add(btnEnviar);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Hoja02Actividad03();
	}
}
