package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pBajo2 extends JPanel {
	
	Cursor cMano = new Cursor(Cursor.HAND_CURSOR);
	Font fuenteTituloPrincipal = new Font("Tahoma", Font.PLAIN, 15);
	Font fuentePanel = new Font("Arial", Font.BOLD, 20);
    Font fuenteTitulo = new Font("Calibri (Body)", Font.BOLD, 12);	
	ImageIcon enviarH = new ImageIcon("src\\imagenes\\enviar a.jpg");
	

	public pBajo2() {
		
		setLayout(null);
		setBackground(Color.white);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		  JLabel  envio2= new JLabel("Colombia");
	        envio2.setBounds( 5, 30, 280, 30);
	        envio2.setBackground(Color.BLACK);
	        envio2.setFont(fuentePanel);
	        envio2.setLayout(null);
	        add(envio2);
	       
	        JLabel  envio= new JLabel("Envio GRATUITO a");
	        envio.setBounds( 5, 0, 280, 30);
	        envio.setBackground(Color.BLACK);
	        envio.setFont(fuentePanel);
	        envio.setLayout(null);
	        add(envio);
	        
	    
	        JButton benvio = new JButton();
	        benvio.setBounds(10,80, 265, 215);
	        benvio.setFocusable(false);
	        benvio.setFont(fuenteTituloPrincipal);
	        benvio.setBackground(Color.white);
	        benvio.setForeground(Color.white);
	        benvio.setBorder(null);
	        benvio.setIcon(enviarH);
	        benvio.setCursor(cMano);
	        add(benvio);
	        
	        //10,80, 265, 215
	        
	        JButton bmasInfo = new JButton("Más información");
	        bmasInfo.setBounds(10, 353, 120, 25);
	        bmasInfo.setFocusable(false);
	        bmasInfo.setFont(fuenteTitulo);
	        bmasInfo.setBackground(Color.white);
	        bmasInfo.setForeground(Color.blue);
	        bmasInfo.setBorder(null);
	        bmasInfo.setCursor(cMano);
	       add(bmasInfo);
		
	}
		

}
