package repaso;

import java.awt.FlowLayout;
import java.util.concurrent.Flow;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class Hoja03Actividad01 extends JFrame{

	public Hoja03Actividad01() {
		
		super("Planificador personal");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JToolBar tlbMenu = new JToolBar();
		
		ImageIcon imgNuevo = new ImageIcon("iconos/load.gif"); 
		JButton btnNuevo = new JButton(imgNuevo);
		tlbMenu.add(btnNuevo);
		
		ImageIcon imgSalvar = new ImageIcon("iconos/save.gif"); 
		JButton btnSalvar = new JButton(imgSalvar);
		tlbMenu.add(btnSalvar);
		
		tlbMenu.addSeparator();
		
		ImageIcon imgSus = new ImageIcon("iconos/subscribe.gif"); 
		JButton btnSus = new JButton(imgSus);
		tlbMenu.add(btnSus);
		
		add(tlbMenu);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Hoja03Actividad01();
	}
}
