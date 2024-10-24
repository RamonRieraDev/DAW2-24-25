package practica;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class CajaRegistradora extends JFrame {

	// ATRIBUTOS:

	public String[][] stock = { { "Café con leche", "1.20" }, { "Café cortado", "1.00" }, { "Café solo", "0.85" },
			{ "Napolitana de Jamón York y queso", "2.30" }, { "Napolitana de chocolate", "2.10" },
			{ "Croissant", "1.80", }, { "Té verde", "1.80" }, { "Desayuno especial del lunes", "3.50" } };

	// Para hacer pruebas he asignado número más pequeño pero, para que funcione
	// el programa día a día, 100 lo veo más que bien.
	public Cuenta cuenta = new Cuenta(100);

	public JComboBox<String> cmbArticulos = new JComboBox<>();

	public JTextField txtUnidades = new JTextField(10);

	public JTextArea txtCuenta = new JTextArea(cuenta.listadoArticulos());

	public String precioArticuloString = "";

	// MÉTODOS:

	// Constructor:
	public CajaRegistradora() {

		super("Caja registradora");

		setSize(800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setLocationRelativeTo(null);

		// PANEL IZQUIERDA
		JPanel panelLeft = new JPanel();
		panelLeft.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelLeft.setPreferredSize(new Dimension(300, 450));

		// PANEL PRODUCTO
		JPanel panelProducto = new JPanel();
		panelProducto.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelProducto.setPreferredSize(new Dimension(290, 50));

		JLabel lblProducto = new JLabel("Producto");

		cmbArticulos.setPreferredSize(new Dimension(280, 20));

		// Hago un for para añadir elemento a elemento en el JComboBox
		// en lugar de hacerlo uno a uno. Así, si se modifica el array
		// automáticamente se modifica dicho JComboBox:
		String[] nombreArticulos = new String[stock.length];
		for (int i = 0; i < nombreArticulos.length; i++) {
			cmbArticulos.addItem(stock[i][0]);
		}

		// PANEL UNIDADES:
		JPanel panelUnidades = new JPanel();
		panelUnidades.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelUnidades.setPreferredSize(new Dimension(120, 50));

		JLabel lblUnidades = new JLabel("Unidades");
		// Pongo el txtUnidades de primeras a 1 porque así lo he visto en tus ejemplos.
		txtUnidades.setText("1");

		// PANEL BOTONES:
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelBotones.setPreferredSize(new Dimension(290, 100));

		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.setPreferredSize(new Dimension(130, 20));

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setPreferredSize(new Dimension(130, 20));

		JButton btnNueva = new JButton("Nueva cuenta");
		btnNueva.setPreferredSize(new Dimension(130, 20));

		// ADDS PANEL IZQUIERDO
		panelProducto.add(lblProducto);
		panelProducto.add(cmbArticulos);
		panelUnidades.add(lblUnidades);
		panelUnidades.add(txtUnidades);
		panelBotones.add(btnAnadir);
		panelBotones.add(btnCalcular);
		panelBotones.add(btnNueva);

		// PANEL DERECHA
		JPanel panelRight = new JPanel();
		panelRight.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panelRight.setPreferredSize(new Dimension(450, 450));

		// PANEL CUENTA
		JPanel panelCuenta = new JPanel();
		panelCuenta.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelCuenta.setPreferredSize(new Dimension(450, 450));

		JLabel lblCuenta = new JLabel("Cuenta");

		// Sin JScrollPane:
		//txtCuenta.setPreferredSize(new Dimension(430, 400));

		// Con JScrollPane para que se pueda ver toda la cuenta en caso
		// que sea muy larga. No se ha pedido en la práctica. Por ese motivo
		// están comentadas las opciones sin JScrolPane en el caso de probar
		// como tal y como se pide en la práctica:
		JScrollPane scrCuenta = new JScrollPane(txtCuenta);
		scrCuenta.setPreferredSize(new Dimension(430, 400));
		
		// ADDS PANEL DERECHA
		panelCuenta.add(lblCuenta);
		panelCuenta.add(scrCuenta);
		// panelCuenta.add(txtCuenta);

		// ADDS TOTAL
		add(panelLeft, BorderLayout.EAST);
		panelLeft.add(panelProducto);
		panelLeft.add(panelUnidades);
		panelLeft.add(panelBotones);
		add(panelRight, BorderLayout.WEST);
		panelRight.add(panelCuenta);

		// ACTION LISTENERS:
		btnAnadir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				anyadirProducto();
				txtCuenta.setText(cuenta.listadoArticulos());

			}
		});

		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				calcularCuenta();

			}
		});

		btnNueva.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int descartar = JOptionPane.showConfirmDialog(null,
						"¿Está seguro de que quiere descartar la cuenta actual?", "Caja registradora",
						JOptionPane.YES_NO_OPTION);

				// El JOptionPane.showConfirmDialog devuelve 1, -1 (si estuviera la opción de cancelar) ó 0. 
				// 0 significa que se ha dicho 'sí', por lo tanto reinicializo la clase cuenta con el método
				// nuevaCuenta() y vuelvo a poner el encabezado de dicha cuenta:
				if (descartar == 0) {

					nuevaCuenta();

					txtCuenta.setText(cuenta.ENCABEZADO_CUENTA + "\n"
							+ String.format("%-25s %4s %8s %8s\n", "DESCRIPCIÓN", "UDS.", "PRE./UD.", "TOTAL(€)")
							+ String.format("%-25s %4s %8s %8s\n", "-------------------------", "----", "--------",
									"--------"));

				}
			}

		});

		setVisible(true);

	}

	// Método main:
	public static void main(String[] args) {

		// LOOKANDFEEL
		try {
			// He elegido este look and feel porque es de letra monoespaciada y queda todo
			// bien cuadrado. En especial
			// el String.format que se recomendó en la práctica.
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			// Para provocar un fallo y comprobar el mensaje de error he probado con
			// comentar la última línea
			// y sustituirla por esta:
			// UIManager.setLookAndFeel("UIManager.getSystemLookAndFeelClassName()");
		} catch (Exception e) {
			// Comento la siguiente línea para que sólamente salga la ventana de error.
			// Si se quiere ver el print basta con "descomentarla":
			// e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Se ha producido un error al aplicar el Look and Feel a la ventana.",
					"Caja registradora", JOptionPane.ERROR_MESSAGE);
		}

		new CajaRegistradora();

	}

	// Método que llama al método para añadir cada artículo:
	public void anyadirProducto() {

		cuenta.addArticulo((String) cmbArticulos.getSelectedItem(), txtUnidades.getText(),
				stock[cmbArticulos.getSelectedIndex()][1]);
		// Vuelvo a poner '1' en la casilla de unidades cada vez que se añade un artículo:
		txtUnidades.setText("1");

	}

	// Método que llama al método que devuelve un string con el total a pagar:
	public void calcularCuenta() {

		txtCuenta.setText(cuenta.listadoArticulos() + cuenta.totales());

	}

	// Método que llama al método que resetea la cuenta y reinicializa la clase
	// Cuenta():
	public void nuevaCuenta() {

		cuenta.resetear();

	}

}
