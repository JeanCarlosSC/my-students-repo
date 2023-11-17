/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;

/**
 *
 * @author Usuario
 */
public class Login extends JFrame {

    private JPanel pIzquierdo;

    private JPanel pDerecho;

    private JLabel bienvenido;

    private JLabel inicioSesion;

    private JTextField txtUsuario;

    private JPasswordField txtClave;

    private JLabel recuperacionContraseña;

    private JButton jBotonIniciar;
    private ImageIcon imagen;

    public Login() {

        crearRecursos();

        crearPaneles();

        redimensionarComponentes();
        setLocationRelativeTo(null);
    }

    private void redimensionarComponentes() {

        setSize(1250, 750);

        setTitle("Qenta - Contabilidad General v5.9.9");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addComponentListener(new ComponentAdapter() {

            public void componentResized(ComponentEvent e) {

                int altura = getHeight();

                int ancho = getWidth();

// Ajustar las dimensiones y ubicación de los paneles y etiquetas
                pIzquierdo.setBounds(0, 0, ancho / 2, altura);

                crearImagenIzquierda(altura, ancho);

                pDerecho.setBounds(ancho / 2, 0, ancho / 2, altura);

                crearLabel(ancho);

                creartextField(ancho);

                crearBoton(ancho);

            }
        });

        setVisible(true);
    }

    private void crearPaneles() {

        pIzquierdo.setLayout(null);

        pDerecho.setLayout(null);

        getContentPane().add(pDerecho);

        getContentPane().add(pIzquierdo);

    }

    private void crearLabel(int ancho) {

        bienvenido.setBounds((ancho / 4) - 130, 10, 280, 200);

        inicioSesion.setBounds((ancho / 4) - 80, 50, 160, 200);

        recuperacionContraseña.setBounds((ancho / 4) - 115, 370, 230, 100);

        recuperacionContraseña.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un nuevo JFrame para la recuperación de contraseña
                JFrame recoveryFrame = new JFrame("Recuperación de Contraseña");

                recoveryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo este JFrame al salir

                recoveryFrame.setSize(400, 200);

                recoveryFrame.setVisible(true);

            }

        });

        pDerecho.add(recuperacionContraseña);

        pDerecho.add(bienvenido);

        pDerecho.add(inicioSesion);

    }

    private void crearRecursos() {

        //JLabel iLogo = new JLabel();
        imagen = new ImageIcon("src/Imagenes/ImagenLogin.png");

        jBotonIniciar = new JButton("Continuar");

        recuperacionContraseña = new JLabel("<html><u>¿Se te olvidó la contraseña?</u></html>");

        recuperacionContraseña.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        txtUsuario = new JTextField("Usuario(Correo electronico)");

        txtClave = new JPasswordField("Contraseña");

        pDerecho = new JPanel();

        pIzquierdo = new JPanel();

        bienvenido = new JLabel("!Bienvenido de nuevo!");

        inicioSesion = new JLabel("Inicio de sesion");

        recuperacionContraseña.setFont(new Font("Arial", Font.PLAIN, 18));

        bienvenido.setFont(new Font("Arial", Font.PLAIN, 26));

        inicioSesion.setFont(new Font("Arial", Font.PLAIN, 22));

    }

    private void creartextField(int ancho) {

        txtUsuario.setBounds((ancho / 4) - 175, 250, 350, 35);

        Border border = new MatteBorder(0, 0, 1, 0, Color.BLACK);

        Border border2 = new MatteBorder(0, 0, 1, 0, Color.BLACK);

        txtUsuario.setBorder(border);

        txtClave.setBounds((ancho / 4) - 175, 300, 350, 35);

        txtClave.setBorder(border2);

        pDerecho.add(txtUsuario);

        pDerecho.add(txtClave);

    }

    private void crearBoton(int ancho) {

        jBotonIniciar.setBounds((ancho / 4) - 175, 500, 350, 35);

        jBotonIniciar.setBackground(Color.green);
        jBotonIniciar.addActionListener(e -> cambiarADashboard());

        pDerecho.add(jBotonIniciar);

    }

    private void crearImagenIzquierda(int altura, int ancho) {

        JLabel iLogo = new JLabel();

        iLogo.setBounds(0, 0, ancho / 2, altura);

        iLogo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(ancho / 2, altura, Image.SCALE_AREA_AVERAGING)));

        pIzquierdo.add(iLogo);

    }

    private void cambiarADashboard() {
        setContentPane(new DashBoard());
        setSize(1251, 750);
        setTitle("CREATIVE WEIGHT S. A. S / Qenta - Contabilidad General v6.0.3");
        repaint();
    }

}
