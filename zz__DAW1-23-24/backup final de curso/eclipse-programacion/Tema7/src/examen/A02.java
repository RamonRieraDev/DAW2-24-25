package examen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class A02 extends JFrame{

	private JProgressBar prg2;
	
	public A02() {
		
		super("Potencia");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);
		
		JLabel lblajuste = new JLabel("Ajuste la potencia (en CV):");
		
		JSlider sld1 = new JSlider(0, 2000, 300);
		sld1.setPaintLabels(true);
		sld1.setPaintTicks(true);
		sld1.setMinorTickSpacing(100);
		sld1.setMajorTickSpacing(500);
		sld1.setPreferredSize(new Dimension(350, 50));
		sld1.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				if(sld1.getValueIsAdjusting()) {
					
					prg2.setValue(sld1.getValue() / 20); 
					
					if(sld1.getValue() >= 0  &&  sld1.getValue() <= 1400) {
						prg2.setForeground(Color.green);
					}
					
					if(sld1.getValue() > 1400 && sld1.getValue() <= 1800) {
						prg2.setForeground(Color.orange);
					}
					
					if(sld1.getValue() > 1800 && sld1.getValue() <= 2000) {
						prg2.setForeground(Color.red);
					}
				}
				
				
				
			}
		});
		
		prg2 = new JProgressBar(JProgressBar.VERTICAL);
		prg2.setPreferredSize(new Dimension(70, 300));
		prg2.setValue(15);
		prg2.setStringPainted(true);
		prg2.setForeground(Color.green);
		
		add(lblajuste);
		add(sld1);
		add(prg2);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new A02();
		
	}
}
