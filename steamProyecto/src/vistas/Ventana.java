package vistas;

import vistas.login.LoginView;
import vistas.navegacion.NavegacionView;
import vistas.principal.PrincipalView;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ventana extends JFrame {

    JPanel LoginView, PrincipalView, NavegacionView;

    public Ventana(){
        LoginView = new LoginView() {
            @Override
            public void entrar() {
                setContentPane(PrincipalView);
            }
        };

        PrincipalView = new PrincipalView() {
            @Override
            public void navegar() {
                setContentPane(NavegacionView);
            }
            @Override
            public void inicio() {
                setContentPane(LoginView);
            }
        };

        NavegacionView = new NavegacionView() {
            @Override
            public void regresar() {
                setContentPane(PrincipalView);
            }
        };

        LoginView.setVisible(true);
        setContentPane(LoginView);
        cargarPropiedades();
    }





    private void cargarPropiedades(){
        setSize(1101, 720); // tamaño
        setState(JFrame.MAXIMIZED_BOTH);
        setLayout(null); // layout null
        setLocationRelativeTo(null); // centrar ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // para terminar ejecución al cerrar
        setVisible(true); // hacer ventana visible
        setResizable(false);
        setTitle("Steam");
    }

}
