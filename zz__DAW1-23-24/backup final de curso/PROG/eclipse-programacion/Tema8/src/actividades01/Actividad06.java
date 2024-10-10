package actividades01;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Actividad06 {

	private JFrame frame;
	private JMenuItem itemOpen;
	private JMenuItem itemSave;

	/**
	 * Launch the application.
	 */

	private JLabel lblMostrarRuta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad06 window = new Actividad06();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Actividad06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar barraMenu = new JMenuBar();
		frame.setJMenuBar(barraMenu);

		JMenu mnuFile = new JMenu("File");
		barraMenu.add(mnuFile);

		itemOpen = new JMenuItem("Open File");
		itemOpen.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				abrirArchivo(e);

			}
		});
		mnuFile.add(itemOpen);

		itemSave = new JMenuItem("Save");
		itemSave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				abrirArchivo(e);

			}
		});
		mnuFile.add(itemSave);

		lblMostrarRuta = new JLabel("Selecciona un archivo");
		frame.getContentPane().add(lblMostrarRuta, BorderLayout.NORTH);
	}

	private void abrirArchivo(ActionEvent e) {

		JFileChooser eleccion = new JFileChooser();

		int resultado;

		if (e.getSource() == itemOpen) {
			resultado = eleccion.showOpenDialog(null);
		} else {
			resultado = eleccion.showSaveDialog(null);
		}

		if (resultado == JFileChooser.CANCEL_OPTION) {
			return;
		}

		lblMostrarRuta.setText("Archivo: " + eleccion.getSelectedFile().toString());

	}

}
