package services;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class tarjeta extends JPanel{
    public tarjeta(String titulo, String rutaimagen, String desc){
        
        JLabel limagen = new JLabel(new ImageIcon(rutaimagen));
        limagen.setBounds(10, 10, 160, 160);
        add(limagen);
        
        JLabel lTitulo = new JLabel(titulo);
        lTitulo.setBounds(10, 180, 150, 20);
        lTitulo.setForeground(Color.white);
        lTitulo.setFont(recursos.fuente2);
        add(lTitulo);
        
        JTextArea ldesc = new JTextArea(desc);
        ldesc.setBounds(6, 200, 150, 50);
        ldesc.setFont(recursos.fuente4);
        ldesc.setLineWrap(true); // cambie de linea
        ldesc.setBackground(null); // eliminar fondo
        ldesc.setEditable(false); // no se pueda modificar
        ldesc.setFocusable(false);
        ldesc.setWrapStyleWord(true);
        
        add(ldesc);
        
        cargarPropiedades();
    }
    private void cargarPropiedades(){
        setBackground(recursos.grisboton);
        setSize(180, 240);
        setLayout(null);    
    }
}