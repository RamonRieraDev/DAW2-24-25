package hoja05;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Actividad03 extends JFrame{

	JTextField txtResultado;
	
	public Actividad03() {
		
		super("Operaciones");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		setLocationRelativeTo(null);
		
		// OJO!! PONER EL ACTIONLISTENER AL FINAL DEL TODO""
		
		JLabel lblOperandoA = new JLabel("Operando A");
		JTextField txtOperandoA = new JTextField("55", 20);
		
		JLabel lblOperandoB = new JLabel("Operando B");
		JTextField txtOperandoB = new JTextField("30", 20);
		
		JLabel lblOperación = new JLabel("Operando C");
		String[] operacion = {"Suma", "Resta", "Multiplicación", "División"};
		JComboBox<String> cmbOperando = new JComboBox<String>(operacion);
		cmbOperando.setPreferredSize(new Dimension(200, 20));
		cmbOperando.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					int resultadoInt;
					double resultadoDouble;
					
					if(cmbOperando.getSelectedIndex() == 0) {
						resultadoInt = Integer.parseInt(txtOperandoA.getText()) + Integer.parseInt(txtOperandoB.getText());
						txtResultado.setText("" + resultadoInt);
					}
					
					if(cmbOperando.getSelectedIndex() == 1) {
						resultadoInt = Integer.parseInt(txtOperandoA.getText()) - Integer.parseInt(txtOperandoB.getText());
						txtResultado.setText("" + resultadoInt);
					}
					
					if(cmbOperando.getSelectedIndex() == 2) {
						resultadoInt = Integer.parseInt(txtOperandoA.getText()) * Integer.parseInt(txtOperandoB.getText());
						txtResultado.setText("" + resultadoInt);
					}
					
					if(cmbOperando.getSelectedIndex() == 3) {
						resultadoDouble = Double.parseDouble(txtOperandoA.getText()) / Double.parseDouble(txtOperandoB.getText());
						txtResultado.setText("" + resultadoDouble);
						//txtResultado.setText("" + Math.round(resultadoDouble * 100) / 100.0);
					}
					//double valorDouble = Double.parseDouble(txtOperandoA.getText());
				} catch (Exception e2) {
					txtResultado.setText("ERROR");
				}
			}
		});
		
		JLabel lblResultado = new JLabel("Resultado   ");
		txtResultado = new JTextField("", 20);
		
		add(lblOperandoA);
		add(txtOperandoA);
		add(lblOperandoB);
		add(txtOperandoB);
		add(lblOperación);
		add(cmbOperando);
		add(lblResultado);
		add(txtResultado);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Actividad03();
	}
	
}
