package Vista.principal;

import Vista.principal.componentes.PanelPlaylist1;
import Vista.principal.componentes.PanelPlaylist2;
import Vista.principal.componentes.PanelPlaylist3;
import Vista.principal.componentes.PanelPrincipal;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;
import services.crearObjetos;
import services.playlists;
import services.recursos;

public class VistaPrincipal extends JPanel {

    // Constantes
    private final int PRINCIPAL = 0;
    private final int PLAYLIST_1 = 1;
    private final int PLAYLIST_2 = 2;
    private final int PLAYLIST_3 = 3;

    // Contenido
    JFrame ventana;// referencia de la ventana
    JLabel lblparteabajo, lblcan1abajo, lblcan2abajo, lblcan3abajo, lblcan4abajo;
    JPanel pPlaylists, pBotones;
    ImageIcon iCasa, iLupa, iEstante, iMas, iDerecha, iPlay1, iPlay2, iPlay3, iParteabajo
            ,AbajoCan1, AbajoCan2, AbajoCan3, AbajoCan4;

    private JPanel pPrincipal, pPlaylist1, pPlaylist2, pPlaylist3;

    private ArrayList<Integer> historial;

    public VistaPrincipal(JFrame v) {
        ventana = v; // guarda referencia

        // crea historial
        historial = new ArrayList();
        historial.add(PRINCIPAL);

        // crea interfaz
        cargarRecursos();
        cargarPaneles();
        cargarBotones();
        cargarImagenes();
        cargarTextos();
        cargarPropiedades();

        repaint(); // muestra interfaz
    }

    private void cargarRecursos() {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            UIManager.put("Button.arc", 999);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        iCasa = new ImageIcon("img/casa.png");
        iLupa = new ImageIcon("img/lupa.png");
        iEstante = new ImageIcon("img/estante.png");
        iMas = new ImageIcon("img/mas.png");
        iDerecha = new ImageIcon("img/derecha.png");
        iPlay1 = new ImageIcon("img/playlist1.jpg");
        iPlay2 = new ImageIcon("img/playlist2.jpeg");
        iPlay3 = new ImageIcon("img/playlist3.jpg");
        iParteabajo = new ImageIcon("img/parteabajo.PNG");
        AbajoCan1 = new ImageIcon("img/AguitaAbajo.PNG");
        AbajoCan2 = new ImageIcon("img/lacancionabajo.PNG");
        AbajoCan3 = new ImageIcon("img/Neveritaabajo.PNG");
        AbajoCan4 = new ImageIcon("img/Leydeatraccionabajo.PNG");
    }

    private void cargarPropiedades() {
        setLayout(null);
        setSize(1270, 720);
        setBackground(Color.BLACK);
    }

    private void cargarPaneles() {
        pBotones = new JPanel();
        pBotones.setLayout(null);
        pBotones.setBounds(10, 10, 400, 110);
        pBotones.setBackground(new Color(17, 18, 19));
        add(pBotones);

        pPlaylists = new JPanel();
        pPlaylists.setLayout(null);
        pPlaylists.setBounds(10, 130, 400, 480);
        pPlaylists.setBackground(new Color(17, 18, 19));
        add(pPlaylists);

        pPrincipal = new PanelPrincipal();
        add(pPrincipal);

        pPlaylist1 = new PanelPlaylist1() {
            @Override
            public void salir() {
                regresar();
                
            }

            @Override
            public void cambioCan(int abajo) {
                ImgAbajo(abajo);
            }
        };
        
        pPlaylist2 = new PanelPlaylist2() {
            @Override
            public void salir() {
                regresar();
            }
        };
        pPlaylist3 = new PanelPlaylist3() {
            @Override
            public void salir() {
                regresar();
            }
        };
    }

    public void cargarImagenes() {

        JLabel lblCasa = new JLabel();
        lblCasa.setIcon(iCasa);
        lblCasa.setBounds(20, 20, 24, 24);
        pBotones.add(lblCasa);

        JLabel lblLupa = new JLabel();
        lblLupa.setIcon(iLupa);
        lblLupa.setBounds(20, 65, 24, 24);
        pBotones.add(lblLupa);

        JLabel lblEstante = new JLabel();
        lblEstante.setIcon(iEstante);
        lblEstante.setBounds(15, 15, 30, 30);
        pPlaylists.add(lblEstante);

        JLabel lblMas = new JLabel();
        lblMas.setIcon(iMas);
        lblMas.setBounds(320, 22, 24, 24);
        pPlaylists.add(lblMas);

        JLabel lblDerecha = new JLabel();
        lblDerecha.setIcon(iDerecha);
        lblDerecha.setBounds(360, 22, 24, 24);
        pPlaylists.add(lblDerecha);

        lblparteabajo = new JLabel();
        lblparteabajo.setIcon(iParteabajo);
        lblparteabajo.setBounds(0, 620, 1366, 90);
        add(lblparteabajo);
        
        lblcan1abajo = new JLabel();
        lblcan1abajo.setIcon(AbajoCan1);
        lblcan1abajo.setBounds(0, 620, 1366, 90);
        
        lblcan2abajo = new JLabel();
        lblcan2abajo.setIcon(AbajoCan2);
        lblcan2abajo.setBounds(0, 620, 1366, 90);
        
        lblcan3abajo = new JLabel();
        lblcan3abajo.setIcon(AbajoCan3);
        lblcan3abajo.setBounds(0, 620, 1366, 90);
        
        lblcan4abajo = new JLabel();
        lblcan4abajo.setIcon(AbajoCan4);
        lblcan4abajo.setBounds(0, 620, 1366, 90);
    }

