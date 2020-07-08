package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controlador.ControladorConsulta;

public class VistaConsulta extends JFrame implements InterfazConsulta{
	JButton consultaLibros;
	JButton consultaPrestamos;
	JTextArea areaTexto;
	JComboBox ordenar;
	String dni="";
	public VistaConsulta(String dni){
		this.dni=dni;
		this.setTitle("Consultar Prestamos/Libros");
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		p2.setLayout(new BorderLayout());
		p1.setLayout(new GridLayout(2,2,0,10));
		consultaLibros=new JButton("Consultar libros");
		consultaLibros.setToolTipText("Consulta os libros dispoñibles na biblioteca");
		consultaLibros.setActionCommand("libros");
		
		consultaPrestamos=new JButton("Consultar Prestamos");
		consultaPrestamos.setToolTipText("Consulta os prestamos da biblioteca");
		consultaPrestamos.setActionCommand("prestamos");
		
		ordenar=new JComboBox();
		ordenar.addItem("ISBN");
		ordenar.addItem("Autor");
		ordenar.addItem("Titulo");
		
		p1.add(consultaLibros);
		p1.add(ordenar);
		p1.add(consultaPrestamos);
		
		
		areaTexto=new JTextArea();
		JScrollPane jScrollPane=new JScrollPane(areaTexto);
		areaTexto.setEditable(false);
		
		this.add(p1,BorderLayout.NORTH);
		this.add(jScrollPane);
		this.setVisible(true);
	}
	@Override
	public void setTexto(String texto) {
		areaTexto.append(texto);
		
	}
	@Override
	public void borraTexto() {
		areaTexto.setText("");
		
	}
	@Override
	public void setControlador(ControladorConsulta c) {
		consultaLibros.addActionListener(c);
		consultaPrestamos.addActionListener(c);
		
	}
	@Override
	public String ordenadoPor() {
		
		return ordenar.getSelectedItem().toString();
	}
	@Override
	public String getDni() {
		
		return dni;
	}
}
