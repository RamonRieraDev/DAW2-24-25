package repaso;

import java.awt.Button;
import java.awt.FlowLayout;
import java.util.concurrent.Flow;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Pruebas extends JFrame {
public Pruebas() {
super("Checkboxes");
setSize(345, 120);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JCheckBox chkCursoJava = new JCheckBox("Curso de Java", false);
JCheckBox chkCursoFlash = new JCheckBox("Curso de Flash", true);
JCheckBox chkCursoPHP = new JCheckBox("Curso de PHP", false);
JCheckBox chkCursoRuby = new JCheckBox("Curso de Ruby", false);

setLayout(new FlowLayout());

//FlowLayout dis = new FlowLayout();
ButtonGroup cursos = new ButtonGroup();
cursos.add(chkCursoJava);
cursos.add(chkCursoFlash);
cursos.add(chkCursoPHP);
cursos.add(chkCursoRuby);
//setLayout(dis);
add(chkCursoJava);
add(chkCursoFlash);
add(chkCursoPHP);
add(chkCursoRuby);
setVisible(true);
}

public static void main(String[] args) {
	new Pruebas();
}
}
