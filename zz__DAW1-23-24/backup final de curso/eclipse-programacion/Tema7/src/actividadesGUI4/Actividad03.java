package actividadesGUI4;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.concurrent.Flow;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Actividad03 extends JFrame implements ItemListener {

	private JCheckBox chkBilletes;
	private JCheckBox chkTransporte;
	private JCheckBox chkEstancia;
	private JCheckBox chkPension;
	private JLabel lblPrecio;
	

	public Actividad03() {

		super("Viajes Gorrión");
		setSize(200, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblOpciones = new JLabel("Opciones:");

		chkBilletes = new JCheckBox("Billetes de avión", true);
		chkBilletes.addItemListener(this);

		chkTransporte = new JCheckBox("Transporte aeropuerto");
		chkTransporte.addItemListener(this);

		chkEstancia = new JCheckBox("Estancia en el hotel");
		chkEstancia.addItemListener(this);

		chkPension = new JCheckBox("Pensión completa");
		chkPension.addItemListener(this);

		lblPrecio = new JLabel("Precio total: " + 120);

		add(lblOpciones);
		add(chkBilletes);
		add(chkTransporte);
		add(chkEstancia);
		add(chkPension);
		add(lblPrecio);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Actividad03();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int precio = 0;
		
		if (chkBilletes.isSelected()) {
			precio = precio + 120;
		}
		
		if (chkTransporte.isSelected()) {
			precio = precio + 40;
		}
		if (chkEstancia.isSelected()) {
			precio = precio + 180;
		}
		if (chkPension.isSelected()) {
			precio = precio + 70;
		}

		lblPrecio.setText("Precio total: " + precio);
	}

}
