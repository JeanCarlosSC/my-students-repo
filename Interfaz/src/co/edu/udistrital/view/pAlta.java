package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class pAlta extends JPanel{
	
	Cursor cMano = new Cursor(Cursor.HAND_CURSOR);
	Font fuenteTituloPrincipal = new Font("Tahoma", Font.PLAIN, 15);
	
    Font fuenteTitulo = new Font("Calibri (Body)", Font.BOLD, 12);
	Color colorventana = new Color(221,240,89,255);
	Color colorventana1 = new Color(35,47,62,255);
	Color colorventana2 = new Color(19,25,33,255);
	Color colorventana3 = new Color(254,189,105,255);
	ImageIcon logoAma = new ImageIcon("src\\imagenes\\logoAma.PNG");
	ImageIcon enviar2 = new ImageIcon("src\\imagenes\\envio a2.PNG");
	ImageIcon carrito = new ImageIcon("src\\imagenes\\carrito.PNG");
	ImageIcon devolucion = new ImageIcon("src\\imagenes\\devoluciones.PNG");
	ImageIcon identificate = new ImageIcon("src\\imagenes\\identificate.PNG");
	ImageIcon Es = new ImageIcon("src\\imagenes\\ES.PNG");
	ImageIcon buscar2 = new ImageIcon("src\\imagenes\\Buscar.PNG");
	

	public pAlta() {
		
		setLayout(null);
		setBackground(colorventana2);
        inicializarComponentes();
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		// BOTON AMAZON 
        JButton bTitulo = new JButton();
        bTitulo.setBounds(10,5, 100, 50);
        bTitulo.setFocusable(false);
        bTitulo.setFont(fuenteTituloPrincipal);
        bTitulo.setBackground(colorventana2);
        bTitulo.setForeground(Color.white);
        bTitulo.setBorder(null);
        bTitulo.setIcon(logoAma);
        bTitulo.setCursor(cMano);
        add(bTitulo);
        
        
        // BOTON ENVIAR
        JButton benviar = new JButton();
        benviar.setBounds(130,0, 130, 50);
        benviar.setFocusable(false);
        benviar.setFont(fuenteTitulo);
        benviar.setBackground(colorventana2);
        benviar.setForeground(Color.white);
        benviar.setBorder(null);
        benviar.setIcon(enviar2);
        benviar.setCursor(cMano);
        add(benviar);
        
        // BARRA DE TEXTO
        
        JTextField tNombreUsuario = new JTextField("Buscar amazon");
        tNombreUsuario.setBounds(370, 10, 390 , 30);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE); // Color de la línea que parpadea
        tNombreUsuario.setHorizontalAlignment(JTextField.HEIGHT);
        add(tNombreUsuario);
        
        //LISTA DE BUSQUEDA
        JComboBox<String> buscar = new JComboBox<>();
        buscar.addItem("Todos los departamentos");
        buscar.addItem("Arte y artesanias");
        buscar.addItem("Automotriz");
        buscar.addItem("Bebé");
        buscar.addItem("Belleza y cuidado personal");
        buscar.addItem("Cine y TV ");
        buscar.addItem("Computadoras");
        buscar.addItem("Deportes y actividades al aire libre ");
        buscar.addItem("Electronicos");
        buscar.addItem("Equipaje");
        buscar.addItem("Herramientas y mejoramiento del hogar");
        buscar.addItem("Automotriz");
        buscar.addItem("Hogar y cocina ");
        buscar.addItem("Industrial y cientifico");
        buscar.addItem("Insumos para mascotas");
        buscar.addItem("Juguetes y juegos");
        buscar.addItem("Libros");
        buscar.addItem("Moda de niñas");
        buscar.addItem("Moda de niños");
        buscar.addItem("Moda para hombre ");
        buscar.addItem("Moda para mujer ");
        buscar.addItem("Musica MP3");
        buscar.addItem("Musica, CD y vinilos");
        buscar.addItem("Ofertas");
        buscar.addItem("Prime video");
        buscar.addItem("Salud y productos para el hogar ");
        buscar.addItem("Software");
        buscar.addItem("Tienda Kindle");
        buscar.addItem("Videojuegos");
        
        buscar.setBounds(280, 10, 90, 30);
        add(buscar);
        
        
        
        //BOTON DE BUSCAR 
	
        JButton buscar1 = new JButton();
        buscar1.setBounds(760,10,30, 30);
        buscar1.setFocusable(false);
        buscar1.setBackground(colorventana3);
        buscar1.setForeground(Color.black);
        buscar1.setBorder(null);
        buscar1.setIcon(buscar2);
        buscar1.setCursor(cMano);
        add(buscar1);
        
        
        JButton bES = new JButton();
        bES.setBounds(810,0, 80, 50);
        bES.setFocusable(false);
        bES.setFont(fuenteTitulo);
        bES.setBackground(colorventana2);
        bES.setForeground(Color.white);
        bES.setBorder(null);
        bES.setIcon(Es);
        bES.setCursor(cMano);
        add(bES);
        
        
        JButton bidentificate = new JButton();
        bidentificate.setBounds(910,0, 130, 50);
        bidentificate.setFocusable(false);
        bidentificate.setFont(fuenteTitulo);
        bidentificate.setBackground(colorventana2);
        bidentificate.setForeground(Color.white);
        bidentificate.setBorder(null);
        bidentificate.setIcon(identificate);
        bidentificate.setCursor(cMano);
        add(bidentificate);
        
        JButton bdevolucion = new JButton();
        bdevolucion.setBounds(1030,0, 110, 50);
        bdevolucion.setFocusable(false);
        bdevolucion.setFont(fuenteTitulo);
        bdevolucion.setBackground(colorventana2);
        bdevolucion.setForeground(Color.white);
        bdevolucion.setBorder(null);
        bdevolucion.setIcon(devolucion);
        bdevolucion.setCursor(cMano);
        add(bdevolucion);
        
        
        JButton bCarrito = new JButton();
        bCarrito.setBounds(1170,5, 80, 50);
        bCarrito.setFocusable(false);
        bCarrito.setFont(fuenteTituloPrincipal);
        bCarrito.setBackground(colorventana2);
        bCarrito.setForeground(Color.white);
        bCarrito.setBorder(null);
        bCarrito.setIcon(carrito);
        bCarrito.setCursor(cMano);
        add(bCarrito);
	}
}
