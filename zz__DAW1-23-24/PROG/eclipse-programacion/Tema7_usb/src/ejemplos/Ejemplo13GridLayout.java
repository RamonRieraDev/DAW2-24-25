package ejemplos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Ejemplo13GridLayout extends JFrame{

	public Ejemplo13GridLayout() {
		
		super("Stream Deck");
		setSize(600, 310);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(2, 4, 10, 10));

		JButton btnStream = new JButton("Stream");
		JButton btnCamara = new JButton("Camara");
		JButton btnSubirVolumen = new JButton("SubirVolumen");
		JButton btnBajarVolumen = new JButton("BajarVolumen");
		JButton btnPublicidad = new JButton("Publicidad");
		JButton btnSilenciarMicro = new JButton("SilenciarMicro");
		JButton btnEscena1 = new JButton("Escena1");
		JButton btnEscena2 = new JButton("Escena2");
		
		add(btnStream);
		add(btnCamara);
		add(btnSubirVolumen);
		add(btnBajarVolumen);
		add(btnPublicidad);
		add(btnSilenciarMicro);
		add(btnEscena1);
		add(btnEscena2);
		
		//setLocationRelativeTo(null);
		

		
		
		
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {

		new Ejemplo13GridLayout();

	}

}
