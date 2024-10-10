import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Ejemplo05 extends JFrame {

	public Ejemplo05() {

		super("Términos y condiciones");

		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		JCheckBox chkAceptarTerminos = new JCheckBox("Acepto los términos y condicones.");
		JCheckBox chkAcerptarPublicidad = new JCheckBox("Acepto recibir publicidad.");

		add(chkAceptarTerminos);
		add(chkAcerptarPublicidad);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo05 ejemplo = new Ejemplo05();

	}

}
