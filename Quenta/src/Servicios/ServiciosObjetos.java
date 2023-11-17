/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import static Vista.PanelDashboard.resumenFinancieros;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class ServiciosObjetos {
    
    public static ImageIcon crearImagen(int ancho, int alto, String rutaImagen) {
        
        ImageIcon imagen = new ImageIcon(rutaImagen);
        
        ImageIcon aux = new ImageIcon(
                
            imagen.getImage().getScaledInstance(ancho, alto, Image.SCALE_AREA_AVERAGING)
                                
        );
        
        return aux;
        
    }
    
    public static JButton crearBotonMenu(int x, int y, int ancho, int alto, String rutaImagen){
        
        JButton boton = new JButton();
        
        boton.setBounds(x, y, ancho, alto);
        
        boton.setContentAreaFilled(false);
        
        boton.setIcon(crearImagen(ancho, alto, rutaImagen));
       
        return boton;
    }
    
    public static JLabel colocarImagen(String rutaimagen1){
        
        JLabel logoEstadistica = new JLabel();
        
        logoEstadistica.setBounds(0, 5, 31, 32);
        
        logoEstadistica.setIcon(new ImageIcon(rutaimagen1));
        
        return logoEstadistica;
        
    }
    
}
