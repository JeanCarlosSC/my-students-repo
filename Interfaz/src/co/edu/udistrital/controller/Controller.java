package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import co.edu.udistrital.view.VistaPrincipal;
import co.edu.udistrital.view.login;

public class Controller implements ActionListener{
	
	
		private VistaPrincipal ventana;
		private login Ventana2;
		
		public Controller () {
			//ventana = new VistaPrincipal();
			Ventana2 = new login();
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
	
}
