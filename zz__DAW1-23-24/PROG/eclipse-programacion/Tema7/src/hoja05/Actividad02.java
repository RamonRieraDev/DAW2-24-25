package hoja05;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Actividad02 extends JFrame{

	public Actividad02() {
		
		super("Letras - Colores");
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		setLocationRelativeTo(null);
		
		JLabel lblColor = new JLabel("COLOR");
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				if (e.getKeyChar() == 'r') {
				lblColor.setText("ROJO");
				lblColor.setForeground(Color.RED);
				}
				
				if (e.getKeyChar() == 'a') {
					lblColor.setText("AZUL");
					lblColor.setForeground(Color.BLUE);
					}
				
				if (e.getKeyChar() == 'v') {
					lblColor.setText("VERDE");
					lblColor.setForeground(Color.GREEN);
					}
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		add(lblColor);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Actividad02();
	}
	
}
