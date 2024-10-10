package actividadesGUI3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Actividad01 extends JFrame {

	public Actividad01() {

		super("Planificador Personal");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		JToolBar tlbHerramientas = new JToolBar();

		ImageIcon imgNuevo = new ImageIcon("iconos/1.png");
		JButton btnNuevo = new JButton(imgNuevo);
		tlbHerramientas.add(btnNuevo);
		
		ImageIcon imgEstadistica = new ImageIcon("iconos/11.png");
		JButton btnEstadistica = new JButton(imgEstadistica);
		tlbHerramientas.add(btnEstadistica);

		ImageIcon imgSave = new ImageIcon("iconos/22.png");
		JButton btnSave = new JButton(imgSave);
		tlbHerramientas.add(btnSave);
		
		ImageIcon imgBombilla = new ImageIcon("iconos/3.png");
		JButton btnBombilla = new JButton(imgBombilla);
		tlbHerramientas.add(btnBombilla);
		
		tlbHerramientas.addSeparator();
		
		ImageIcon imgCal = new ImageIcon("iconos/44.png");
		JButton btnCal = new JButton(imgCal);
		tlbHerramientas.add(btnCal);
		
		ImageIcon imgFoto = new ImageIcon("iconos/66.png");
		JButton btonFoto = new JButton(imgFoto);
		tlbHerramientas.add(btonFoto);
		
		ImageIcon imgTele = new ImageIcon("iconos/67.png");
		JButton btnTele = new JButton(imgTele);
		tlbHerramientas.add(btnTele);
		
		tlbHerramientas.addSeparator();
		
		ImageIcon imgTool = new ImageIcon("iconos/73.png");
		JButton btnTool = new JButton(imgTool);
		tlbHerramientas.add(btnTool);

		add(tlbHerramientas, BorderLayout.NORTH);

		JTextArea txtEscribiendo = new JTextArea();
		txtEscribiendo.setPreferredSize(new Dimension(235, 100));
		
		JPanel panelCentro = new JPanel();
		panelCentro.setLayout(new FlowLayout());

		add(panelCentro, BorderLayout.CENTER);
		add(txtEscribiendo);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Actividad01();
	}

}