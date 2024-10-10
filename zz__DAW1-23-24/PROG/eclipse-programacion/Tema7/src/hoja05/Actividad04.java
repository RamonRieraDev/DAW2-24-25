package hoja05;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Actividad04 extends JFrame{

	public Actividad04() {
		
		super("Paleta");
		setSize(255, 255);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// No se usa.
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				int x = e.getX();
				int y = e.getY();
				getContentPane().setBackground(new Color(x, y, 0));
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				getContentPane().setBackground(Color.white);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				getContentPane().setBackground(Color.white);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// No se usa.
				
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Actividad04();
	}
}
