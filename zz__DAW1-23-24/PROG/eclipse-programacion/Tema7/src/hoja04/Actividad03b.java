package hoja04;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Actividad03b extends JFrame {

	private JCheckBox checkAvion;
	private JCheckBox checkAeropuerto;
	private JCheckBox checkHotel;
	private JCheckBox checkPensionCompleta;
	private JLabel lblPrecioTotal;

	public Actividad03b() {

		super("Viajes Gorrión");
		setSize(220, 220);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblOpciones = new JLabel("Opciones:");

		checkAvion = new JCheckBox("Billetes de avión", true);
		checkAvion.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				actualizaPrecio();
			}
		});

		checkAeropuerto = new JCheckBox("Transporte aeropuerto");
		checkAeropuerto.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				actualizaPrecio();
			}
		});

		checkHotel = new JCheckBox("Estancia en el hotel");
		checkHotel.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				actualizaPrecio();
			}
		});

		checkPensionCompleta = new JCheckBox("Pensión completa");
		checkPensionCompleta.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				actualizaPrecio();
			}
		});

		lblPrecioTotal = new JLabel("Precio total: 120 €");

		add(lblOpciones);
		add(checkAvion);
		add(checkAeropuerto);
		add(checkHotel);
		add(checkPensionCompleta);
		add(lblPrecioTotal);

		setVisible(true);

	}
	
	private void actualizaPrecio() {
		
		int precioTotal = 0;

        if (checkAvion.isSelected()) {
            precioTotal += 120;
        }
        if (checkAeropuerto.isSelected()) {
            precioTotal += 40;
        }
        if (checkHotel.isSelected()) {
            precioTotal += 180;
        }
        if (checkPensionCompleta.isSelected()) {
            precioTotal += 70;
        }

        lblPrecioTotal.setText("Precio total: " + precioTotal + " €");
		
	}

	public static void main(String[] args) {
		new Actividad03b();

	}

}