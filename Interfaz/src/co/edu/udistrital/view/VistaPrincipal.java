package co.edu.udistrital.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaPrincipal extends JPanel{
	
	private pAlta panel1;
	private pMedia panel2;
	private pBajo panel3;
	private pBajo1 panel4;
	private pBajo2 panel5;
	private pBajo3 panel6;
	private pBajo4 panel7;
	private login panel8;
	
	public VistaPrincipal() {
		
		setSize(1280, 720); // tamaño
        setLayout(null); // layout null
        setVisible(true); // hacer ventana visible
		inicializarComponentes();
		
	}
	
	public void inicializarComponentes() {
		
		panel1 = new pAlta();
		panel1.setBounds(0, 0, 1280, 50);
		add(panel1);
		
		panel2 = new pMedia();
		panel2.setBounds(0, 50, 1280, 30);
		add(panel2);
		
		
		panel4 = new pBajo1();
		panel4.setBounds( 20, 300, 280, 500);
		add(panel4);
		
		
		panel5 = new pBajo2();
		panel5.setBounds( 340, 300, 280, 500);
		add(panel5);
		
		panel6 = new pBajo3();
		panel6.setBounds( 660, 300, 280, 500);
		add(panel6);
		
		panel7 = new pBajo4();
		panel7.setBounds( 980, 300, 280, 500);
		add(panel7);
		
		panel3 = new pBajo();
		panel3.setBounds(0, 80, 1280, 720);
		add(panel3);
		
		
	
		/*panel4 = new login();
		panel4.setSize(650, 750);
		getContentPane().add(panel4);
		*/
	}

	public pAlta getPanel1() {
		return panel1;
	}

	public void setPanel1(pAlta panel1) {
		this.panel1 = panel1;
	}

	public pMedia getPanel2() {
		return panel2;
	}

	public void setPanel2(pMedia panel2) {
		this.panel2 = panel2;
	}

	public pBajo getPanel3() {
		return panel3;
	}

	public void setPanel3(pBajo panel3) {
		this.panel3 = panel3;
	}

	public pBajo1 getPanel4() {
		return panel4;
	}

	public void setPanel4(pBajo1 panel4) {
		this.panel4 = panel4;
	}

	public pBajo2 getPanel5() {
		return panel5;
	}

	public void setPanel5(pBajo2 panel5) {
		this.panel5 = panel5;
	}

	public pBajo3 getPanel6() {
		return panel6;
	}

	public void setPanel6(pBajo3 panel6) {
		this.panel6 = panel6;
	}

	public pBajo4 getPanel7() {
		return panel7;
	}

	public void setPanel7(pBajo4 panel7) {
		this.panel7 = panel7;
	}

	public login getPanel8() {
		return panel8;
	}

	public void setPanel8(login panel8) {
		this.panel8 = panel8;
	}
	
	
	
	
	
		
	}


