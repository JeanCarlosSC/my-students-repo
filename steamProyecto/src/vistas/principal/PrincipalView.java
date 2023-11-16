package vistas.principal;

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

public abstract class PrincipalView extends JPanel {

    JPanel pArriba, pCentro, pAbajo, pSobre;
    Color colorPrincipal, colorVerde, colorAzul, colorAzulClaro, colorAzulPrincipal, colorGris, colorJText;
    ImageIcon iPrincipalA,iPrincipalB, iPrincipalC, iPrincipalD, iPrincipalE,iPrincipalF, iPrincipalG;
    ImageIcon iPrincipalH, iPrincipalI, iPrincipalJ;
    Cursor cMano,cRaya;
    Border bordeBlanco, bordeAzulPrimario;
    
    public PrincipalView() {

        cargarRecursos();
        cargarPaneles();
        cargarLabels();
        cargarBotones();
        cargarFields();
        cargarPropiedades();


 
    }

    private void cargarRecursos() {

        colorPrincipal = new Color(25,26,32);
        colorVerde = new Color(93,127,16);
        colorAzul = new Color(25, 153, 255);
        colorAzulClaro = new Color(60,123,175);
        colorAzulPrincipal = new Color(28,68,84);
        colorGris = new Color(116, 156, 172);
        colorJText = new Color(56,100,132);

        iPrincipalA = new ImageIcon("resources/god1.png");
        iPrincipalB = new ImageIcon("resources/loginSteam.png");
        iPrincipalC = new ImageIcon("resources/principal.png");
        iPrincipalD = new ImageIcon("resources/principalCampana.png");
        iPrincipalE = new ImageIcon("resources/principalPregunta.png");
        iPrincipalF = new ImageIcon("resources/principalBuscar.png");
        iPrincipalG = new ImageIcon("resources/gta1.png");
        iPrincipalH = new ImageIcon("resources/flechaIzq.png");
        iPrincipalI = new ImageIcon("resources/flechaDer.png");
        iPrincipalJ = new ImageIcon("resources/cuadroNav.png");

        cMano = new Cursor(Cursor.HAND_CURSOR);
        cRaya = new Cursor(Cursor.TEXT_CURSOR);

        bordeBlanco = BorderFactory.createLineBorder(Color.white, 2);
        bordeAzulPrimario = BorderFactory.createLineBorder(colorPrincipal);
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

        pCentro = new JPanel();
        pCentro.setBounds(0,104,1101,616);
        pCentro.setBackground(colorAzulPrincipal);
        pCentro.setLayout(null);
        add(pCentro);

    }

    private void cargarLabels() {

        JLabel lab2 = new JLabel("DESTACADOS Y RECOMENDADOS");
        lab2.setBounds(80, 140, 300, 20);
        lab2.setForeground(Color.white);
        lab2.setFont(new Font("Motiva Sans",Font.BOLD,17));
        lab2.setCursor(cRaya);
        pCentro.add(lab2);

        JLabel labPrincipalIns = new JLabel();
        labPrincipalIns.setIcon(iPrincipalC);
        labPrincipalIns.setBounds(753, 11, 115, 22);
        pArriba.add(labPrincipalIns);

        JLabel labPrincipalCam = new JLabel();
        labPrincipalCam.setIcon(iPrincipalD);
        labPrincipalCam.setBounds(870, 8, 108, 26);
        pArriba.add(labPrincipalCam);

        JLabel labPrincipalPre = new JLabel();
        labPrincipalPre.setIcon(iPrincipalE);
        labPrincipalPre.setBounds(980, 8, 30, 31);
        pArriba.add(labPrincipalPre);

    }

