
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;

public class EjerJFileChooser extends JFrame {

	public static void main(String[] args) {

		new EjerJFileChooser();
	}

	public EjerJFileChooser() {

		super("Lector");
		setSize(800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		Scanner entrada = new Scanner(System.in);

		JMenuBar barraMenu = new JMenuBar();
		JMenu menuArchivo = new JMenu("Archivo");
		JMenuItem itemAbrir = new JMenuItem("Abrir");

		JTextArea txtArea = new JTextArea();
		txtArea.setPreferredSize(new Dimension(600, 200));
		
		JScrollPane scrTexto = new JScrollPane(txtArea);
		
		JLabel lblTexto = new JLabel();

		itemAbrir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JFileChooser fileChooser = new JFileChooser();

				int resultado = fileChooser.showOpenDialog(null);

				if (resultado == JFileChooser.APPROVE_OPTION) {

					File archivoElegido = fileChooser.getSelectedFile();

					try {

						FileReader archivo = new FileReader(archivoElegido);
						BufferedReader buffer = new BufferedReader(archivo);

						String linea = buffer.readLine();
						
						String archivoCopiado = "";

						while (linea != null) {

							archivoCopiado = archivoCopiado + linea + "\n";
							txtArea.setText(archivoCopiado);
							linea = buffer.readLine();

						}

						buffer.close();

					} catch (FileNotFoundException ex) {
						ex.printStackTrace();
					} catch (IOException ex) {
						ex.printStackTrace();
					}

				}
			}
		});

		add(barraMenu);
		barraMenu.add(menuArchivo);
		menuArchivo.add(itemAbrir);
		add(scrTexto);

		setVisible(true);
	}

}
