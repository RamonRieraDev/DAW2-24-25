package ejercicios04;

import javax.swing.*;
import java.awt.*;

public class Ejer01b extends JFrame {

	public Ejer01b() {

		super("Fotogramas");

		setSize(850, 550);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Usamos border Layout para colocar correctamente la bara de herramientas

		setLayout(new FlowLayout());

		JPanel panelBotones = new JPanel();

		JButton btnBlackRain = new JButton("Black Rain");
		JButton btnElCasoWinslow = new JButton("El caso Winslow");
		JButton btnAsaltoAlDistrito13 = new JButton("Asalto al distrito 13");
		JButton btnBladeRunner = new JButton("Blade Runner");

		panelBotones.add(btnBlackRain);
		panelBotones.add(btnElCasoWinslow);
		panelBotones.add(btnAsaltoAlDistrito13);
		panelBotones.add(btnBladeRunner);

		ImageIcon imgBladeRunner = new ImageIcon("iconos/bladerunner.jpg");
		JLabel lblImagen = new JLabel(imgBladeRunner);

		add(panelBotones, BorderLayout.NORTH);
		add(lblImagen, BorderLayout.CENTER);

		setVisible(true);
		
	}

	public static void main(String[] args) {

		new Ejer01b();

	}

}