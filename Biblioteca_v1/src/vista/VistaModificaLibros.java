package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.ControladorXestionLibros;

public class VistaModificaLibros extends JFrame implements InterfazModificaLibros{
	JTextField textoIsbn;
	JTextField textoTitulo;
	JTextField textoAutor;
	JButton eliminar;
	JButton engadir;
	public VistaModificaLibros(){
		this.setTitle("Modificar Libros");
		this.setSize(350, 250);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4,2,0,30));
		eliminar=new JButton("Eliminar");
		eliminar.setToolTipText("eliminar o libro co ISBN indicado");
		engadir=new JButton("Engadir");
		engadir.setToolTipText("Crear Libro");
		
		
		textoIsbn=new JTextField("",14);
		
		textoTitulo=new JPasswordField("",14);
		
		textoAutor=new JTextField("",14);
		
		p1.add(new JLabel("ISBN do libro:"));
		p1.add(textoIsbn);
		p1.add(new JLabel("Titulo:"));
		p1.add(textoTitulo);
		p1.add(new JLabel("Autor:"));
		p1.add(textoAutor);
		p1.add(eliminar);
		p1.add(engadir);
		this.add(p1);
		this.setVisible(true);
	}
	@Override
	public void setControlador(ControladorXestionLibros c) {
		eliminar.addActionListener(c);
		engadir.addActionListener(c);
		
	}
	@Override
	public String getIsbn() {
		return textoIsbn.getText();
	}
	@Override
	public String getTitulo() {
		return textoTitulo.getText();
	}
	@Override
	public String getAutor() {
		return textoAutor.getText();
	}
}
