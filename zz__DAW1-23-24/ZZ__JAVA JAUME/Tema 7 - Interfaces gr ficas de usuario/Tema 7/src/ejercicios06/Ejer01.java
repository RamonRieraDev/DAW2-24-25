package ejercicios06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer01 extends JFrame{
	
	public static void main(String[] args) {
	
		new Ejer01();
	}

	public Ejer01() {
		
		super("LibreOffice");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		JMenuBar mnBarra = new JMenuBar();
		
		JMenu mnFormato = new JMenu("Formato");
		JMenu mnTabla = new JMenu("Tabla");
		JMenuItem itemLimpiar = new JMenuItem("Limpiar formato directo");
		JMenuItem itemCaracter = new JMenuItem("Carácter");
		JMenuItem itemParrafo = new JMenuItem("Párrafo");
		JMenuItem itemNumeracion = new JMenuItem("Numeración y viñetas");
		JMenuItem itemPagina = new JMenuItem("Página");
		
		JMenuItem itemInsertar = new JMenuItem("Insertar");
		JMenuItem itemEliminar = new JMenuItem("Eliminar");
		JMenuItem itemSeleccionar = new JMenuItem("Seleccionar");
		JMenuItem itemUnir = new JMenuItem("Unir celdas");
		
		add(mnBarra);
		
		mnBarra.add(mnFormato);
		mnFormato.add(itemLimpiar);
		itemLimpiar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Limpiando formato directo");
				
			}
		});
		mnFormato.addSeparator();
		mnFormato.add(itemCaracter);
		mnFormato.add(itemParrafo);
		mnFormato.add(itemNumeracion);
		mnFormato.addSeparator();
		mnFormato.add(itemPagina);
		
		mnBarra.add(mnTabla);
		mnTabla.add(itemInsertar);
		mnTabla.add(itemEliminar);
		mnTabla.add(itemSeleccionar);
		mnTabla.addSeparator();
		mnTabla.add(itemUnir);
		
		
		

		
		
		setVisible(true);
		
	}


	

	
}
