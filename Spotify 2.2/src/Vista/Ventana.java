package Vista;
import Vista.principal.VistaPrincipal;
import Vista.principal.componentes.PanelPlaylist1;
import Vista.principal.componentes.PanelPlaylist2;
import Vista.principal.componentes.PanelPlaylist3;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ventana extends JFrame{
    private VistaPrincipal Principal;
    private JPanel Playlist1, Playlist2, Playlist3;
    
    public Ventana() {
        Principal = new VistaPrincipal(this);
        
        Playlist1 = new PanelPlaylist1() {
            @Override
            public void salir() {
                setContentPane(Principal);
            }

            @Override
            public void cambioCan(int abajo) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        Playlist2 = new PanelPlaylist2() {
            @Override
            public void salir() {
                setContentPane(Principal);
            }
        };
        Playlist3 = new PanelPlaylist3() {
            @Override
            public void salir() {
                setContentPane(Principal);
            }
        };
        setContentPane(Principal);
        CargarPropiedades();
        cargarRecursos();
    }
    
    private void CargarPropiedades(){
        setSize(1270, 720); //Tamaño de la ventana
        setLocationRelativeTo(null); //Centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerrar la ventana con la x
        getContentPane().setBackground(Color.BLACK); //Color del panel de la ventana
        setTitle("Spotify 2");//Titulo
        setLayout(null);
        setExtendedState(6);
        setVisible(true); //Visivilidad de la ventana
    }
    
    private void cargarRecursos() {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }       
    }
}
