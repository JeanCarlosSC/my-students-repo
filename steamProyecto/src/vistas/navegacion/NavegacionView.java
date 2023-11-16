package vistas.navegacion;

import services.ObjGraficosServices;
import services.WebServices;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.Border;

public abstract class NavegacionView extends JPanel{

    JPanel pArriba, pAbajo, pSobre;
    Color colorFondo, colorPrincipal, colorVerde, colorAzul, colorAzulClaro, colorAzulPrincipal, colorGris, colorJText, colorLetraAzul;
    ImageIcon iNavegacionA,iNavegacionB, iNavegacionC, iNavegacionD, iNavegacionE,iNavegacionF, iNavegacionG;
    ImageIcon iNavegacionH, iNavegacionI, iNavegacionJ, iNavegacionK, iNavegacionL, iNavegacionM, iNavegacionN;
    Cursor cMano,cRaya;
    Border bordeBlanco, bordeAzulSecundario;
    
    public NavegacionView () {

        cargarRecursos();
        cargarPaneles();
        cargarLabels();
        cargarBotones();
        cargarFields();
        cargarPropiedades();

    }

    private void cargarRecursos() {
        
        colorFondo = new Color(28,52,84);
        colorPrincipal = new Color(25,26,32);
        colorVerde = new Color(93,127,16);
        colorAzul = new Color(25, 153, 255);
        colorAzulClaro = new Color(60,123,175);
        colorAzulPrincipal = new Color(28,68,84);
        colorGris = new Color(116, 156, 172);
        colorJText = new Color(56,100,132);
        colorLetraAzul = new Color(92,171,217);

        iNavegacionA = new ImageIcon("resources/gtaGif1.gif");
        iNavegacionB = new ImageIcon("resources/loginSteam.png");
        iNavegacionC = new ImageIcon("resources/principal.png");
        iNavegacionD = new ImageIcon("resources/principalCampana.png");
        iNavegacionE = new ImageIcon("resources/principalPregunta.png");
        iNavegacionF = new ImageIcon("resources/principalBuscar.png");
        iNavegacionG = new ImageIcon("resources/gta5.png");
        iNavegacionH = new ImageIcon("resources/gta6.png");
        iNavegacionI = new ImageIcon("resources/gta7.png");
        iNavegacionJ = new ImageIcon("resources/gta2.png");
        iNavegacionK = new ImageIcon("resources/gta3.png");
        iNavegacionL = new ImageIcon("resources/gta4.png");

        cMano = new Cursor(Cursor.HAND_CURSOR);
        cRaya = new Cursor(Cursor.TEXT_CURSOR);

        bordeBlanco = BorderFactory.createLineBorder(Color.white, 2);
        bordeAzulSecundario = BorderFactory.createLineBorder(colorFondo);
    }

    private void cargarPaneles() {

        pSobre = new JPanel();
        pSobre.setBounds(80, 152, 920, 40);
        pSobre.setBackground(colorAzulClaro);
        pSobre.setLayout(null);
        add(pSobre);

        pArriba = new JPanel();
        pArriba.setBounds(0,0,1101,104);
        pArriba.setBackground(colorPrincipal);
        pArriba.setLayout(null);
        add(pArriba);

        pAbajo = new JPanel();
        pAbajo.setBounds(0,104,1101,616);
        pAbajo.setBackground(colorFondo);
        pAbajo.setLayout(null);
        add(pAbajo);
    }

    private void cargarLabels() {

        JLabel labPrincipalIns = new JLabel();
        labPrincipalIns.setIcon(iNavegacionC);
        labPrincipalIns.setBounds(753, 11, 115, 22);
        pArriba.add(labPrincipalIns);

        JLabel labPrincipalCam = new JLabel();
        labPrincipalCam.setIcon(iNavegacionD);
        labPrincipalCam.setBounds(870, 8, 108, 26);
        pArriba.add(labPrincipalCam);

        JLabel labPrincipalPre = new JLabel();
        labPrincipalPre.setIcon(iNavegacionE);
        labPrincipalPre.setBounds(980, 8, 30, 31);
        pArriba.add(labPrincipalPre);

        JLabel lab1 = new JLabel("Grand Theft Auto V");
        lab1.setBounds(80, 137, 300, 20);
        lab1.setForeground(Color.white);
        lab1.setFont(new Font("Motiva Sans",Font.LAYOUT_LEFT_TO_RIGHT,27));
        lab1.setCursor(cRaya);
        pAbajo.add(lab1);

        JLabel lab2 = new JLabel("Todos los juegos > Acción > Grand Theft Auto V");
        lab2.setBounds(80, 110, 330, 20);
        lab2.setForeground(colorGris);
        lab2.setFont(new Font("Motiva Sans",Font.LAYOUT_LEFT_TO_RIGHT,12));
        lab2.setCursor(cRaya);
        pAbajo.add(lab2);

    }

