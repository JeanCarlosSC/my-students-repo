package vistas.login;
import services.ObjGraficosServices;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.Border;

public abstract class LoginView extends JPanel{
    JPanel pArriba, pAbajo, pCentro, pSobre;
    Color colorPrincipal, colorAzul, colorVerde, colorJText;
    Cursor cMano, cRaya;
    ImageIcon iLoginA, iLoginB, iLoginC, iLoginD;
    Border bordeBlanco, bordeAzul;

    public LoginView() {

        cargarRecursos();
        cargarPaneles();
        cargarLabels();
        cargarBotones();
        cargarFields();
        cargarCheckboxes();
        cargarPropiedades();

    }

    private void cargarRecursos() {


        colorPrincipal = new Color(25,26,32);
        colorVerde = new Color(93,127,16);
        colorAzul = new Color(25, 153, 255);
        colorJText = new Color(50, 53, 60);
        
        cMano = new Cursor(Cursor.HAND_CURSOR);
        cRaya = new Cursor(Cursor.TEXT_CURSOR);

        iLoginA = new ImageIcon("resources/loginSteam.png");
        iLoginB = new ImageIcon("resources/loginQr.png");
        iLoginC = new ImageIcon("resources/loginPrincipal.png");
        iLoginD = new ImageIcon("resources/loginIdioma.png");

        bordeBlanco = BorderFactory.createLineBorder(Color.white, 2);
        bordeAzul = BorderFactory.createLineBorder(colorAzul);

    }

    private void cargarPaneles() {
        
        pArriba = new JPanel();
        pArriba.setBounds(0,0,1101,104);
        pArriba.setBackground(colorPrincipal);
        pArriba.setLayout(null);
        add(pArriba);

        pCentro = new JPanel();
        pCentro.setBounds(168, 303, 758, 349);
        pCentro.setBackground(colorPrincipal);
        pCentro.setLayout(null);
        add(pCentro);

        pAbajo = new JPanel();
        pAbajo.setBounds(0, 104, 1101, 616);
        pAbajo.setBackground(Color.white);
        pAbajo.setLayout(null);
        add(pAbajo);

    }


    private void cargarLabels() {

        JLabel lab1 = new JLabel("Iniciar sesión");
        lab1.setBounds(186, 126, 720, 20);
        lab1.setForeground(Color.white);
        lab1.setFont(new Font("Motiva Sans",Font.BOLD,28));
        lab1.setCursor(cRaya);
        pAbajo.add(lab1);

        JLabel lab2 = new JLabel("INICIA SESIÓN CON EL NOMBRE DE LA CUENTA",SwingConstants.LEFT);
        lab2.setBounds(31, 34, 320, 20);
        lab2.setForeground(new Color(25,153,255));
        lab2.setFont(new Font("Motiva Sans",Font.BOLD,13));
        lab2.setCursor(cRaya);
        pCentro.add(lab2);        
        
        JLabel lab3 = new JLabel("O BIEN CON UN CÓDIGO QR",SwingConstants.LEFT);
        lab3.setBounds(526, 34, 320, 20);
        lab3.setForeground(new Color(25,153,255));
        lab3.setFont(new Font("Motiva Sans",Font.BOLD,13));
        lab3.setCursor(cRaya);
        pCentro.add(lab3);   

        JLabel lab4 = new JLabel("CONTRASEÑA",SwingConstants.LEFT);
        lab4.setBounds(31, 116, 320, 20);
        lab4.setForeground(Color.white);
        lab4.setFont(new Font("Motiva Sans",Font.PLAIN,13));
        lab4.setCursor(cRaya);
        pCentro.add(lab4);    

        JLabel lab5 = new JLabel("<html>Usa la aplicación Steam Mobile<p>para iniciar sesión con un codigo QR</html>",SwingConstants.CENTER);
        lab5.setBounds(526, 276, 180, 25);
        lab5.setForeground(Color.white);
        lab5.setFont(new Font("Motiva Sans",Font.PLAIN,10));
        lab5.setCursor(cMano);
        pCentro.add(lab5);       

        JLabel lab6 = new JLabel("Ayuda, no puedo iniciar sesión",SwingConstants.CENTER);
        lab6.setBounds(170, 308, 180, 20);
        lab6.setForeground(Color.white);
        lab6.setFont(new Font("Motiva Sans",Font.BOLD,10));
        lab6.setCursor(cMano);
        pCentro.add(lab6);  

        JLabel labPrincipal = new JLabel();
        labPrincipal.setIcon(iLoginC);
        labPrincipal.setBounds(0, 0, 1101, 616);
        labPrincipal.setOpaque(false);
        labPrincipal.setBackground(new Color(0,0,0,0));
        pAbajo.add(labPrincipal);

        JLabel labLoginSteam = new JLabel();
        labLoginSteam.setIcon(iLoginA);
        labLoginSteam.setBounds(80, 26, 175, 53);
        pArriba.add(labLoginSteam);

        JLabel labLoginQr = new JLabel();
        labLoginQr.setIcon(iLoginB);
        labLoginQr.setBounds(518, 68, 200, 199);
        pCentro.add(labLoginQr);

    }

