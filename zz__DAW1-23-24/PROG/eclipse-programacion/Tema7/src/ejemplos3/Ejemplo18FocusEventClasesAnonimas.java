package ejemplos3;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ejemplo18FocusEventClasesAnonimas extends JFrame {

    private JTextField txtNum1;
    private JTextField txtNum2;
    private JTextField txtNum3;
    private JLabel lblMedia;

    public Ejemplo18FocusEventClasesAnonimas() {

        super("Media aritmética");
        setSize(250, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        setLocationRelativeTo(null);

        txtNum1 = new JTextField("0", 5);
        txtNum1.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                calcular();
            }

            @Override
            public void focusLost(FocusEvent e) {
            	// No lo usamos.
            }

        });

        txtNum2 = new JTextField("0", 5);
        txtNum2.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                calcular();
            }

            @Override
            public void focusLost(FocusEvent e) {
            	// No lo usamos.
            }

        });

        txtNum3 = new JTextField("0", 5);
        txtNum3.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                calcular();
            }

            @Override
            public void focusLost(FocusEvent e) {
            	// No lo usamos.
            }

        });

        lblMedia = new JLabel();

        add(txtNum1);
        add(txtNum2);
        add(txtNum3);
        add(lblMedia);

        setVisible(true);
    }

    private void calcular() {
        try {
            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());
            int num3 = Integer.parseInt(txtNum3.getText());

            double media = (num1 + num2 + num3) / 3.0;

            lblMedia.setText("Media= " + media);
        } catch (NumberFormatException e1) {
            lblMedia.setText("ERROR");
        }
    }


    public static void main(String[] args) {
        Ejemplo18FocusEventClasesAnonimas ventana = new Ejemplo18FocusEventClasesAnonimas();
    }

}