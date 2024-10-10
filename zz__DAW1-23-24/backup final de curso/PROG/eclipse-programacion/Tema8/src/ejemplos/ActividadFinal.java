package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ActividadFinal extends JFrame {

	JTextArea txtArchivo;

	public ActividadFinal() {

		super("Lector");
		setSize(700, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);

		JMenu menuArchivo = new JMenu("Archivo");
		JMenuItem itemAbrir = new JMenuItem("abrir");
		JMenuBar menuBar = new JMenuBar();
		
		menuArchivo.add(itemAbrir);
		menuBar.add(menuArchivo);

		setJMenuBar(menuBar);

		txtArchivo = new JTextArea();
		txtArchivo.setSize(new Dimension(600, 500));
		JScrollPane scrArchivo = new JScrollPane(txtArchivo);

		add(scrArchivo);

		itemAbrir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				elegirArchivo();
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {

		new ActividadFinal();

	}

	private void elegirArchivo() {

		JFileChooser eleccion = new JFileChooser();

		int resultado = eleccion.showOpenDialog(null);

		if (resultado == eleccion.CANCEL_OPTION) {
			return;
		}

		File nombreArchivo = eleccion.getSelectedFile();
		setTitle(nombreArchivo.getName());

		try {
			BufferedReader bufferLectura = new BufferedReader(new FileReader(nombreArchivo));

			String linea = bufferLectura.readLine();

			while (linea != null) {

				txtArchivo.append(linea + "\n");

				linea = bufferLectura.readLine();

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
