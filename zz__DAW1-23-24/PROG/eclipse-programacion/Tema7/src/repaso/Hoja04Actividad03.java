package repaso;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hoja04Actividad03 extends JFrame implements ItemListener{

	
	public JCheckBox chcBilletes;
	public JCheckBox chcTransporte;
	public JCheckBox chcEstancia;
	public JCheckBox chcPension;
	public JLabel lblTotal;
	
	public Hoja04Actividad03() {

		super("Viajes Gorrión");
		setSize(190, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);

		JLabel lblOpciones = new JLabel("Opciones:");

		chcBilletes = new JCheckBox("Billetes de avión");
		chcBilletes.addItemListener(this);
		
		chcTransporte = new JCheckBox("Transporte aeropuerto");
		chcTransporte.addItemListener(this);
		
		chcEstancia = new JCheckBox("Estancia en el hotel");
		chcEstancia.addItemListener(this);
		
		chcPension = new JCheckBox("Pensión completa");
		chcPension.addItemListener(this);
		
		lblTotal = new JLabel();

		add(lblOpciones);
		add(chcBilletes);
		add(chcTransporte);
		add(chcEstancia);
		add(chcPension);
		add(lblTotal);

		setVisible(true);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		double total = 0;
		
		if(chcBilletes.isSelected()) {
			total = total + 120;
		}
		
		if(chcTransporte.isSelected()) {
			total = total + 40;
		}
		
		if(chcEstancia.isSelected()) {
			total = total + 180;
		}
		
		if(chcPension.isSelected()) {
			total = total + 70;
		}
		
		lblTotal.setText("Total: " + total + " €.");
		
	}
	
	public static void main(String[] args) {

		new Hoja04Actividad03();

	}


}
