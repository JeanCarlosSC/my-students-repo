package services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;

public class recursos {
    //Fuentes
    public static Font fuentetitulo = new Font("Arial", Font.BOLD, 24);
    public static Font fuente1 = new Font("Arial", Font.BOLD, 18);
    public static Font fuente2 = new Font("Arial", Font.BOLD, 14);
    public static Font fuente3 = new Font("Arial", Font.BOLD, 80);
    public static Font fuente4 = new Font("Arial", Font.PLAIN, 14);

    //Cursores
    public static Cursor cSeleccionado = new Cursor(Cursor.HAND_CURSOR);
    //Colores
    public static Color grisboton = new Color(35, 35, 35);
    //Imagenes
    public static ImageIcon iUsuario  = new ImageIcon("img/usuario.png");
    public static ImageIcon iGrupo  = new ImageIcon("img/grupo.png");
    public static ImageIcon iNoti  = new ImageIcon("img/noti.png");
    public static ImageIcon iPlay = new ImageIcon("img/play.png");
    public static ImageIcon iShuffle = new ImageIcon("img/shuffle.png");
}
