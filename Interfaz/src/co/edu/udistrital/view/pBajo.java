package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pBajo extends JPanel {
	
	Color colorventana = new Color(221,240,89,255);
	
	public pBajo() {
		
		setLayout(null);
		setBackground(colorventana);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		ImageIcon portada= new ImageIcon("src\\imagenes\\portada.jpg");
        ImageIcon logoEscalado5 = new ImageIcon(portada.getImage().getScaledInstance(1280, 720,Image.SCALE_AREA_AVERAGING));
        JLabel lportada = new JLabel (logoEscalado5);
        lportada.setBounds(0,0, 1280, 720);
        add(lportada);
	}

}
