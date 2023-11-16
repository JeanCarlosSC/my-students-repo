package services;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class crearObjetos {

    public static JLabel crearTexto(String txt, int x, int y, int ancho, int largo, Color colortxt, Font fuente){
        JLabel texto = new JLabel(txt);
        texto.setBounds(x, y, ancho, largo);
        texto.setForeground(colortxt);
        texto.setFont(fuente);
        return texto;
    }

    public static JButton crearBotonInvisible(int x, int y, int ancho, int largo){
        JButton boton = new JButton();
        boton.setBounds(x, y, ancho, largo);
        boton.setCursor(recursos.cSeleccionado);
        boton.setBorder(null);
        boton.setFocusable(false);
        boton.setContentAreaFilled(false);
        return boton;
    }

    public static JButton crearBoton(String txt, int x, int y, int ancho, int largo, Color color){
        JButton boton = new JButton(txt);
        boton.setBounds(x, y, ancho, largo);
        boton.setCursor(recursos.cSeleccionado);
        boton.setForeground(Color.white);
        boton.setBorderPainted(false);
        boton.setFocusable(false);
        boton.setFont(recursos.fuente2);
        boton.setBackground(color);
        return boton;
    }

    public static JPanel crearPlaylist(int x, int y, ImageIcon icon){
        JPanel playlist = new JPanel();
        playlist.setBounds(x, y, 390, 80);

        JLabel imagen = new JLabel();
        imagen.setIcon(icon);
        imagen.setBounds(100, 10, 50, 50);
        playlist.add(imagen);

        JLabel titulo = new JLabel();
        titulo.setBounds(100, 20, 200, 40);
        titulo.setFont(recursos.fuente2);
        titulo.setForeground(Color.white);
        playlist.add(titulo);

        JLabel num = new JLabel();
        num.setBounds(100, 60, 200, 20);
        num.setFont(recursos.fuente2);
        num.setForeground(Color.gray);
        playlist.add(num);

        return playlist;
    }
}
