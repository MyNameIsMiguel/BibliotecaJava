package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controlador.ControladorResponsable;

public class VistaResponsable extends JFrame implements InterfazResponsable{
	JButton botonEmpregado;
	JButton botonModificaEmpregado;
	public VistaResponsable(){
	this.setTitle("Elixe unha acción.");
	this.setSize(400, 200);
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(2,1,0,10));
	botonEmpregado = new JButton("Funcions de Empregado");
	botonEmpregado.setToolTipText("Accede ás funcions de empregado");
	botonEmpregado.setActionCommand("empregado");
	botonModificaEmpregado = new JButton("Modificar Empregados");
	botonModificaEmpregado.setToolTipText("Elimina ou engade Empregados");
	botonModificaEmpregado.setActionCommand("modifica");
	p1.add(botonEmpregado);
	p1.add(botonModificaEmpregado);
	
	this.add(p1);
	this.setVisible(true);
	}
	@Override
	public void setControlador(ControladorResponsable c) {
		botonEmpregado.addActionListener(c);
		botonModificaEmpregado.addActionListener(c);	
	}
}
