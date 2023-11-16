package services;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class canciones extends JPanel{
    public canciones(String numero, String titulo, String artista,String album, String tiempo, String rutaimagen){
        
        JLabel lnum = new JLabel(numero);
        lnum.setBounds(10, 15, 20, 20);
        lnum.setForeground(Color.white);
        lnum.setFont(recursos.fuente4);
        add(lnum);
        
        JLabel limagen = new JLabel(new ImageIcon(rutaimagen));
        limagen.setBounds(30, 5, 45, 45);
        add(limagen);
        
        JLabel lTitulo = new JLabel(titulo);
        lTitulo.setBounds(100, 10, 150, 15);
        lTitulo.setForeground(Color.white);
        lTitulo.setFont(recursos.fuente2);
        add(lTitulo);
        
        JLabel lArtista = new JLabel(artista);
        lArtista.setBounds(100, 30, 150, 15);
        lArtista.setForeground(Color.white);
        lArtista.setFont(recursos.fuente4);
        add(lArtista);
        
        JLabel lAlbum = new JLabel(album);
        lAlbum.setBounds(400, 17, 300, 15);
        lAlbum.setForeground(Color.white);
        lAlbum.setFont(recursos.fuente4);
        add(lAlbum);
        
        JLabel lTiempo = new JLabel(tiempo);
        lTiempo.setBounds(780, 17, 100, 15);
        lTiempo.setForeground(Color.white);
        lTiempo.setFont(recursos.fuente4);
        add(lTiempo);
  
        
        cargarPropiedades();
    }
    private void cargarPropiedades(){
        setOpaque(false);
        setSize(835, 55);
        setLayout(null);    
    }
}
