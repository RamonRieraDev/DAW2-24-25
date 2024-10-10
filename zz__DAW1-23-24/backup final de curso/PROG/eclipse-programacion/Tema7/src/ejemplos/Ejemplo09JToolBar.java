package ejemplos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Ejemplo09JToolBar extends JFrame{

	public Ejemplo09JToolBar() {
		
		super("Barra de herramientas");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Divide la ventana en 5 partes: norte, sur, este, oeste y centro.
		// Si no ponemos el setLayout estaría haciendo una división pero es 
		// mejor ponerlo:
		setLayout(new BorderLayout());
		
		JToolBar tlbHerramientas = new JToolBar();
		
		ImageIcon imgNuevo = new ImageIcon("iconos/1.png");
		JButton btnNuevo = new JButton(imgNuevo);
		// Para vincular el botón en la barra no se pone solo add, se pone
		// el tlb con .add:
		tlbHerramientas.add(btnNuevo);
		
		ImageIcon imgAbrir = new ImageIcon("iconos/52.png");
		JButton btnAbrir = new JButton(imgAbrir);
		tlbHerramientas.add(btnAbrir);
		
		// Para separar los botones con un espacio:
		tlbHerramientas.addSeparator();
		
		ImageIcon imgGuardar = new ImageIcon("iconos/22.png");
		JButton btnGuardar = new JButton(imgGuardar);
		tlbHerramientas.add(btnGuardar);
		
		// Lo que se añade es el tlb y no botón por botón:
		add(tlbHerramientas, BorderLayout.NORTH);
		// Otra manera:
		// add("North", tlbHerramientas);
		
		// Añadimos un panel a la parte central de la ventana, dentro del cual aparecerá
		// un JLabel y un JScrollPane:
		JPanel panelCentro = new JPanel();
		panelCentro.setLayout(new FlowLayout());
		// Para ver cuánto ocupa el panelCentro lo coloreamos:
		panelCentro.setBackground(Color.RED);
		
		JLabel lblComentarios = new JLabel("Comentarios:");
		JTextArea txtComentarios = new JTextArea();
		JScrollPane scrComentarios = new JScrollPane(txtComentarios);
		scrComentarios.setPreferredSize(new Dimension(400, 300));
		
		panelCentro.add(lblComentarios);
		panelCentro.add(scrComentarios);
		
		add(panelCentro, BorderLayout.CENTER);
		
//		add(lblComentarios, BorderLayout.CENTER);
//		add(scrComentarios, BorderLayout.CENTER);
		
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {

		new Ejemplo09JToolBar();

	}

}
