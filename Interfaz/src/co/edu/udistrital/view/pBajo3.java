package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pBajo3 extends JPanel{
	
	Cursor cMano = new Cursor(Cursor.HAND_CURSOR);
	Font fuentePanel = new Font("Arial", Font.BOLD, 20);
    Font fuenteTitulo = new Font("Calibri (Body)", Font.BOLD, 12);
	ImageIcon Electro1 = new ImageIcon("src\\imagenes\\electronicos.PNG");


	public pBajo3() {
		
		setLayout(null);
		setBackground(Color.white);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		JLabel  Electro = new JLabel("Electronicos");
        Electro.setBounds( 5, 0, 280, 50);
        Electro.setBackground(Color.BLACK);
        Electro.setFont(fuentePanel);
        Electro.setLayout(null);
        add(Electro);
        
        JButton bElectronicos = new JButton();
        bElectronicos.setBounds(10,80, 260, 220);
        bElectronicos.setFocusable(false);
        bElectronicos.setBackground(Color.white);
        bElectronicos.setForeground(Color.white);
        bElectronicos.setBorder(null);
        bElectronicos.setIcon(Electro1);
        bElectronicos.setCursor(cMano);
        add(bElectronicos);
        
        JButton bElectro3 = new JButton("Ver más");
        bElectro3.setBounds(10, 353, 80, 25);
        bElectro3.setFocusable(false);
        bElectro3.setFont(fuenteTitulo);
        bElectro3.setBackground(Color.white);
        bElectro3.setForeground(Color.blue);
        bElectro3.setBorder(null);
        bElectro3.setCursor(cMano);
        add(bElectro3);
		
	}
		

}
