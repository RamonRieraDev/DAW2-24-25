package actividades01;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class HallOfFame extends JFrame{

	private Jugador jugador;
	String[] jugadores = new String[10];
	JList lstJugadores;
	DefaultListModel model;
	final String NOMBRE_ARCHIVO = "ficheros/jugadores.txt";
	BufferedWriter bufferEscritura;
	BufferedReader bufferLectura;
	
	public HallOfFame() {

		super("Puntuaciones");
		setSize(300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setLocationRelativeTo(null);

		JLabel lblTitulo = new JLabel("*** Hall Of Fame ***");

		model = new DefaultListModel();
		lstJugadores = new JList<>(model);

		try {
			bufferLectura = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

			String linea = bufferLectura.readLine();
			
			if (linea == null) {
				JOptionPane.showMessageDialog(null, "No se han encontrado datos guardados de jugadores. Se creará "
						+ "un archivo nuevo", "Mensaje", 
						JOptionPane.INFORMATION_MESSAGE);
				}
			
			while (linea != null) {
				model.addElement(linea);
				linea = bufferLectura.readLine();
				
			}
			
			
			bufferLectura.close();
		} catch (IOException e) {
			System.out.println("Error de E/S: ");
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
		}
		
		JScrollPane scrJugadores = new JScrollPane(lstJugadores);
		scrJugadores.setPreferredSize(new Dimension(280, 300));

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				nuevoJugador();
			}
		});

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				borrarArchivo();
			}
		});

		add(lblTitulo);
		add(scrJugadores);
		add(btnNuevo);
		add(btnBorrar);
		
		setVisible(true);
	}

	/**
	 * Añade un jugador nuevo y su puntuación. Este método es llamado desde el
	 * listener del botón Nuevo.
	 */
	private void nuevoJugador() {
		
		String entrada = JOptionPane.showInputDialog(null, "¿Nombre del jugador?", "Nuevo", 
				JOptionPane.QUESTION_MESSAGE);
		
		try {
			bufferEscritura = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));
		
		
		if(entrada != null) {
			for (int i = 0; i < jugadores.length; i++) {
				if(jugadores[i] == null) {
					jugadores[i] = entrada;
					break;
				}
			}
		}
		
		String entrada2 = JOptionPane.showInputDialog(null, "¿Puntuación del jugador?", "Nuevo", 
				JOptionPane.QUESTION_MESSAGE);
		
		int i;
		if(entrada2 != null) {
			for (i = 0; i < jugadores.length; i++) {
				if(jugadores[i] != null && jugadores[i].equals(entrada)) {
					jugadores[i] = entrada + "..." + entrada2;
					bufferEscritura.write(entrada + "," + entrada2);
					break;
				}
			}
			model.addElement(jugadores[i]);
			bufferEscritura.close();
		}
		} catch (IOException e) {
			System.out.println("Error de E/S: ");
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
			;
		}
		
	}
	/**
	 * Pide al usuario los datos de un nuevo jugador y devuelve un objeto Jugador.
	 *
	 * @return Un objeto Jugador con los datos leídos, o null si los datos no son
	 * válidos.
	 */
	private Jugador leerDatosJugador() {
		Jugador jugador = new Jugador();
		return jugador;
	}
	/**
	 * Guarda la información de un jugador en el archivo de disco, en formato csv.
	 *
	 * @param jugador Objeto Jugador con el nombre y la puntuación a añadir.
	 */
	public void guardarJugador(Jugador jugador) {
		
		
		
	}
	/**
	 * Lee los datos sobre nombres y puntuaciones de jugadores. Los añade a la lista
	 * que se muestra en la ventana.
	 */
	public void cargarJugadores() {
		
		
		
	}
	/**
	 * Borra el contenido del archivo de jugadores, dejándolo en blanco. Y la lista
	 * de jugadores en la ventana. Este método es llamado desde el listener del botón
	 * Borrar.
	 */
	public void borrarArchivo() {
		
		int option = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres borrar todos los"
				+ "datos de jugadores?", "Advertencia", JOptionPane.OK_CANCEL_OPTION);
		
		if (option == JOptionPane.CANCEL_OPTION) {
		JOptionPane.showMessageDialog(null, "Operación cancelada. No se ha borrado ningún dato.",
				"Mensaje", JOptionPane.INFORMATION_MESSAGE);
		}else {
			model.clear();
			
			try {
				bufferEscritura.close();
                new FileWriter(NOMBRE_ARCHIVO);
	        } catch (IOException e) {
	            System.out.println("Error al borrar el contenido del archivo: " + e.getMessage());
	        }
		}
	}

	public static void main(String[] args) {

		new HallOfFame();
	}

}
