package actividadesGUI3;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Actividad02 extends JFrame{
	
	public Actividad02() {
		
		super("Selección de modelo");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		setLocationRelativeTo(null);
		
		String [] coches = {"Peugeot", "Volkswagen", "Renault", "Seat", "Ferrari", "Porsche",
							"Jaguar", "Dacia", "Ford"};
		
		JList<String> lstCoche = new JList<String>(coches);
		
		JScrollPane scrCoche = new JScrollPane(lstCoche);
		scrCoche.setPreferredSize(new Dimension(110, 140));
		
		JLabel lblCoche = new JLabel("Modelo?");
		
		add(scrCoche);
		add(lblCoche);
		
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Actividad02();
	}

}