    private void cargarBotones() {      

        JButton btn1 = ObjGraficosServices.crearBoton(0, 0, 100, 40, colorAzulClaro, Color.white);
        btn1.setText("Tu tienda");
        btn1.setHorizontalAlignment(JButton.LEFT);
        btn1.setBorderPainted(false);
        btn1.setFont(new Font("Motiva Sans",Font.BOLD,14));
        pSobre.add(btn1);

        JButton btn2 = ObjGraficosServices.crearBoton(100, 0, 172, 40, colorAzulClaro, Color.white);
        btn2.setText("Nuevo y destacable");
        btn2.setBorderPainted(false);
        btn2.setFont(new Font("Motiva Sans",Font.BOLD,14));
        pSobre.add(btn2);

        JButton btn3 = ObjGraficosServices.crearBoton(272, 0, 110, 40, colorAzulClaro, Color.white);
        btn3.setText("Categorias");
        btn3.setBorderPainted(false);
        btn3.setFont(new Font("Motiva Sans",Font.BOLD,14));
        pSobre.add(btn3);

        JButton btn4 = ObjGraficosServices.crearBoton(382, 0, 156, 40, colorAzulClaro, Color.white);
        btn4.setText("Tienda de puntos");
        btn4.setBorderPainted(false);
        btn4.setFont(new Font("Motiva Sans",Font.BOLD,14));
        pSobre.add(btn4);

        JButton btn5 = ObjGraficosServices.crearBoton(538, 0, 90, 40, colorAzulClaro, Color.white);
        btn5.setText("Noticias");
        btn5.setBorderPainted(false);
        btn5.setFont(new Font("Motiva Sans",Font.BOLD,14));
        pSobre.add(btn5);

        JButton btn6 = ObjGraficosServices.crearBoton(628, 0, 124, 40, colorAzulClaro, Color.white);
        btn6.setText("Laboratorios");
        btn6.setBorderPainted(false);
        btn6.setFont(new Font("Motiva Sans",Font.BOLD,14));
        pSobre.add(btn6);

        JButton btn7 = ObjGraficosServices.crearBoton(250, 48, 94, 20, null, Color.white);
        btn7.setText("TIENDA");
        btn7.setBorderPainted(false);
        btn7.setFont(new Font("Motiva Sans",Font.BOLD,17));
        pArriba.add(btn7);

        JButton btn8 = ObjGraficosServices.crearBoton(344, 48, 135, 20, null, Color.white);
        btn8.setText("COMUNIDAD");
        btn8.setBorderPainted(false);
        btn8.setFont(new Font("Motiva Sans",Font.BOLD,17));
        pArriba.add(btn8);

        JButton btn9 = ObjGraficosServices.crearBoton(479, 48, 113, 20, null, Color.white);
        btn9.setText("ARIASAF1");
        btn9.setBorderPainted(false);
        btn9.setFont(new Font("Motiva Sans",Font.BOLD,17));
        pArriba.add(btn9);

        JButton btn10 = ObjGraficosServices.crearBoton(592, 48, 79, 20, null, Color.white);
        btn10.setText("CHAT");
        btn10.setBorderPainted(false);
        btn10.setFont(new Font("Motiva Sans",Font.BOLD,17));
        pArriba.add(btn10);

        JButton btn11 = ObjGraficosServices.crearBoton(671, 48, 115, 20, null, Color.white);
        btn11.setText("SOPORTE");
        btn11.setBorderPainted(false);
        btn11.setFont(new Font("Motiva Sans",Font.BOLD,17));
        pArriba.add(btn11);

        JButton btn12 = ObjGraficosServices.crearBoton(860, 12, 140, 22, colorGris, Color.white);
        btn12.setText("LISTA DE DESEADOS");
        btn12.setBorderPainted(false);
        btn12.setFont(new Font("Arial",Font.LAYOUT_NO_START_CONTEXT,10));
        pAbajo.add(btn12);

        JButton btn13 = ObjGraficosServices.crearBoton(827, 130, 173, 32, colorJText, colorLetraAzul);
        btn13.setText("Punto de encuentro");
        btn13.setBorderPainted(false);
        btn13.setFont(new Font("Arial",Font.LAYOUT_NO_START_CONTEXT,16));
        pAbajo.add(btn13);

        JButton btnGtaGif = ObjGraficosServices.crearBoton(80, 177, 600, 335, colorAzulClaro, colorAzul);
        btnGtaGif.setIcon(iNavegacionA);
        btnGtaGif.setBorderPainted(false);
        pAbajo.add(btnGtaGif);

        JButton btnGta1 = ObjGraficosServices.crearBoton(695, 177, 305, 414, colorAzulClaro, colorAzul);
        btnGta1.setIcon(iNavegacionG);
        btnGta1.setBorderPainted(false);
        pAbajo.add(btnGta1);

        JButton btnGta2 = ObjGraficosServices.crearBoton(83, 514, 113, 63, colorAzulClaro, colorAzul);
        btnGta2.setIcon(iNavegacionH);
        btnGta2.setBorder(bordeAzulSecundario);;
        btnGta2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnGta2.setBorder(bordeBlanco);
            }

