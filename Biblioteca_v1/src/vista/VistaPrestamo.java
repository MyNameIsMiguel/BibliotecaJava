package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.ControladorPrestamo;

public class VistaPrestamo extends JFrame implements InterfazPrestamo{
	JTextField textoDni;
	JTextField textoIsbn;
	JTextField textoFechaInicio;
	JTextField textoFechaEntrega;
	JButton eliminar;
	JButton modificar;
	public VistaPrestamo(){
		this.setTitle("Modificar Prestamos");
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(5,2,0,30));
		eliminar=new JButton("Eliminar");
		eliminar.setToolTipText("eliminar o prestamo co dni e ISBN indicados");
		modificar=new JButton("Modificar");
		modificar.setToolTipText("Se non existe crease.");
		
		textoDni=new JTextField("",14);
		
		textoIsbn=new JTextField("",14);
		
		textoFechaInicio=new JPasswordField("",14);
		
		textoFechaEntrega=new JTextField("",14);
		
		p1.add(new JLabel("DNI do lector:"));
		p1.add(textoDni);
		p1.add(new JLabel("ISBN do libro:"));
		p1.add(textoIsbn);
		p1.add(new JLabel("fecha de inicio(AAAA-MM-DD):"));
		p1.add(textoFechaInicio);
		p1.add(new JLabel("fecha na cal se devolveu o libro(AAAA-MM-DD):"));
		p1.add(textoFechaEntrega);
		p1.add(eliminar);
		p1.add(modificar);
		this.add(p1);
		this.setVisible(true);
	}
	@Override
	public void setControlador(ControladorPrestamo c) {
		eliminar.addActionListener(c);
		modificar.addActionListener(c);
		
	}
	@Override
	public String getDni() {
		return textoDni.getText();
	}
	@Override
	public String getIsbn() {
		return textoIsbn.getText();
	}
	@Override
	public String getFechaInicio() {
		return textoFechaInicio.getText();
	}
	@Override
	public String getFechaEntrega() {
		return textoFechaEntrega.getText();
	}
}
