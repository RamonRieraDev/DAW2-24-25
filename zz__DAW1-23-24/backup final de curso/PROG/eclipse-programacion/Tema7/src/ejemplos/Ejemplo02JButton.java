package ejemplos;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo02JButton extends JFrame{

	public Ejemplo02JButton() {
		
		super("Concurso");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Esto sirve para que los componentes que se vayan añadiendo se van poniendo uno 
		// después del otro de izquierda a derecha.
		setLayout(new FlowLayout());
		
		// Vamos a probar otro Layout:
		// 25 es la separación entre botón y botón
		// 15 es la separación de arriba a abajo
		//setLayout(new FlowLayout(FlowLayout.CENTER, 25, 15));
		
		// Creamos una etiqueta (label) para la pregunta:
		JLabel lblPregunta = new JLabel("¿Cómo se escribe 11 en hexadecimal?");
		
		// Creamos un botón:
		JButton btnRespuestaA = new JButton("A");
		JButton btnRespuestaB = new JButton("B");
		JButton btnRespuestaC = new JButton("C");
		JButton btnRespuestaD = new JButton("D");
		JButton btnRespuestaE = new JButton("E");
		
		// Creamos una etiqueta (label) para las instrucciones:
		JLabel lblInstrucciones = new JLabel("Pulsa la tecla correcta.");
		
		// Añadimos la pregunta para que se vea en la ventana:
		add(lblPregunta);
		
		// Y lo añadimos para que se vea en la ventana:
		add(btnRespuestaA);
		add(btnRespuestaB);
		add(btnRespuestaC);
		add(btnRespuestaD);
		add(btnRespuestaE);
		
		// Añadimos las instrucciones para que se vea en la ventana:
		add(lblInstrucciones);
		
		// Hacemos visible la ventana:
		setVisible(true);
		
	}

	// Estamos obligados a crear un objeto de la clase Ejemplo02JButton en un main para
	// que se vea la ventana:
	public static void main(String[] args) {
		
		Ejemplo02JButton ventana = new Ejemplo02JButton();
		
	}
	
}

