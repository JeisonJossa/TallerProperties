package Vista;

import java.awt.Color;

import javax.swing.*;
//  PANEL PARA INGRESAR CORREO
public class PanelCedula extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 623435818373587848L;
	public JLabel etiqueta;
	public JTextField campo_cedula;
	public JButton boton_a�adir, boton_eliminar, boton_modificar;
	
	public PanelCedula() {
		
		setLayout(null);
		setVisible(false);
		setBounds(5,5,320,305);
		setBackground(Color.white);
		
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		etiqueta = new JLabel("Por favor ingresa un correo electr�nico");
		campo_cedula = new JTextField();
		boton_a�adir = new JButton("A�adir");
		boton_eliminar = new JButton ("Eliminar");
		boton_modificar = new JButton("Modificar");
		
		etiqueta.setBounds(40,0,250,80);
		campo_cedula.setBounds(10,70,300,30);
		boton_a�adir.setBounds(45,110,100,30);
		boton_modificar.setBounds(180,110,100,30);
		boton_eliminar.setBounds(110,150,100,30);
		
		add(etiqueta);
		add(campo_cedula);
		add(boton_a�adir );
		add(boton_eliminar);
		add(boton_modificar);
		
	}
	
	
	
	
	
}

