package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pBajo1 extends JPanel{
	
	Cursor cMano = new Cursor(Cursor.HAND_CURSOR);
	Font fuenteTituloPrincipal = new Font("Tahoma", Font.PLAIN, 15);
	Font fuentePanel = new Font("Arial", Font.BOLD, 20);
    Font fuenteTitulo = new Font("Calibri (Body)", Font.BOLD, 12);
	ImageIcon auriculares = new ImageIcon("src\\imagenes\\auriculares.jpg");
	ImageIcon teclado = new ImageIcon("src\\imagenes\\teclado.jpg");
	ImageIcon silla = new ImageIcon("src\\imagenes\\silla.jpg");
	ImageIcon mouse = new ImageIcon("src\\imagenes\\mouse.jpg");
	

	public pBajo1() {
		
		setLayout(null);
		setBackground(Color.white);
		inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		JLabel  videojuegos = new JLabel("Accesorios para juegos");
        videojuegos.setBounds( 5, 0, 280, 50);
        videojuegos.setBackground(Color.BLACK);
        videojuegos.setFont(fuentePanel);
        videojuegos.setLayout(null);
        add(videojuegos);
        
        
        
        JButton bauriculares = new JButton();
        bauriculares.setBounds(5,80, 120, 100);
        bauriculares.setFocusable(false);
        bauriculares.setFont(fuenteTituloPrincipal);
        bauriculares.setBackground(Color.white);
        bauriculares.setForeground(Color.white);
        bauriculares.setBorder(null);
        bauriculares.setIcon(auriculares);
        bauriculares.setCursor(cMano);
        add(bauriculares);
        
        JLabel  auriculares1= new JLabel("Auriculares");
        auriculares1.setBounds( 20, 185, 120, 25);
        auriculares1.setBackground(Color.BLACK);
        auriculares1.setFont(fuenteTitulo);
        auriculares1.setLayout(null);
        add(auriculares1);
        
        JButton bteclado = new JButton();
        bteclado.setBounds(150,80, 120, 100);
        bteclado.setFocusable(false);
        bteclado.setFont(fuenteTituloPrincipal);
        bteclado.setBackground(Color.white);
        bteclado.setForeground(Color.white);
        bteclado.setBorder(null);
        bteclado.setIcon(teclado);
        bteclado.setCursor(cMano);
        add(bteclado);
        
        JLabel  teclado1= new JLabel("Teclados");
        teclado1.setBounds( 160, 185, 120, 25);
        teclado1.setBackground(Color.BLACK);
        teclado1.setFont(fuenteTitulo);
        teclado1.setLayout(null);
        add(teclado1);
        
        JButton bMouse = new JButton();
        bMouse.setBounds(5,210,120, 100);
        bMouse.setFocusable(false);
        bMouse.setFont(fuenteTituloPrincipal);
        bMouse.setBackground(Color.white);
        bMouse.setForeground(Color.white);
        bMouse.setBorder(null);
        bMouse.setIcon(mouse);
        bMouse.setCursor(cMano);
        add(bMouse);
        
        JLabel  mouse1= new JLabel("Ratones de ");
        mouse1.setBounds( 20, 315, 120, 25);
        mouse1.setBackground(Color.BLACK);
        mouse1.setFont(fuenteTitulo);
        mouse1.setLayout(null);
        add(mouse1);
        
        JLabel  mouse2= new JLabel("computadora");
        mouse2.setBounds( 20, 330, 120, 25);
        mouse2.setBackground(Color.BLACK);
        mouse2.setFont(fuenteTitulo);
        mouse2.setLayout(null);
        add(mouse2);
        
        
        JButton bsilla = new JButton();
        bsilla.setBounds(150,210, 120, 100);
        bsilla.setFocusable(false);
        bsilla.setFont(fuenteTituloPrincipal);
        bsilla.setBackground(Color.white);
        bsilla.setForeground(Color.white);
        bsilla.setBorder(null);
        bsilla.setIcon(silla);
        bsilla.setCursor(cMano);
        add(bsilla);
        
        JLabel  silla1= new JLabel("Sillas");
        silla1.setBounds( 160, 315, 120, 25);
        silla1.setBackground(Color.BLACK);
        silla1.setFont(fuenteTitulo);
        silla1.setLayout(null);
        add(silla1);
        
        
    
        
        JButton bVermas = new JButton("Ver más");
        bVermas.setBounds(10, 353, 80, 25);
        bVermas.setFocusable(false);
        bVermas.setFont(fuenteTitulo);
        bVermas.setBackground(Color.white);
        bVermas.setForeground(Color.blue);
        bVermas.setBorder(null);
        bVermas.setCursor(cMano);
        add(bVermas);
		
	}

}
