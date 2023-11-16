package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pBajo4 extends JPanel{
	
	Cursor cMano = new Cursor(Cursor.HAND_CURSOR);
	Font fuentePanel = new Font("Arial", Font.BOLD, 20);
    Font fuenteTitulo = new Font("Calibri (Body)", Font.BOLD, 12);
	ImageIcon Basics = new ImageIcon("src\\imagenes\\basics.jpg");
	
	public pBajo4() {
		
		setLayout(null);
		setBackground(Color.white);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		JLabel  AMAZONB = new JLabel("AmazonBasics");
        AMAZONB.setBounds(5, 0, 280, 50);
        AMAZONB.setBackground(Color.BLACK);
        AMAZONB.setFont(fuentePanel);
        AMAZONB.setLayout(null);
        add(AMAZONB);
        
        JButton bAmaBasics2 = new JButton();
        bAmaBasics2.setBounds(15,80, 220, 220);
        bAmaBasics2.setFocusable(false);
        bAmaBasics2.setBackground(Color.white);
        bAmaBasics2.setForeground(Color.white);
        bAmaBasics2.setBorder(null);
        bAmaBasics2.setIcon(Basics);
        bAmaBasics2.setCursor(cMano);
        add(bAmaBasics2);
        
        
        JButton bAmaBasics = new JButton("Ver más");
        bAmaBasics.setBounds(10, 353, 80, 25);
        bAmaBasics.setFocusable(false);
        bAmaBasics.setFont(fuenteTitulo);
        bAmaBasics.setBackground(Color.white);
        bAmaBasics.setForeground(Color.blue);
        bAmaBasics.setBorder(null);
        bAmaBasics.setCursor(cMano);
        add(bAmaBasics);
        
		
	}
		

}
