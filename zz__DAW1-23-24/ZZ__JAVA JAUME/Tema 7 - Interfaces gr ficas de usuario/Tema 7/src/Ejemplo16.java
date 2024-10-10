import javax.swing.*;
import java.awt.*;

public class Ejemplo16 extends JFrame {

	public Ejemplo16() {

		super("Menús");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		// Barra de menú.
		JMenuBar barraMenu = new JMenuBar();

		// Menú File
		JMenu menuFile = new JMenu("File");

		JMenuItem itemNew = new JMenuItem("New");
		JMenuItem itemOpenFile = new JMenuItem("Open file ...");
		JMenuItem itemOpenProjects = new JMenuItem("Open Projects from File System");

		menuFile.add(itemNew);
		menuFile.add(itemOpenFile);
		menuFile.add(itemOpenProjects);

		// Menú Edit
		JMenu menuEdit = new JMenu("Edit");

		JMenuItem itemUndo = new JMenuItem("Undo Typing");
		JMenuItem itemRedo = new JMenuItem("Redo");
		JMenuItem itemCut = new JMenuItem("Cut");

		menuEdit.add(itemUndo);
		menuEdit.add(itemRedo);
		menuEdit.addSeparator();
		menuEdit.add(itemCut);

		// Añadimos los menús a la barra de menús.
		barraMenu.add(menuFile);
		barraMenu.add(menuEdit);

		setJMenuBar(barraMenu);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo16();
	}

}