import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejemplo07 extends JFrame {

	public Ejemplo07() {

		super("Países");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

//		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			SwingUtilities.updateComponentTreeUI(this);
//		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
//				| UnsupportedLookAndFeelException e) {
//			System.out.println("Error al aplicar el look and feel del sistema.");
//		}
		
//		FlatDarculaLaf.setup();
		
		getContentPane().setBackground(new Color(60, 60, 60));

		JLabel lblPaises = new JLabel("Elige tu país para ganar:");
		// Creamos un array con los países

		String[] paises = { "España", "Rusia", "Italia", "Finlandia", "Alemania", "Portugal" };

		JComboBox<String> cmbPaises = new JComboBox<>(paises);

		// Creamos un objeto Dimension para dar tamaño al ComboBox.

		Dimension tamanyo = new Dimension(250, 30);

		cmbPaises.setPreferredSize(tamanyo);

		JLabel lblComentario = new JLabel("Escribe un comentario:");
		JTextArea txtComentario = new JTextArea();

		// Creamos un JScrollPane para que el textArea funcione bien.
		JScrollPane panelComentario = new JScrollPane(txtComentario);

		panelComentario.setPreferredSize(new Dimension(250, 100));

		JButton btnEnviar = new JButton("Enviar weon");

		add(lblPaises);
		add(cmbPaises);
		add(lblComentario);
		add(panelComentario);
		add(btnEnviar);

		setVisible(true);
	}

	public static void main(String[] args) {

		Ejemplo07 ejemplo = new Ejemplo07();
	}
}
