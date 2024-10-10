package ejemplos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Ejemplo22MouseListener extends JFrame{

	public Ejemplo22MouseListener() {
		
		super("Mouse Listener");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		setLocationRelativeTo(null);
		
		JLabel lblCoordenadas = new JLabel("Haz click en esta ventana");
		
		JLabel lblBoton = new JLabel("");
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseReleased()");
//				getContentPane().setBackground(Color.WHITE);
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("mousePressed()");
//				getContentPane().setBackground(Color.BLACK);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseExited()");
//				getContentPane().setBackground(Color.LIGHT_GRAY);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered()");
//				getContentPane().setBackground(Color.RED);
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseClicked()");
				int x = e.getX();
				int y = e.getY();
				lblCoordenadas.setText("Coordenadas: X=" + x + " " + "Y=" + y);
				
				int boton = e.getButton();
				if (boton == MouseEvent.BUTTON1) {
					lblBoton.setText("Has pulsado el botón izquierdo");
				} else if (boton == MouseEvent.BUTTON3) {
					lblBoton.setText("Has pulsado el botón derecho");
				} else if (boton == MouseEvent.BUTTON2) {
					lblBoton.setText("Has pulsado la rueda del ratón");
				}
//				getContentPane().setBackground(Color.GREEN);
				
			}
		});
		
		add(lblCoordenadas);
		add(lblBoton);
	
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		new Ejemplo22MouseListener();
	}

}
