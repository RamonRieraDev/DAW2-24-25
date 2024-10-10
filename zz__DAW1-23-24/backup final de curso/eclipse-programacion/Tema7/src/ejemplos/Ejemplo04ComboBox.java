package ejemplos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo04ComboBox extends JFrame {

	public Ejemplo04ComboBox() {
		super("Provincias");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		try {
			// Aplicamos el tema (look and feel) de multiplataforma:
			//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			
			// Aplicamos el tema (look and feel) del sistema operativo:
			//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

			// Aplicamos el tema (look and feel) llamado Motif:
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

			// Aplicamos el tema (look and feel) llamado Nimbus:
			 UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

			// Esta instrucción asegura que el tema se aplique correctamente a toda la
			// interfaz de usuario.
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al cambiar el Look and Feel.");
		}

		JLabel lblProvincias = new JLabel("Selecciona tu provincia preferida:");
		JComboBox<String> cmbProvincias = new JComboBox<>();

		cmbProvincias.addItem("Islas Baleares");
		cmbProvincias.addItem("Alicante");
		cmbProvincias.addItem("Murcia");
		cmbProvincias.addItem("Valencia");
		cmbProvincias.addItem("Jaén");
		cmbProvincias.addItem("Albacete");

		cmbProvincias.setPreferredSize(new Dimension(300, 20));

		JLabel lblDescripcion = new JLabel("¿Por qué es tu provincia favorita?");

		// Hacemos que las líneas de texto no sobrepasen el ancho del TextArea.
		JTextArea txtDescripcion = new JTextArea();

		// Hacemos que al saltar de línea automáticamente no se corten las palabras.
		txtDescripcion.setLineWrap(true);
		txtDescripcion.setWrapStyleWord(true);
		JScrollPane srcPanel = new JScrollPane(txtDescripcion);
		srcPanel.setPreferredSize(new Dimension(350, 80));

		JButton btnGuardar = new JButton("Guardar");

		add(lblProvincias);
		add(cmbProvincias);
		add(lblDescripcion);
		add(srcPanel);
		setVisible(true);
		add(btnGuardar);
	}

	public static void main(String[] args) {

		Ejemplo04ComboBox ventana = new Ejemplo04ComboBox();

	}

}
