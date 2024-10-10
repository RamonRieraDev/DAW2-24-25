package ejemplos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo08FileChooser extends JFrame {

	private JLabel lblArchivoElegido;
	
	public Ejemplo08FileChooser() {

		super("Lector de archivos");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);

		JButton btnElegirArchivo = new JButton("Elegir archivo");

		lblArchivoElegido = new JLabel();

		add(btnElegirArchivo);
		add(lblArchivoElegido);

		btnElegirArchivo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				elegirArchivo();
				
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {

		new Ejemplo08FileChooser();

	}
	
	private void elegirArchivo() {
		
		JFileChooser eleccion = new JFileChooser();
		
		int resultado = eleccion.showOpenDialog(null);
		
		if(resultado == eleccion.CANCEL_OPTION) {
			return;
		}
		
		File nombreArchivo = eleccion.getSelectedFile();
		// Alternativa:
		//String nombreArchivo = eleccion.getSelectedFile().toString();
		
		// Para ver el nombre del archivo y su ruta:
		//lblArchivoElegido.setText(nombreArchivo.toString());
		
		// Para ver el nombre del archivo sin su ruta:
		lblArchivoElegido.setText(nombreArchivo.getName());
		
		
	}

}
