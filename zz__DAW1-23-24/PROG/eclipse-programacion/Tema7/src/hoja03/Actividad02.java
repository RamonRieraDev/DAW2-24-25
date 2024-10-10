package hoja03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Actividad02 extends JFrame {

	public JList<String> lstMarcas;
	public JLabel lblRespuesta;
	
	public Actividad02() {
		super("Selección de modelo");
		setSize(400, 220);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		String[] marcas = { "Peugeot", "Volkswagen", "Renault", "Seat", "Ferrari", "Porsche", "Ferrari", "Jaguar",
				"Dacia" };

		lstMarcas = new JList<>(marcas);
		JScrollPane scrMarcas = new JScrollPane(lstMarcas);
		
		JLabel lblModelo = new JLabel("Modelo?");

		JButton btnModelo = new JButton("Dime el modelo");
		
		lblRespuesta = new JLabel();
		
		btnModelo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String selected = lstMarcas.getSelectedValue();
				if(lstMarcas.getSelectedValue() != null) {
					lblRespuesta.setText(selected);
				} else {
					lblRespuesta.setText("No hay nada seleccionado");
				}
				
			}
		});
		
		add(scrMarcas);
		add(lblModelo);
		add(btnModelo);
		add(lblRespuesta);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Actividad02();
	}

}