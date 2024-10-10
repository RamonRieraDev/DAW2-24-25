import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Ejemplo02 extends JFrame{
	
	public Ejemplo02() {
		
		super("Playback");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		
		JButton botonPlay = new JButton("Play");
		JButton botonPlay2 = new JButton("Clicka, cabeza Aguacate");
		JButton botonPlay3 = new JButton("Clicka si crees que Óscar "
				+ "es un MasterLel");
		add(botonPlay);
		add(botonPlay2);
		add(botonPlay3);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		Ejemplo02 ejemplo = new Ejemplo02();
		
	}
}
