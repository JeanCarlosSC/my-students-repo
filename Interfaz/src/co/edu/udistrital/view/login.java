package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.border.Border;

public class login extends JFrame{
	
	 
	 Font fuenteTituloPrincipal = new Font("Tahoma", Font.PLAIN, 28);
	 Font fuenteTitulo = new Font("Calibri (Body)", Font.BOLD, 12);
	 Cursor cMano = new Cursor(Cursor.HAND_CURSOR);
	 Color colorContinuar = new Color(255,216,20,255);
	 Color colorfondo = new Color(252,252,252,255);
	 Color colorBarra = new Color(0,113,133,255);
	 Color colorpanel = new Color(221,221,221,255);
	 Color colorLetra = new Color(0,125,209,255);


	 Border borde = BorderFactory.createLineBorder(Color.black,2,true);
	 Border borde2 = BorderFactory.createLineBorder(colorpanel,2,true);
	 Border borde3 = BorderFactory.createLineBorder(colorBarra,2,true);
	
	public login() {
		
	setTitle("Proyecto Interfaz Amazon ");	
	setSize(1280, 720);  // tamaño
    setLayout(null);// layout null
    getContentPane().setBackground(Color.WHITE);
    setLocationRelativeTo(null); // centrar ventana
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar ejecución al cerrar
    setVisible(true); // hacer ventana visible
    
    inicializarComponentes();
    
    setResizable(false);
	setLocationRelativeTo(null);
	setVisible(true);
	
	
	}
	
