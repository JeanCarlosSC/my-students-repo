package Vista.principal.componentes;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JPanel;
import services.canciones;
import services.crearObjetos;
import services.recursos;

public abstract class PanelPlaylist3 extends JPanel {
    ImageIcon iPlay3, iFondoUp, iFondoDown;

    public PanelPlaylist3() {
        cargarPropiedades();
        cargarRecursos();
        cargarCanciones();
        cargarTextos();
        cargarBotones();
        cargarImagenes();
        repaint();
    }

    private void cargarRecursos() {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            UIManager.put("Button.arc", 999);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
        iPlay3 = new ImageIcon("img/130playlist3.jpg");
        iFondoUp = new ImageIcon("img/bgarribaplay1.png");
        iFondoDown = new ImageIcon("img/bgabajoplay1.png");
        
        
    }

    private void cargarPropiedades() {
        setLayout(null);
        setBounds(420, 10, 940, 600);
        setBackground(new Color(17, 18, 19));
    }
    
    private void cargarTextos() {
        JLabel txtPlay1 = crearObjetos.crearTexto("Playlist #3", 180, 100, 500, 90, Color.white, recursos.fuente3);
        add(txtPlay1);
        
        JLabel txtCanciones = crearObjetos.crearTexto("10 Canciones", 180, 
                150, 500, 90, Color.white, recursos.fuente4);
        add(txtCanciones);
    }
    
    private void cargarImagenes(){
        JLabel lblPlay1 = new JLabel();
        lblPlay1.setIcon(iPlay3);
        lblPlay1.setBounds(15, 80, 130, 130);
        add(lblPlay1);
        
        JLabel lblFondoUp = new JLabel();
        lblFondoUp.setIcon(iFondoUp);
        lblFondoUp.setBounds(0, 0, 960, 260);
        add(lblFondoUp);
        
        JLabel lblFondoDown = new JLabel();
        lblFondoDown.setIcon(iFondoDown);
        lblFondoDown.setBounds(0, 260, 960, 360);
        add(lblFondoDown);
    }
    
    private void cargarBotones() {
        JButton btnAtras = crearObjetos.crearBoton("<", 10, 10, 40, 40, Color.black);
        add(btnAtras);
        btnAtras.addActionListener((ActionEvent e) -> {
            salir();
        });

        JButton btnAdelante = crearObjetos.crearBoton(">", 55, 10, 40, 40, Color.black);
        add(btnAdelante);

        JButton btnPerfil = crearObjetos.crearBoton("", 880, 10, 40, 40, Color.black);
        btnPerfil.setIcon(recursos.iUsuario);
        add(btnPerfil);

        JButton btnGrupo = crearObjetos.crearBoton("", 830, 10, 40, 40, Color.black);
        btnGrupo.setIcon(recursos.iGrupo);
        add(btnGrupo);

        JButton btnNoti = crearObjetos.crearBoton("", 780, 10, 40, 40, Color.black);
        btnNoti.setIcon(recursos.iNoti);
        add(btnNoti);
        
        JButton btnPlay = crearObjetos.crearBoton("", 20, 280, 60, 60, Color.green);
        btnPlay.setIcon(recursos.iPlay);
        add(btnPlay);
        
        JButton btnShuffle = crearObjetos.crearBoton("", 100, 290, 40, 40, Color.black);
        btnShuffle.setIcon(recursos.iShuffle);
        add(btnShuffle);
    }
    
    private void cargarCanciones(){
        canciones can1 = new canciones("1","Aguita de horchata",
                "Drefquila", "Aunque esten todos mirando", "3:34", "img/cancion1.png");
        can1.setLocation(20, 350);
        add(can1);
        
        canciones can2 = new canciones("2","La cancion",
                "Bad Bunny, J Balvin", "Oasis", "3:34", "img/cancion2.png");
        can2.setLocation(20, 410);
        add(can2);
        
        canciones can3 = new canciones("3","Neverita",
                "Bad Bunny", "Un verano sin ti", "4:02", "img/cancion3.jpeg");
        can3.setLocation(20, 470);
        add(can3);
        
        canciones can4 = new canciones("4","Ley de atraccion",
                "Duki", "Temporada de regueton", "3:00", "img/cancion4.jpeg");
        can4.setLocation(20, 530);
        add(can4);
    }   
    
    public abstract void salir();

}
