package ejemplos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Ejemplo14GridLayout extends JFrame{

	public Ejemplo14GridLayout() {
		
		super("Biblioteca");
		setSize(600, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1, 2, 10, 10));
		
		JLabel lblTitulo = new JLabel("Título");
		JTextField txtTitulo = new JTextField(30); 
		
		JLabel lblAutor = new JLabel("Autor");
		JTextField txtAutor = new JTextField(30);
		
		
		
		JPanel scrPanel = new JPanel();
		scrPanel.add(lblTitulo);
		scrPanel.add(txtTitulo);
		scrPanel.add(lblAutor);
		scrPanel.add(txtAutor);
		
		
		JButton btnAlta = new JButton("Alta");
		
		add(scrPanel);
		add(btnAlta);
		
		//setLocationRelativeTo(null);
		
		
		
		
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {

		new Ejemplo14GridLayout();

	}

}
