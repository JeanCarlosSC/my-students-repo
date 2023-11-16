package services;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class playlists extends JPanel{
    public playlists(String titulo, ImageIcon icon, String desc){
        
        JLabel limagen = new JLabel(icon);
        limagen.setBounds(5, 5, 70, 70);
        add(limagen);
        
        JLabel lTitulo = new JLabel(titulo);
        lTitulo.setBounds(90, 15, 150, 20);
        lTitulo.setFont(recursos.fuente1);
        lTitulo.setForeground(Color.white);
        add(lTitulo);
        
        JLabel ldesc = new JLabel(desc);
        ldesc.setBounds(90, 40, 150, 20);
        ldesc.setFont(recursos.fuente2);
        ldesc.setForeground(Color.gray);
        add(ldesc);
        
        cargarPropiedades();
    }
    private void cargarPropiedades(){
        setBackground(null);
        setSize(390, 80);
        setLayout(null);    
    }
}
