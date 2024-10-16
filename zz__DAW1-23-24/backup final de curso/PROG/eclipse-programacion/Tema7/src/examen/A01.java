package examen;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;

public class A01 extends JFrame{

	public A01() {
		
		super("Fotos aleatorias");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
//		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		
//		JPanel panelSuperior = new JPanel();
//		panelSuperior.setLayout(new BorderLayout().NORTH);
		
		
		
		ImageIcon img01 = new ImageIcon("imgs/arbol01.png");
		ImageIcon img02 = new ImageIcon("imgs/arbol02.png");
		ImageIcon img03 = new ImageIcon("imgs/arbol03.png");
		ImageIcon img04 = new ImageIcon("imgs/arbol04.png");
		ImageIcon img05 = new ImageIcon("imgs/arbol05.png");
		ImageIcon img06 = new ImageIcon("imgs/arbol06.png");
		
		String[] arboles = {"", "imgs/arbol01.png", "imgs/arbol02.png", "imgs/arbol03.png",
				"imgs/arbol04.png", "imgs/arbol05.png", "imgs/arbol06.png"};
		
		
		
		JLabel lblImg = new JLabel(img01);
		lblImg.setPreferredSize(new Dimension(500, 300));
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setPreferredSize(new Dimension(120, 30));
		
		btnSiguiente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				int rdm = (int)(Math.random() * 100) / 10;
				
				System.out.println("" + rdm);
				
					if(rdm <= 6 && rdm >= 1) {
					lblImg.setIcon(new ImageIcon(arboles[rdm]));
					
				}
				
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.setPreferredSize(new Dimension(120, 30));
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				lblImg.setIcon(img01);
				
			}
		});
		
		add(lblImg);
		
		add(btnSiguiente);
		add(btnReset);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new A01();
		
//		try {
//			UIManager(LookAndFeel)
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
	}
}
