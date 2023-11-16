package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class pMedia extends JPanel {
	
	Cursor cMano = new Cursor(Cursor.HAND_CURSOR);
	Font fuenteTituloPrincipal = new Font("Tahoma", Font.PLAIN, 15);
	Font fuentePanel = new Font("Arial", Font.BOLD, 20);
    Font fuenteTitulo = new Font("Calibri (Body)", Font.BOLD, 12);
	Color colorventana = new Color(221,240,89,255);
	Color colorventana1 = new Color(35,47,62,255);
	ImageIcon todo = new ImageIcon("src\\imagenes\\todo.PNG");

	public pMedia() {
		
		setLayout(null);
		setBackground(colorventana1);
        inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		   //BOTON TODO
        JButton bTodo = new JButton();
        bTodo.setBounds(10,0, 100, 30);
        bTodo.setFocusable(false);
        bTodo.setBackground(colorventana1);
        bTodo.setForeground(Color.white);
        bTodo.setBorder(null);
        bTodo.setIcon(todo);
        bTodo.setCursor(cMano);
        add(bTodo);

      //BOTON OFERTA DEL DIA
        JButton bOferta = new JButton("Oferta del Dia");
        bOferta.setBounds(110,0,150, 30);
        bOferta.setFocusable(false);
        bOferta.setBackground(colorventana1);
        bOferta.setForeground(Color.white);
        bOferta.setBorder(null);
        bOferta.setCursor(cMano);
        add(bOferta);
        
      //BOTON SERVICIO AL CLIENTE
        JButton bServicio = new JButton("Servicio al cliente");
        bServicio.setBounds(260,0, 150, 30);
        bServicio.setFocusable(false);
        bServicio.setBackground(colorventana1);
        bServicio.setForeground(Color.white);
        bServicio.setBorder(null);
        bServicio.setCursor(cMano);
        add(bServicio);
        
      //BOTON LISTAS
        JButton bListas = new JButton("Listas");
        bListas.setBounds(410,0, 100, 30);
        bListas.setFocusable(false);
        bListas.setBackground(colorventana1);
        bListas.setForeground(Color.white);
        bListas.setBorder(null);
        bListas.setCursor(cMano);
        add(bListas);
        
      //BOTON TARJETAS DE REGALO
        JButton bTarjetas = new JButton("Tarjetas de regalo");
        bTarjetas.setBounds(510,0, 150, 30);
        bTarjetas.setFocusable(false);
        bTarjetas.setBackground(colorventana1);
        bTarjetas.setForeground(Color.white);
        bTarjetas.setBorder(null);
        bTarjetas.setCursor(cMano);
        add(bTarjetas);
        
      //BOTON VENDER
        JButton bVender = new JButton("Vender");
        bVender.setBounds(660,0, 100, 30);
        bVender.setFocusable(false);
        bVender.setBackground(colorventana1);
        bVender.setForeground(Color.white);
        bVender.setBorder(null);
        bVender.setCursor(cMano);
        add(bVender);
		
	}
	

}
