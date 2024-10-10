package hoja03;

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

		super("Barra de herramientas");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JToolBar tlbHerramientas = new JToolBar();

		ImageIcon imgNuevo = new ImageIcon("iconos/load.gif");
		JButton btnNuevo = new JButton(imgNuevo);
		tlbHerramientas.add(btnNuevo);

		ImageIcon imgAbrir = new ImageIcon("iconos/save.gif");
		JButton btnAbrir = new JButton(imgAbrir);
		tlbHerramientas.add(btnAbrir);

		ImageIcon imgSubscribe = new ImageIcon("iconos/subscribe.gif");
		JButton btnSubscribe = new JButton(imgSubscribe);
		tlbHerramientas.add(btnSubscribe);
		
		ImageIcon imgUnsubscribe = new ImageIcon("iconos/unsubscribe.gif");
		JButton btnUnsubscribe = new JButton(imgUnsubscribe);
		tlbHerramientas.add(btnUnsubscribe);

		add(tlbHerramientas, BorderLayout.NORTH);

		JTextArea txtEscribiendo = new JTextArea();
		//txtEscribiendo.setPreferredSize(new Dimension(235, 100));
		
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

// PROFESOR:

//package hoja03;
//
//import java.awt.BorderLayout;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JToolBar;
//
//public class Ejer01 extends JFrame {
//
//	public Ejer01() {
//
//		super("Planificador personal");
//		setSize(400, 200);
//		setLayout(new BorderLayout());
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//		JButton btnNuevo = new JButton(new ImageIcon("iconos/1.png"));
//		JButton btnNivel = new JButton(new ImageIcon("iconos/11.png"));
//		JButton btnGuardar = new JButton(new ImageIcon("iconos/22.png"));
//		JButton btnBombilla = new JButton(new ImageIcon("iconos/3.png"));
//		JButton btnCalendario = new JButton(new ImageIcon("iconos/44.png"));
//		JButton btnFoto = new JButton(new ImageIcon("iconos/66.png"));
//		JButton btnTele = new JButton(new ImageIcon("iconos/67.png"));
//		JButton btnConfiguracion = new JButton(new ImageIcon("iconos/73.png"));
//
//		JToolBar tlbPlanificador = new JToolBar();
//		tlbPlanificador.add(btnNuevo);
//		tlbPlanificador.add(btnNivel);
//		tlbPlanificador.add(btnGuardar);
//		tlbPlanificador.add(btnBombilla);
//		tlbPlanificador.addSeparator();
//
//		tlbPlanificador.add(btnCalendario);
//		tlbPlanificador.add(btnFoto);
//		tlbPlanificador.add(btnTele);
//		tlbPlanificador.addSeparator();
//
//		tlbPlanificador.add(btnConfiguracion);
//
//		add(tlbPlanificador, BorderLayout.NORTH);
//
//		setVisible(true);
//	}
//
//	public static void main(String[] args) {
//		new Ejer01();
//
//	}
//}
