import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ejemplo26 extends JFrame implements MouseListener {

	private JLabel lblMensaje;

	private int x, y;

	public Ejemplo26() {
		super("Mouse");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		addMouseListener(this);
		
		lblMensaje = new JLabel("Haz clic con el ratón!");
		add(lblMensaje);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo26();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
		lblMensaje.setText("Coordenadas: (" + e.getX() + ", " + e.getY() + ")");
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

}