    private void cargarBotones() {

        JButton btnCuadroNav1 = ObjGraficosServices.crearBoton(400, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav1.setIcon(iPrincipalJ);
        btnCuadroNav1.setBorderPainted(false);
        pCentro.add(btnCuadroNav1);

        JButton btnCuadroNav2 = ObjGraficosServices.crearBoton(420, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav2.setIcon(iPrincipalJ);
        btnCuadroNav2.setBorderPainted(false);
        pCentro.add(btnCuadroNav2);

        JButton btnCuadroNav3 = ObjGraficosServices.crearBoton(440, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav3.setIcon(iPrincipalJ);
        btnCuadroNav3.setBorderPainted(false);
        pCentro.add(btnCuadroNav3);

        JButton btnCuadroNav4 = ObjGraficosServices.crearBoton(460, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav4.setIcon(iPrincipalJ);
        btnCuadroNav4.setBorderPainted(false);
        pCentro.add(btnCuadroNav4);

        JButton btnCuadroNav5 = ObjGraficosServices.crearBoton(480, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav5.setIcon(iPrincipalJ);
        btnCuadroNav5.setBorderPainted(false);
        pCentro.add(btnCuadroNav5);

        JButton btnCuadroNav6 = ObjGraficosServices.crearBoton(500, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav6.setIcon(iPrincipalJ);
        btnCuadroNav6.setBorderPainted(false);
        pCentro.add(btnCuadroNav6);

        JButton btnCuadroNav7 = ObjGraficosServices.crearBoton(520, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav7.setIcon(iPrincipalJ);
        btnCuadroNav7.setBorderPainted(false);
        pCentro.add(btnCuadroNav7);

        JButton btnCuadroNav8 = ObjGraficosServices.crearBoton(540, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav8.setIcon(iPrincipalJ);
        btnCuadroNav8.setBorderPainted(false);
        pCentro.add(btnCuadroNav8);

        JButton btnCuadroNav9 = ObjGraficosServices.crearBoton(560, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav9.setIcon(iPrincipalJ);
        btnCuadroNav9.setBorderPainted(false);
        pCentro.add(btnCuadroNav9);

        JButton btnCuadroNav10 = ObjGraficosServices.crearBoton(580, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav10.setIcon(iPrincipalJ);
        btnCuadroNav10.setBorderPainted(false);
        pCentro.add(btnCuadroNav10);

        JButton btnCuadroNav11 = ObjGraficosServices.crearBoton(600, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav11.setIcon(iPrincipalJ);
        btnCuadroNav11.setBorderPainted(false);
        pCentro.add(btnCuadroNav11);

        JButton btnCuadroNav12 = ObjGraficosServices.crearBoton(620, 535, 15, 9, colorAzulClaro, colorAzul);
        btnCuadroNav12.setIcon(iPrincipalJ);
        btnCuadroNav12.setBorderPainted(false);
        pCentro.add(btnCuadroNav12);

        JButton btnFlechaDer = ObjGraficosServices.crearBoton(1002, 300, 36, 105, colorAzulClaro, colorAzul);
        btnFlechaDer.setIcon(iPrincipalI);
        btnFlechaDer.setBorderPainted(false);
        pCentro.add(btnFlechaDer);

        JButton btnFlechaIzq = ObjGraficosServices.crearBoton(42, 300, 36, 105, colorAzulClaro, colorAzul);
        btnFlechaIzq.setIcon(iPrincipalH);
        btnFlechaIzq.setBorderPainted(false);
        pCentro.add(btnFlechaIzq);

        JButton btnGta = ObjGraficosServices.crearBoton(80, 177, 920, 346, colorAzulClaro, colorAzul);
        btnGta.setIcon(iPrincipalG);
        btnGta.addActionListener(e -> navegar());
        btnGta.setBorder(bordeAzulPrimario);
        btnGta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btnGta.setBorder(bordeBlanco);
            }

            @Override
            public void mouseExited(MouseEvent e){
                btnGta.setBorder(bordeAzulPrimario);
            }
        });
        pCentro.add(btnGta);


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
        pCentro.add(btn12);

        JButton btnBuscar = ObjGraficosServices.crearBoton(894, 8, 24, 24, null, null);
        btnBuscar.setIcon(iPrincipalF);
        btnBuscar.setBorderPainted(false);
        pSobre.add(btnBuscar);

        JButton btnSteam = ObjGraficosServices.crearBoton(80, 26, 175, 53, null, null);
        btnSteam.setIcon(iPrincipalB);
        btnSteam.setBorderPainted(false);
        btnSteam.addActionListener(e -> inicio());
        pArriba.add(btnSteam);

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

    public abstract void navegar();
    public abstract void inicio();

}
