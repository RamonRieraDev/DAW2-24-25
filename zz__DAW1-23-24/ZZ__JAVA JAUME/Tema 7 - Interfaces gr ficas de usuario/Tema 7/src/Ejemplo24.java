import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Ejemplo24 extends JFrame implements ItemListener {
	
	private JComboBox<String> cmbCanciones;
	private JLabel lblAutor;
	
	
	public Ejemplo24() {
		super("Título");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		String[] canciones = {"Mujeriego", "Dakiti", "Princesas", 
				"Propuesta indecente", "Antes de morirme"};
		
		cmbCanciones = new JComboBox<>(canciones);
		cmbCanciones.setPreferredSize(new Dimension(200, 30));
		cmbCanciones.addItemListener(this);
		cmbCanciones.getSelectedIndex();
		
		lblAutor = new JLabel("Ryan Castro");
		
		add(cmbCanciones);
		add(lblAutor);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ejemplo24();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		int indice = cmbCanciones.getSelectedIndex();
		
		String autores[] = {"Ryan Castro", "Bad Bunny", "Leiva", "Romeo Santos", "C Tangana"};
		
		lblAutor.setText(autores[indice]);
	}

}