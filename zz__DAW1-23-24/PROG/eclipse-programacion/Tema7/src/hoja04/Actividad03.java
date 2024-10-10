package hoja04;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Actividad03 extends JFrame implements ItemListener {

    private JCheckBox checkAvion;
    private JCheckBox checkAeropuerto;
    private JCheckBox checkHotel;
    private JCheckBox checkPensionCompleta;
    private JLabel lblPrecioTotal;

    public Actividad03() {

        super("Viajes Gorrión");
        setSize(180, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lblOpciones = new JLabel("Opciones:");

        checkAvion = new JCheckBox("Billetes de avión", true);
        checkAvion.addItemListener(this);

        checkAeropuerto = new JCheckBox("Transporte aeropuerto");
        checkAeropuerto.addItemListener(this);

        checkHotel = new JCheckBox("Estancia en el hotel");
        checkHotel.addItemListener(this);

        checkPensionCompleta = new JCheckBox("Pensión completa");
        checkPensionCompleta.addItemListener(this);

        lblPrecioTotal = new JLabel("Precio total: 120 €");

        add(lblOpciones);
        add(checkAvion);
        add(checkAeropuerto);
        add(checkHotel);
        add(checkPensionCompleta);
        add(lblPrecioTotal);

        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
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
        new Actividad03();

    }

}