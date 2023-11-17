package Vista;

import static Aplicacion.Quenta.login;
import Servicios.ServiciosObjetos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Usuario
 */
public class DashBoard extends JPanel {

    private JPanel pMenu;

    
    public static JPanel pDerecho;
    public JScrollPane scrollPane;

    private JPanel pUsuario;

    private JLabel usuarioCerrarSesion;

    private JButton cerrarSesion;

    private PanelDashboard panelDashboard;

    public DashBoard() {
        crearRecursos();

        crearPaneles();

        panelDashboard = new PanelDashboard();

        crearBotones();

        crearLabels();

        redimensionarComponentes();

        redimensionarComponentes_pDerecho();
        
        actualizarLayout();
    }

    private void redimensionarComponentes() {
        setSize(1250, 750);
        
        login.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                actualizarLayout();
            }
        });
    }

    private void actualizarLayout() {
        int altura = getHeight();
        int ancho = getWidth();

        pDerecho.setBounds(0, 0, ancho - 80, altura);
        pDerecho.setPreferredSize(new Dimension(ancho - 80, altura+128));
        scrollPane.setBounds(80, 50, ancho - 80, altura-50);

        pMenu.setBounds(0, 0, 80, altura);

        pUsuario.setBounds(80, 0, ancho - 80, 50);

        usuarioCerrarSesion.setBounds(ancho - 420, 20, 288, 11);

        cerrarSesion.setBounds(ancho - 130, 18, 16, 16);
        repaint();
        login.repaint();
    }

    private void redimensionarComponentes_pDerecho() {

        pDerecho.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {

                int ancho1 = getWidth();

                PanelDashboard.TRM.setBounds(35, 50, (ancho1 / 7) - 17, 72);

                PanelDashboard.DTF.setBounds((ancho1 / 6) + 10, 50, (ancho1 / 7) - 17, 72);

                PanelDashboard.SMMLV.setBounds((ancho1 / 3) - 12, 50, (ancho1 / 7) - 17, 72);

                PanelDashboard.SMDVL.setBounds((ancho1 / 2) - 35, 50, (ancho1 / 7) - 17, 72);

                PanelDashboard.UVR.setBounds(((ancho1 / 6) - 15) * 4, 50, (ancho1 / 7) - 17, 72);

                PanelDashboard.UVT.setBounds(((ancho1 / 6) - 16) * 5, 50, (ancho1 / 7) - 17, 72);

                PanelDashboard.ventas.setBounds(35, 145, ancho1 - 169, 370);

                PanelDashboard.resumenFinancieros.setBounds(35, 550, (ancho1 / 2) - 110, 250);

                PanelDashboard.documentosIncosistentes.setBounds((ancho1 / 2) - 20, 550, (ancho1 / 2) - 110, 250);

            }

        });

    }

    private void crearPaneles() {

        pMenu.setLayout(null);

        pMenu.setBackground(new Color(0, 77, 146));

        pDerecho.setLayout(null);
        pDerecho.setBackground(new Color(242, 242, 242));
        
        scrollPane = new JScrollPane(pDerecho);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        pUsuario.setLayout(null);

        pUsuario.setBackground(Color.white);

        add(scrollPane);

        add(pUsuario);

        add(pMenu);

    }

    private void crearRecursos() {

        pMenu = new JPanel();

        pDerecho = new JPanel();

        pUsuario = new JPanel();

    }

    private void crearLabels() {

        JLabel dashboard = new JLabel("DashBoard");

        dashboard.setForeground(Color.WHITE);

        dashboard.setBounds(10, 95, 90, 75);

        pMenu.add(dashboard);

        JLabel iconoQenta = new JLabel();

        iconoQenta.setBounds(13, 5, 54, 64);

        iconoQenta.setIcon(new ImageIcon("src/Imagenes/logoQenta.png"));

        pMenu.add(iconoQenta);

        JLabel parametros = new JLabel("Parametros");

        parametros.setForeground(Color.white);

        parametros.setBounds(7, 175, 90, 75);

        pMenu.add(parametros);

        JLabel documentos = new JLabel("Documentos");

        documentos.setForeground(Color.white);

        documentos.setBounds(5, 255, 90, 75);

        pMenu.add(documentos);

        JLabel reportes = new JLabel("Reportes");

        reportes.setForeground(Color.white);

        reportes.setBounds(14, 335, 90, 75);

        pMenu.add(reportes);

        JLabel utilidades = new JLabel("Utilidades");

        utilidades.setForeground(Color.white);

        utilidades.setBounds(12, 415, 90, 75);

        pMenu.add(utilidades);

        usuarioCerrarSesion = new JLabel("CREATIVE WEIGHT S. A. S / Juan David Perez Perez");

        pUsuario.add(usuarioCerrarSesion);

    }

    private void crearBotones() {

        JButton botonDashBoard = ServiciosObjetos.crearBotonMenu(23, 90, 32, 32, "src/Imagenes/logoDashboard.png");

        pMenu.add(botonDashBoard);

        JButton botonParametros = ServiciosObjetos.crearBotonMenu(23, 170, 32, 32, "src/Imagenes/logoParametros.png");

        pMenu.add(botonParametros);

        JButton botonDocumentos = ServiciosObjetos.crearBotonMenu(23, 250, 32, 32, "src/Imagenes/logoDocumentos.png");

        pMenu.add(botonDocumentos);

        JButton botonReportes = ServiciosObjetos.crearBotonMenu(23, 330, 32, 32, "src/Imagenes/logoReportes.png");

        pMenu.add(botonReportes);

        JButton botonUtilidades = ServiciosObjetos.crearBotonMenu(23, 410, 32, 32, "src/Imagenes/logoUtilidades.png");

        pMenu.add(botonUtilidades);

        cerrarSesion = new JButton();

        ImageIcon imagenboton = ServiciosObjetos.crearImagen(16, 16, "src/Imagenes/logoCerrarSesion.png");

        cerrarSesion.setIcon(imagenboton);

        pUsuario.add(cerrarSesion);

    }
}