    private void cargarBotones() {
        
        JButton btn1 = new JButton("Instalar Steam");
        btn1.setBounds(760, 5, 105, 20);
        btn1.setForeground(Color.white);
        btn1.setOpaque(true);
        btn1.setBackground(colorVerde);
        btn1.setFont(new Font("Motiva Sans",Font.BOLD,10));
        btn1.setBorderPainted(false);
        pArriba.add(btn1);

        JButton btn2 = new JButton("Iniciar sesión");
        btn2.setBounds(860, 5, 105, 20);
        btn2.setForeground(Color.white);
        btn2.setOpaque(false);
        btn2.setBackground(new Color (0,0,0,0));
        btn2.setFont(new Font("Motiva Sans",Font.BOLD,10));
        btn2.setBorderPainted(false);
        pArriba.add(btn2);

        JButton btn3 = ObjGraficosServices.crearBoton(250, 48, 94, 20, null, Color.white);
        btn3.setText("TIENDA");
        btn3.setFont(new Font("Motiva Sans",Font.BOLD,17));
        btn3.setBorderPainted(false);
        pArriba.add(btn3);

        JButton btn4 = ObjGraficosServices.crearBoton(344, 48, 135, 20, null, Color.white);
        btn4.setText("COMUNIDAD");
        btn4.setFont(new Font("Motiva Sans",Font.BOLD,17));
        btn4.setBorderPainted(false);
        pArriba.add(btn4);

        JButton btn5 = ObjGraficosServices.crearBoton(479, 48, 131, 20, null, Color.white);
        btn5.setText("ACERCA DE");
        btn5.setFont(new Font("Motiva Sans",Font.BOLD,17));
        btn5.setBorderPainted(false);
        pArriba.add(btn5);

        JButton btn6 = ObjGraficosServices.crearBoton(613, 48, 115, 20, null, Color.white);
        btn6.setText("SOPORTE");
        btn6.setFont(new Font("Motiva Sans",Font.BOLD,17));
        btn6.setBorderPainted(false);
        pArriba.add(btn6);

        JButton btn7 = ObjGraficosServices.crearBoton(125, 224, 270, 40, colorAzul, Color.white);
        btn7.setText("INICIAR SESION");
        btn7.setFont(new Font("Motiva Sans",Font.BOLD,16));
        btn7.setBorder(bordeAzul);
        btn7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e){
                btn7.setBorder(bordeBlanco);
            }

            @Override
            public void mouseExited(MouseEvent e){
                btn7.setBorder(bordeAzul);
            }
        });
        pCentro.add(btn7);
        btn7.addActionListener(e -> entrar());

        JButton btn8 = ObjGraficosServices.crearBoton(965,5,76,20, colorAzul, Color.white);
        btn8.setIcon(iLoginD);
        btn8.setBorderPainted(false);
        pArriba.add(btn8);

    }

    private void cargarFields() {

        JTextField jtxt1 = new JTextField("",SwingConstants.LEFT);
        jtxt1.setBounds(31, 58, 456, 44);
        jtxt1.setForeground(Color.white);
        jtxt1.setBackground(colorJText);
        jtxt1.setFont(new Font("Arial",Font.PLAIN,14));
        jtxt1.setBorder(null);
        pCentro.add(jtxt1);    
        
        JTextField jtxt2 = new JTextField("",SwingConstants.LEFT);
        jtxt2.setBounds(31, 140, 456, 44);
        jtxt2.setForeground(Color.white);
        jtxt2.setBackground(colorJText);
        jtxt2.setFont(new Font("Arial",Font.PLAIN,14));
        jtxt2.setBorder(null);
        pCentro.add(jtxt2);     
        

    }

    private void cargarCheckboxes() {

        JCheckBox check1 = new JCheckBox("Recordarme");
        check1.setBounds(31, 184, 100, 44);
        check1.setForeground(Color.white);
        check1.setOpaque(false);
        check1.setBackground(new Color (0,0,0,0));
        check1.setFont(new Font("Arial",Font.PLAIN,14));
        check1.setBorder(null);
        check1.setCursor(cMano);
        pCentro.add(check1);   
    }

    private void cargarPropiedades() {
        setSize(1101,720);
        setLayout(null);
    }

    public abstract void entrar();
    

}
