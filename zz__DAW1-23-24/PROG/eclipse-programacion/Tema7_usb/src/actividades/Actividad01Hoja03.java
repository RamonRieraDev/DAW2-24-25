package actividades;

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

public class Actividad01Hoja03 extends JFrame {

	public Actividad01Hoja03() {

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
		txtEscribiendo.setPreferredSize(new Dimension(235, 100));
		
		JPanel panelCentro = new JPanel();
		panelCentro.setLayout(new FlowLayout());

		add(panelCentro, BorderLayout.CENTER);
		add(txtEscribiendo);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Actividad01Hoja03();
	}

}