package ejemplos;

import javax.swing.JFrame;

public class Ejemplo01JFrame extends JFrame{

	// Constructor:
	public Ejemplo01JFrame() {
	
		// super se hereda de JFrame.
		super("Hola, Mundo!");
		// setsize se hereda de JFrame.
		setSize(400, 300);
		// setDefaultCloseOperation se hereda de JFrame.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// setLocationRelativeTo se hereda de JFrame.
		// Para que aparezca centrada en la pantalla se pone null:
		setLocationRelativeTo(null);
		
		// setVisible se hereda de JFrame. 
		// Por defecto la ventana es invisible por eso la hacemos visible:
		// Se pone siempre a lo último.
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {

		// Creamos un ejemplo para que se ejecute el constructor:
		Ejemplo01JFrame ejemplo = new Ejemplo01JFrame();
	}

	
}