    private void cargarTextos() {
        //Textos en pBotones
        JLabel txtHome = crearObjetos.crearTexto("Home", 65, 25, 100, 18, Color.white, recursos.fuente1);
        pBotones.add(txtHome);

        JLabel txtSearch = crearObjetos.crearTexto("Search", 65, 70, 100, 18, Color.white, recursos.fuente1);
        pBotones.add(txtSearch);
        //Textos en pPlaylists
        JLabel txtEstante = crearObjetos.crearTexto("Your Library", 60, 22, 200, 18, Color.white, recursos.fuente1);
        pPlaylists.add(txtEstante);
    }

    private void cargarBotones() {
        JButton btnHome = crearObjetos.crearBotonInvisible(10, 10, 380, 45);
        pBotones.add(btnHome);

        JButton btnLupa = crearObjetos.crearBotonInvisible(10, 60, 380, 45);
        pBotones.add(btnLupa);

        JButton btnEstante = crearObjetos.crearBotonInvisible(10, 10, 280, 45);
        pPlaylists.add(btnEstante);

        JButton btnMas = crearObjetos.crearBotonInvisible(310, 10, 80, 45);
        pPlaylists.add(btnMas);

        JButton btnPlaylists = crearObjetos.crearBoton("Playlists", 10, 60, 100, 30, recursos.grisboton);
        pPlaylists.add(btnPlaylists);

        JButton btnInvip1 = crearObjetos.crearBotonInvisible(5, 100, 390, 80);
        pPlaylists.add(btnInvip1);
        btnInvip1.addActionListener(e -> entrarA(1));

        JButton btnInvip2 = crearObjetos.crearBotonInvisible(5, 190, 390, 80);
        pPlaylists.add(btnInvip2);
        btnInvip2.addActionListener(e -> entrarA(2));

        JButton btnInvip3 = crearObjetos.crearBotonInvisible(5, 280, 390, 80);
        pPlaylists.add(btnInvip3);
        btnInvip3.addActionListener(e -> entrarA(PLAYLIST_3));

        playlists btnPlaylist1 = new playlists("Playlist #1", iPlay1, "20 Canciones");
        btnPlaylist1.setLocation(5, 100);
        pPlaylists.add(btnPlaylist1);

        playlists btnPlaylist2 = new playlists("Playlist #2", iPlay2, "15 Canciones");
        btnPlaylist2.setLocation(5, 190);
        pPlaylists.add(btnPlaylist2);

        playlists btnPlaylist3 = new playlists("Playlist #3", iPlay3, "10 Canciones");
        btnPlaylist3.setLocation(5, 280);
        pPlaylists.add(btnPlaylist3);
    }

    public void entrarA(int codigo) {
        // remover panel activo
        remove(pPrincipal);
        remove(pPlaylist1);
        remove(pPlaylist2);
        remove(pPlaylist3);
        
        // entrar a otro panel
        switch (codigo) {
            case PRINCIPAL -> add(pPrincipal);
            case PLAYLIST_1 -> add(pPlaylist1);
            case PLAYLIST_2 -> add(pPlaylist2);
            case PLAYLIST_3 -> add(pPlaylist3);
        }
        
        ventana.repaint(); // repinta la ventana
        
        // para evitar historial con valores repetidos seguidos
        if (historial.get(historial.size() - 1) != codigo) {
            historial.add(codigo);
        }
    }

    private void regresar() {
        historial.remove(historial.size() - 1);
        switch (historial.get(historial.size() - 1)) {
            case PRINCIPAL -> entrarA(PRINCIPAL);
            case PLAYLIST_1 -> entrarA(PLAYLIST_1);
            case PLAYLIST_2 -> entrarA(PLAYLIST_2);
            case PLAYLIST_3 -> entrarA(PLAYLIST_3);
        }
    }
    
    public void ImgAbajo(int abajo){
        switch (abajo) {
            case 1: //agregar icono en vez de remplazar
                remove(lblparteabajo);
                add(lblcan1abajo);
                remove(lblcan2abajo);
                remove(lblcan3abajo);
                remove(lblcan4abajo);
                break;
            case 2:
                remove(lblparteabajo);
                remove(lblcan1abajo);
                add(lblcan2abajo);
                remove(lblcan3abajo);
                remove(lblcan4abajo);
                break;
            case 3:
                remove(lblparteabajo);
                remove(lblcan1abajo);
                remove(lblcan2abajo);
                add(lblcan3abajo);
                remove(lblcan4abajo);
                break;
            case 4:
                remove(lblparteabajo);
                remove(lblcan1abajo);
                remove(lblcan2abajo);
                remove(lblcan3abajo);
                add(lblcan4abajo);
                break;
            default:
                break;
        }
        repaint();
    }
}
