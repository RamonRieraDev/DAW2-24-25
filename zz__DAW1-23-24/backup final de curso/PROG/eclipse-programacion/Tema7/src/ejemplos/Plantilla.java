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

public class Plantilla extends JFrame{

	public Plantilla() {
		
		super("");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		//setLocationRelativeTo(null);
		
		
		
		
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {

		new Plantilla();

	}

}
