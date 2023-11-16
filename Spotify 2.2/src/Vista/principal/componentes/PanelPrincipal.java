package Vista.principal.componentes;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import services.crearObjetos;
import services.recursos;
import services.tarjeta;

public class PanelPrincipal extends JPanel {

    
    
    public PanelPrincipal(){
        cargarPropiedades();
        cargarLabels();
        cargarTarjetas();
        cargarBotones();

    }

    private void cargarLabels() {
        JLabel lgood = new JLabel("Good Morning");
        lgood.setBounds(20, 40, 250, 50);
        lgood.setForeground(Color.white);
        lgood.setFont(recursos.fuentetitulo);
        add(lgood);

        JLabel ltry = new JLabel("Try something else");
        ltry.setBounds(20, 320, 250, 50);
        ltry.setForeground(Color.white);
        ltry.setFont(recursos.fuentetitulo);
        add(ltry);
    }

    private void cargarPropiedades() {
        setLayout(null);
        setBounds(420, 10, 940, 600);
        setBackground(new Color(17, 18, 19));
    }

    private void cargarBotones() {
        JButton btnAtras = crearObjetos.crearBoton("<", 10, 10, 40, 40, Color.black);
        add(btnAtras);

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
    }
    private void cargarTarjetas() {
        tarjeta reco1 = new tarjeta("This is Daddy Yankee", "img/Daddy.jpg","Los mejores temas de Daddy Yankee");
        reco1.setLocation(15, 85);
        add(reco1);

        tarjeta reco2 = new tarjeta("This is Bad Bunny", "img/badbunny.jpg",
                "Los mejores temas del conejo malo");
        reco2.setLocation(250, 85);
        add(reco2);

        tarjeta reco3 = new tarjeta("This is Mora", "img/mora.jpg",
                "Los mejores temas de Mora");
        reco3.setLocation(485, 85);
        add(reco3);

        tarjeta reco4 = new tarjeta("This is Ferxxo", "img/ferxxo.jpeg",
                "Los mejores temas de el Fercho");
        reco4.setLocation(720, 85);
        add(reco4);

        tarjeta mix1 = new tarjeta("Daily Mix 1", "img/mix1.png",
                "Artistas...");
        mix1.setLocation(15, 365);
        add(mix1);

        tarjeta mix2 = new tarjeta("Daily Mix 2", "img/mix2.png",
                "Artistas...");
        mix2.setLocation(250, 365);
        add(mix2);

        tarjeta mix3 = new tarjeta("Daily Mix 3", "img/mix3.png",
                "Artistas...");
        mix3.setLocation(485, 365);
        add(mix3);

        tarjeta mix4 = new tarjeta("Daily Mix 4", "img/mix4.png",
                "Artistas...");
        mix4.setLocation(720, 365);
        add(mix4);

    }
}
