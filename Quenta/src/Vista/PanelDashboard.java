/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Servicios.ServiciosObjetos;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class PanelDashboard extends JPanel {
    
    
    
    public PanelDashboard(){
        
        crearPaneles();
        
        crearLabels();
        
        componentesPanel_ResumenFinancieros();
        
    }
    
    public static JPanel TRM;
    
    public static JPanel DTF;
    
    public static JPanel SMMLV;
    
    public static JPanel SMDVL;
    
    public static JPanel UVR;
    
    public static JPanel UVT;
    
    public static JPanel ventas;
    
    public static JPanel resumenFinancieros;
    
    public static JPanel documentosIncosistentes;
      
    public void crearPaneles(){
        
        TRM = new JPanel();
        
        TRM.setLayout(null);
        
        TRM.setBackground(Color.white);
        
        DashBoard.pDerecho.add(TRM);
        
        DTF = new JPanel();
        
        DTF.setLayout(null);
        
        DTF.setBackground(Color.white);
        
        DashBoard.pDerecho.add(DTF);
        
        SMMLV = new JPanel();
        
        SMMLV.setLayout(null);
        
        SMMLV.setBackground(Color.white);
        
        DashBoard.pDerecho.add(SMMLV);
        
        SMDVL = new JPanel();
        
        SMDVL.setLayout(null);
        
        SMDVL.setBackground(Color.white);
        
        DashBoard.pDerecho.add(SMDVL);
        
        UVR = new JPanel();
        
        UVR.setLayout(null);
        
        UVR.setBackground(Color.white);
        
        DashBoard.pDerecho.add(UVR);
        
        UVT = new JPanel();
        
        UVT.setLayout(null);
        
        UVT.setBackground(Color.white);
        
        DashBoard.pDerecho.add(UVT);
        
        ventas = new JPanel();
        
        ventas.setLayout(null);
        
        ventas.setBackground(Color.white);
        
        DashBoard.pDerecho.add(ventas);
        
        resumenFinancieros = new JPanel();
        
        resumenFinancieros.setLayout(null);
        
        resumenFinancieros.setBackground(Color.white);
        
        DashBoard.pDerecho.add(resumenFinancieros);
        
        documentosIncosistentes = new JPanel();
        
        documentosIncosistentes.setLayout(null);
        
        documentosIncosistentes.setBackground(Color.white);
        
        DashBoard.pDerecho.add(documentosIncosistentes);
        
        
            
    }
    
    private void crearLabels(){
        
        JLabel estadistica1 = ServiciosObjetos.colocarImagen("src/Imagenes/logoEstadistica.png");
        
        TRM.add(estadistica1);
        
        JLabel estadistica1_label = new JLabel("TRM");
        
        estadistica1_label.setBounds(60, 15, 30,10);
        
        TRM.add(estadistica1_label);
        
        JLabel estadistica2 = ServiciosObjetos.colocarImagen("src/Imagenes/logoEstadistica.png");
        
        DTF.add(estadistica2);
        
        JLabel estadistica1_label1 = new JLabel("DTF");
        
        estadistica1_label1.setBounds(70, 15, 30,10);
        
        DTF.add(estadistica1_label1);
        
        JLabel estadistica3 = ServiciosObjetos.colocarImagen("src/Imagenes/logoEstadistica.png");
        
        SMMLV.add(estadistica3);
        
        JLabel estadistica1_label2 = new JLabel("SMMLV");
        
        estadistica1_label2.setBounds(70, 15, 50,10);
        
        SMMLV.add(estadistica1_label2);
        
        JLabel estadistica4 = ServiciosObjetos.colocarImagen("src/Imagenes/logoEstadistica.png");
        
        SMDVL.add(estadistica4);
        
        JLabel estadistica1_label3 = new JLabel("SMDLV");
        
        estadistica1_label3.setBounds(70, 15, 50,10);
        
        SMDVL.add(estadistica1_label3);
        
        JLabel estadistica5 = ServiciosObjetos.colocarImagen("src/Imagenes/logoEstadistica.png");
        
        UVR.add(estadistica5);
        
        JLabel estadistica1_label4 = new JLabel("UVR");
        
        estadistica1_label4.setBounds(70, 15, 50,10);
        
        UVR.add(estadistica1_label4);
        
        JLabel estadistica6 = ServiciosObjetos.colocarImagen("src/Imagenes/logoEstadistica.png");
        
        UVT.add(estadistica6);
        
        JLabel estadistica1_label5 = new JLabel("UVT");
        
        estadistica1_label5.setBounds(70, 15, 50,10);
        
        UVT.add(estadistica1_label5);
        
        
    }
    
    private void componentesPanel_ResumenFinancieros(){
        
        JLabel titulo = new JLabel("Resúmenes financieros");
        
        JLabel r1 = new JLabel("Cartera clientes nacionales "+"                                                                                  "+"$10,250 MM");
        
        JLabel r2 = new JLabel("Cartera clientes extranjeros "+"                                                                                  "+"$52,000 MM");
       
        r1.setBackground(new Color(242, 242, 242));
        
        r1.setOpaque(true);
        
        titulo.setBounds(20, 30, 200, 20);
        
        titulo.setFont(new Font("Arial", Font.BOLD,16 ));
        
        resumenFinancieros.addComponentListener(new ComponentAdapter() {
            
            public void componentResized(ComponentEvent e) {
                
                int ancho = getWidth();
                
                r1.setBounds(20, 60, 600, 20);
        
            }
  
        });
        
        resumenFinancieros.add(titulo);
        
        resumenFinancieros.add(r1);
    }
    
    
}