	public void inicializarComponentes() {
	        
	        JPanel pAlto = new JPanel();
	        pAlto.setBounds(385, 70, 490, 350);
	        pAlto.setBackground(Color.white);
	        pAlto.setLayout(null);
	        pAlto.setBorder(borde2);
	        add(pAlto);
	        
	        JLabel  IniSesion = new JLabel("Iniciar sesión");
	        IniSesion.setBounds( 50, 0, 300,100);
	        IniSesion.setBackground(Color.BLACK);
	        IniSesion.setFont(fuenteTituloPrincipal);
	        IniSesion.setLayout(null);
	        
	        pAlto.add(IniSesion);
	        
	        JLabel  Ingreso = new JLabel("Número de celular o correo electrónico");
	        Ingreso.setBounds( 50, 50, 320,100);
	        Ingreso.setBackground(Color.BLACK);
	        Ingreso.setFont(fuenteTitulo);
	        Ingreso.setLayout(null);
	        pAlto.add(Ingreso);
	        
	        JPasswordField tdatos = new JPasswordField("");
	        tdatos.setBounds(50, 110, 360 , 30);
	        tdatos.setForeground(colorBarra);
	        tdatos.setBackground(Color.WHITE);
	        tdatos.setCaretColor(Color.BLUE); // Color de la línea que parpadea
	        tdatos.setHorizontalAlignment(JTextField.HEIGHT);
	        tdatos.setBorder(borde3);
	        tdatos.addActionListener(new ActionListener() {
	        	
	        	public void actionPerformed(ActionEvent e) {
					
	        		String contraseña = new String(tdatos.getPassword());
	        		
	        			if (contraseña.equals("12345")) {
	        				
	        				setContentPane(new VistaPrincipal());
	    					repaint();
	        			}
	        		
				}
	        });
	        pAlto.add(tdatos);
	        
	        JButton bContinuar = new JButton("Continuar");
	        bContinuar.setBounds(50,150, 360, 30);
	        bContinuar.setFocusable(false);
	        bContinuar.setFont(fuenteTitulo);
	        bContinuar.setBackground(colorContinuar);
	        bContinuar.setForeground(Color.white);
	        bContinuar.setBorder(null);
	        bContinuar.setCursor(cMano);
	        bContinuar.addActionListener(new ActionListener(){
	        	
				@Override
				public void actionPerformed(ActionEvent e) {
					
					setContentPane(new VistaPrincipal());
					repaint();
					
				}	
	        	
	        });
	        pAlto.add(bContinuar);
	        
	        JLabel  aceptar = new JLabel("Al continuar, aceptas las");
	        aceptar.setBounds( 50, 200,140,30);
	        aceptar.setBackground(Color.BLACK);
	        aceptar.setFont(fuenteTitulo);
	        aceptar.setLayout(null);
	        pAlto.add(aceptar);
	        
	        JButton baceptar = new JButton("condiciones de uso");
	        baceptar.setBounds(190,200,130,30);
	        baceptar.setFocusable(false);
	        baceptar.setFont(fuenteTitulo);
	        baceptar.setBackground(Color.white);
	        baceptar.setForeground(colorLetra);
	        baceptar.setBorder(null);
	        baceptar.setCursor(cMano);
	        pAlto.add(baceptar);
	        
	        JLabel  aceptar1 = new JLabel("y el");
	        aceptar1.setBounds( 320, 200,30,30);
	        aceptar1.setBackground(Color.BLACK);
	        aceptar1.setFont(fuenteTitulo);
	        aceptar1.setLayout(null);
	        pAlto.add(aceptar1);
	        
	        JButton baceptar1 = new JButton("Aviso");
	        baceptar1.setBounds(340,200,50,30);
	        baceptar1.setFocusable(false);
	        baceptar1.setFont(fuenteTitulo);
	        baceptar1.setBackground(Color.white);
	        baceptar1.setForeground(colorLetra);
	        baceptar1.setBorder(null);
	        baceptar1.setCursor(cMano);
	        pAlto.add(baceptar1);
	        
	        JButton baceptar2 = new JButton("de privacidad");
	        baceptar2.setBounds(40,225,100,30);
	        baceptar2.setFocusable(false);
	        baceptar2.setFont(fuenteTitulo);
	        baceptar2.setBackground(Color.white);
	        baceptar2.setForeground(colorLetra);
	        baceptar2.setBorder(null);
	        baceptar2.setCursor(cMano);
	        pAlto.add(baceptar2);
	        
	        JLabel  aceptar2 = new JLabel("de Amazon");
	        aceptar2.setBounds( 140,225,70,30);
	        aceptar2.setBackground(Color.BLACK);
	        aceptar2.setFont(fuenteTitulo);
	        aceptar2.setLayout(null);
	        pAlto.add(aceptar2);
	        
	        JButton bNeseAyuda = new JButton("¿Necesitas ayuda?");
	        bNeseAyuda.setBounds(30,270,150, 50);
	        bNeseAyuda.setFocusable(false);
	        bNeseAyuda.setFont(fuenteTitulo);
	        bNeseAyuda.setBackground(Color.white);
	        bNeseAyuda.setForeground(colorLetra);
	        bNeseAyuda.setBorder(null);
	        bNeseAyuda.setCursor(cMano);
	        pAlto.add(bNeseAyuda);
	        
	        JPanel pMedio = new JPanel();
	        pMedio.setBounds(320, 0, 650, 550);
	        pMedio.setBackground(Color.white);
	        pMedio.setLayout(null);
	        add(pMedio);
	        
	        
	        JLabel  Nuevo = new JLabel("----------------------------------------------¿Eres nuevo en Amazon?---------------------------------------");
	        Nuevo.setBounds( 70, 395, 490,100);
	        Nuevo.setBackground(Color.BLACK);
	        Nuevo.setFont(fuenteTitulo);
	        Nuevo.setLayout(null);
	        pMedio.add(Nuevo);
	        
	        JButton bCrear = new JButton("Crea tu cuenta de Amazon");
	        bCrear.setBounds(70,500,490, 30);
	        bCrear.setFocusable(false);
	        bCrear.setFont(fuenteTitulo);
	        bCrear.setBackground(Color.white);
	        bCrear.setForeground(Color.black);
	        bCrear.setBorder(borde);
	        bCrear.setCursor(cMano);
	        pMedio.add(bCrear);
	        
	        
	        ImageIcon logo = new ImageIcon("src\\imagenes\\logo amazon2.png");
	        ImageIcon logoEscalado = new ImageIcon(logo.getImage().getScaledInstance(189, 50,Image.SCALE_AREA_AVERAGING));
	        JLabel lLogo = new JLabel (logoEscalado);
	        lLogo.setBounds(220,0, 189, 50);
	        pMedio.add(lLogo);
	        
	      
	        

	        
	        JPanel pBajo = new JPanel();
	        pBajo.setBounds(335, 550, 650, 750);
	        pBajo.setBackground(colorfondo);
	        pBajo.setLayout(null);
	        add(pBajo);
	        
	        JButton bCondiciones = new JButton("Condiciones de uso");
	        bCondiciones.setBounds(100,0,120, 50);
	        bCondiciones.setFocusable(false);
	        bCondiciones.setFont(fuenteTitulo);
	        bCondiciones.setBackground(Color.white);
	        bCondiciones.setForeground(colorLetra);
	        bCondiciones.setBorder(null);
	        bCondiciones.setCursor(cMano);
	        pBajo.add(bCondiciones);
	        
	        JButton bAvisoPri = new JButton("Aviso de Privacidad");
	        bAvisoPri.setBounds(260,0,120, 50);
	        bAvisoPri.setFocusable(false);
	        bAvisoPri.setFont(fuenteTitulo);
	        bAvisoPri.setBackground(Color.white);
	        bAvisoPri.setForeground(colorLetra);
	        bAvisoPri.setBorder(null);
	        bAvisoPri.setCursor(cMano);
	        pBajo.add(bAvisoPri);
	        
	        JButton bAyuda = new JButton("Ayuda");
	        bAyuda.setBounds(440,0,50, 50);
	        bAyuda.setFocusable(false);
	        bAyuda.setFont(fuenteTitulo);
	        bAyuda.setBackground(Color.white);
	        bAyuda.setForeground(colorLetra);
	        bAyuda.setBorder(null);
	        bAyuda.setCursor(cMano);
	        pBajo.add(bAyuda);
	        
	        JLabel  Final = new JLabel("1996-2023 Amazon.com, Inc. o sus afiliados");
	        Final.setBounds( 180, 20, 320,100);
	        Final.setBackground(Color.BLACK);
	        Final.setFont(fuenteTitulo);
	        Final.setLayout(null);
	        pBajo.add(Final);
	      	        
	        


	}
	

	

}
