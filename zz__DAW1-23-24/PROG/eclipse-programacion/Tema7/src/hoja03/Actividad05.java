package hoja03;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Actividad05 extends JFrame{

	public Actividad05(){
		
		super("Opciones de la aplicación");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
		//JTabbedPane tbdEditor = new JTabbedPane();
		
		// Crear un JTabbedPane con título
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setPreferredSize(new Dimension(300, 200));

        ImageIcon imgEditor = new ImageIcon("iconos/73.png");
        ImageIcon imgVentanas = new ImageIcon("iconos/65.png");
        
        // Crear paneles para cada pestaña
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        JCheckBox chcResaltar = new JCheckBox("Resaltar palabras clave");
        JCheckBox chcGuardar = new JCheckBox("Guardar como xml");
        panel1.add(chcResaltar);
        panel1.add(chcGuardar);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        JCheckBox chcLateral = new JCheckBox("Mostrar barras laterales");
        JCheckBox chcMenus= new JCheckBox("Mostrar barras de menús");
        panel2.add(chcLateral);
        panel2.add(chcMenus);

        // Agregar los paneles a las pestañas
        tabbedPane.addTab("Editor", imgEditor, panel1);
        tabbedPane.addTab("Ventanas", imgVentanas, panel2);
        
        add(tabbedPane, BorderLayout.WEST);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Actividad05();
	}
}
