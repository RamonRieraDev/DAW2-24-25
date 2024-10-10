package ejemplos;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo20KeyEvent extends JFrame{

		public Ejemplo20KeyEvent() {
			
			super("Eventos de teclado");
			setSize(400, 300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setLayout(new FlowLayout());
			
			setLocationRelativeTo(null);
			
			JLabel lblTeclaPulsada = new JLabel("¡Pulsa una tecla!");
			
			
			
			addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					lblTeclaPulsada.setText("Has pulsado la tecla " + e.getKeyChar());	
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					//lblTeclaPulsada.setText("Has pulsado la tecla " + e.getKeyChar());
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					int codigo = e.getKeyCode();
					
					
					
					if(codigo == KeyEvent.VK_UP) {
						lblTeclaPulsada.setText("Has pulsado la tecla FLECHA ARRIBA");
					} else if(codigo == KeyEvent.VK_DOWN) {
						lblTeclaPulsada.setText("Has pulsado la tecla FLECHA ABAJO");
					} else if(codigo == KeyEvent.VK_LEFT) {
						lblTeclaPulsada.setText("Has pulsado la tecla FLECHA IZQUIERDA");
					}  else if(codigo == KeyEvent.VK_RIGHT) {
						lblTeclaPulsada.setText("Has pulsado la tecla FLECHA DERECHA");
					}
				}
			});
			
			
			add(lblTeclaPulsada);
			
			
			setVisible(true);
			
		}
		
		
		public static void main(String[] args) {

			new Ejemplo20KeyEvent();

		}

	}