            @Override
            public void mouseExited(MouseEvent e){
                btnGta2.setBorder(bordeAzulSecundario);
            }
        });
        pAbajo.add(btnGta2);

        JButton btnGta3 = ObjGraficosServices.crearBoton(203, 514, 113, 63, colorAzulClaro, colorAzul);
        btnGta3.setIcon(iNavegacionI);
        btnGta3.setBorder(bordeAzulSecundario);;
        btnGta3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnGta3.setBorder(bordeBlanco);
            }

            @Override
            public void mouseExited(MouseEvent e){
                btnGta3.setBorder(bordeAzulSecundario);
            }
        });
        pAbajo.add(btnGta3);

        JButton btnGta4 = ObjGraficosServices.crearBoton(323, 514, 113, 63, colorAzulClaro, colorAzul);
        btnGta4.setIcon(iNavegacionJ);
        btnGta4.setBorder(bordeAzulSecundario);;
        btnGta4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnGta4.setBorder(bordeBlanco);
            }

            @Override
            public void mouseExited(MouseEvent e){
                btnGta4.setBorder(bordeAzulSecundario);
            }
        });
        pAbajo.add(btnGta4);

        JButton btnGta5 = ObjGraficosServices.crearBoton(443, 514, 113, 63, colorAzulClaro, colorAzul);
        btnGta5.setIcon(iNavegacionK);
        btnGta5.setBorder(bordeAzulSecundario);;
        btnGta5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnGta5.setBorder(bordeBlanco);
            }

            @Override
            public void mouseExited(MouseEvent e){
                btnGta5.setBorder(bordeAzulSecundario);
            }
        });
        pAbajo.add(btnGta5);

        JButton btnGta6 = ObjGraficosServices.crearBoton(563, 514, 113, 63, colorAzulClaro, colorAzul);
        btnGta6.setIcon(iNavegacionL);
        btnGta6.setBorder(bordeAzulSecundario);;
        btnGta6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnGta6.setBorder(bordeBlanco);
            }

            @Override
            public void mouseExited(MouseEvent e){
                btnGta6.setBorder(bordeAzulSecundario);
            }
        });
        pAbajo.add(btnGta6);

        JButton btnSteam = ObjGraficosServices.crearBoton(80, 26, 175, 53, null, null);
        btnSteam.setIcon(iNavegacionB);
        btnSteam.setBorderPainted(false);
        btnSteam.addActionListener(e -> regresar());
        pArriba.add(btnSteam);

        JButton btnBuscar = ObjGraficosServices.crearBoton(894, 8, 24, 24, null, null);
        btnBuscar.setIcon(iNavegacionF);
        btnBuscar.setBorderPainted(false);
        pSobre.add(btnBuscar);


    }

    private void cargarFields() {

        JTextField jtxt1 = new JTextField("",SwingConstants.LEFT);
        jtxt1.setBounds(752, 8, 142, 24);
        jtxt1.setForeground(Color.white);
        jtxt1.setBackground(colorJText);
        jtxt1.setFont(new Font("Arial",Font.PLAIN,14));
        jtxt1.setBorder(null);
        pSobre.add(jtxt1);    

    }

    private void cargarPropiedades() {
        setSize(1101,720);
        setLayout(null);
    }

    public abstract void regresar();
}
