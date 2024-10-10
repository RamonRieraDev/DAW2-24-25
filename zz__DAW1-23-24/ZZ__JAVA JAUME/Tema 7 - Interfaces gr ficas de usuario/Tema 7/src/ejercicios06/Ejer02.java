package ejercicios06;

import javax.swing.*;
import java.awt.*;

public class Ejer02 extends JFrame {

	public static void main(String[] args) {

		new Ejer02();
	}

	public Ejer02() {

		super("Salpicadero");
		setSize(470, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		
		//DERECHA
		JPanel pnlDerecha = new JPanel();
		pnlDerecha.setPreferredSize(new Dimension(225, 180));
		JLabel lblVelocidad = new JLabel("Velocidad");
		JSlider sldVelocidad = new JSlider(JSlider.HORIZONTAL, 0, 180, 30);
		sldVelocidad.setMajorTickSpacing(30);
		sldVelocidad.setMinorTickSpacing(10);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setPaintLabels(true);
		
		pnlDerecha.add(lblVelocidad);
		pnlDerecha.add(sldVelocidad);
		
		
		//IZQUIERDA
		JPanel pnlIzquierda = new JPanel();
		pnlIzquierda.setPreferredSize(new Dimension(225, 180));
		pnlIzquierda.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblControles = new JLabel("Controles de vehículo");
		JButton btnArrancar = new JButton("Arrancar");
		btnArrancar.setPreferredSize(new Dimension(200, 25));
		JButton btnParar = new JButton("Parar");
		btnParar.setPreferredSize(new Dimension(200, 25));
		JButton btnFreno = new JButton("Freno Estacionamiento");
		btnFreno.setPreferredSize(new Dimension(200, 25));

		pnlIzquierda.add(lblControles);
		pnlIzquierda.add(btnArrancar);
		pnlIzquierda.add(btnParar);
		pnlIzquierda.add(btnFreno);
		
		add(pnlDerecha);
		add(pnlIzquierda);

		

		setVisible(true);

	}

}
