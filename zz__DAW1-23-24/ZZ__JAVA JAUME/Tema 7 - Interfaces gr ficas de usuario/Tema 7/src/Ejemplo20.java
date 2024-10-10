import javax.swing.*;
import java.awt.*;
import java.rmi.activation.ActivationGroupID;

public class Ejemplo20 extends JFrame {

	public Ejemplo20() {

		super("Título");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());

		JButton btnBotonNorte = new JButton("Norte");
		JButton btnBotonOeste = new JButton("Oeste");
		JButton btnBotonEste = new JButton("Este");
		JButton btnBotonSur = new JButton("Sur");
		JButton btnBotonCentro = new JButton("Centro");

		add(btnBotonNorte, BorderLayout.NORTH);
		add(btnBotonOeste, BorderLayout.WEST);
		add(btnBotonEste, BorderLayout.EAST);
		add(btnBotonSur, BorderLayout.SOUTH);
		add(btnBotonCentro, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo20();
	}

}