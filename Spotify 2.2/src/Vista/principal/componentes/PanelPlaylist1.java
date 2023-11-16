package Vista.principal.componentes;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JPanel;
import services.Sonido;
import services.canciones;
import services.crearObjetos;
import services.recursos;

public abstract class PanelPlaylist1 extends JPanel {

    ImageIcon iPlay1, iFondoUp, iFondoDown;
    Sonido Can1, Can2, Can3, Can4;
    public int abajo;
    

    public PanelPlaylist1() {
        cargarPropiedades();
        cargarRecursos();
        cargarTextos();
        cargarBotones();
        cargarCanciones();
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
        
        iPlay1 = new ImageIcon("img/130playlist1.jpg");
        iFondoUp = new ImageIcon("img/bgarribaplay1.png");
        iFondoDown = new ImageIcon("img/bgabajoplay1.png");
        Can1 = new Sonido("img/DrefMP4.wav");
        Can2 = new Sonido("img/Lacancion.wav");
        Can3 = new Sonido("img/Neverita.wav");
        Can4 = new Sonido("img/Ley-de-atraccion.wav");
        
    }

    private void cargarPropiedades() {
        setLayout(null);
        setBounds(420, 10, 940, 600);
        setBackground(new Color(17, 18, 19));
    }
    
    private void cargarTextos() {
        JLabel txtPlay1 = crearObjetos.crearTexto("Playlist #1", 180, 
                90, 500, 90, Color.white, recursos.fuente3);
        add(txtPlay1);
        
        JLabel txtCanciones = crearObjetos.crearTexto("20 Canciones", 180, 
                150, 500, 90, Color.white, recursos.fuente4);
        add(txtCanciones);
    }
    
    private void cargarImagenes(){
        JLabel lblPlay1 = new JLabel();
        lblPlay1.setIcon(iPlay1);
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
        btnPlay.addActionListener(e -> Can1.stop());
        btnPlay.addActionListener(e -> Can2.stop());
        btnPlay.addActionListener(e -> Can3.stop());
        btnPlay.addActionListener(e -> Can4.stop());
        add(btnPlay);
        
        JButton btnShuffle = crearObjetos.crearBoton("", 100, 290, 40, 40, Color.black);
        btnShuffle.setIcon(recursos.iShuffle);
        add(btnShuffle);
        
        JButton btnCan1 = crearObjetos.crearBotonInvisible(20, 350, 835, 55);
        btnCan1.addActionListener(e -> Pcancion(1));
        add(btnCan1);
        
        JButton btnCan2 = crearObjetos.crearBotonInvisible(20, 410, 835, 55);
        btnCan2.addActionListener(e -> Pcancion(2));
        add(btnCan2);
        
        JButton btnCan3 = crearObjetos.crearBotonInvisible(20, 470, 835, 55);
        btnCan3.addActionListener(e -> Pcancion(3));
        add(btnCan3);
        
        JButton btnCan4 = crearObjetos.crearBotonInvisible(20, 530, 835, 55);
        btnCan4.addActionListener(e -> Pcancion(4));
        add(btnCan4);
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
    
    public void Pcancion(int num){
        switch (num) {
            case 1:
                Can1.play();
                Can2.stop();
                Can3.stop();
                Can4.stop();
                abajo = 1;
                break;
            case 2:
                Can1.stop();
                Can2.play();
                Can3.stop();
                Can4.stop();
                abajo = 2;
                break;
            case 3:
                Can1.stop();
                Can2.stop();
                Can3.play();
                Can4.stop();
                abajo = 3;
                break;
            case 4:
                Can1.stop();
                Can2.stop();
                Can3.stop();
                Can4.play();
                abajo = 4;
                break;
            default:
                break;
        }
        cambioCan(abajo);
    }
    public abstract void cambioCan(int abajo);
}
