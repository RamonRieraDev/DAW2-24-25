package actividadesGUI2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Actividad03 extends JFrame{

	public Actividad03() {
		super("Comentarios");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lblComentario = new JLabel("Deja un comentario");
		JTextArea txtComentario = new JTextArea();
		JScrollPane scrComentario = new JScrollPane(txtComentario);
		scrComentario.setPreferredSize(new Dimension(250, 100));
		txtComentario.setText("En un lugar de la Mancha de cuyo nombre no quiero acordarme\n\n\n\n\n\n\n");
		
		JButton btnEnviar = new JButton("Enviar");
		
		
		add(lblComentario);
		add(scrComentario);
		add(btnEnviar);
		
		setVisible(true);
		
		
		
		// txtCOmentario.setText("Cadena a poner")
	}
	
	
	public static void main(String[] args) {

		Actividad03 ventana = new Actividad03();

	}

}
