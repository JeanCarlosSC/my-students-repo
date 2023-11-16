package services;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.Border;


public class ObjGraficosServices {
    
    public static JButton crearBoton(int x, int y, int ancho, int alto, Color cfondo, Color cletra){
        JButton boton = new JButton();
        boton.setBounds(x,y,ancho,alto);
        boton.setFocusable(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setBackground(cfondo);
        boton.setForeground(cletra);
        boton.setVisible(true);
        return boton;
    }
    
    public static JButton crearBotonI(int x, int y, int ancho, int alto,Color cfondo){
        JButton boton = new JButton();
        boton.setBounds(x,y,ancho,alto);
        boton.setBackground(cfondo);
        boton.setFocusable(false);
        boton.setBorder(null);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setVisible(true);
        return boton;
    }
    
    public static JButton crearBotonB(int x, int y, int ancho, int alto,Color cfondo,Border borde){
        JButton boton = new JButton();
        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                boton.setBorder(borde);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                boton.setBorder(null);
            }
        });
        boton.setBounds(x,y,ancho,alto);
        boton.setBackground(cfondo);
        boton.setFocusable(false);
        boton.setBorder(null);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        boton.setVisible(true);
        return boton;
    }
    
}
