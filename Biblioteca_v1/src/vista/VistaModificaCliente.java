package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.ControladorModificaCliente;

public class VistaModificaCliente extends JFrame implements InterfazModificaCliente{
	JTextField textoDni;
	JTextField textoNome;
	JPasswordField textoContrasinal;
	JTextField textoTelefono;
	JButton eliminar;
	JButton modificar;
	public VistaModificaCliente(){
		this.setTitle("Modificar Cliente");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(5,2,0,30));
		eliminar=new JButton("Eliminar");
		eliminar.setToolTipText("eliminar o cliente co dni indicado");
		eliminar.setActionCommand("eliminar");
		modificar=new JButton("Modificar");
		modificar.setToolTipText("Se non existe crease.");
		modificar.setActionCommand("modificar");
		textoDni=new JTextField("",14);
		
		textoNome=new JTextField("",14);
		
		textoContrasinal=new JPasswordField("",14);
		
		textoTelefono=new JTextField("",14);
		
		p1.add(new JLabel("Introduce o dni:"));
		p1.add(textoDni);
		p1.add(new JLabel("Introduce o nome:"));
		p1.add(textoNome);
		p1.add(new JLabel("Introduce o contrasinal:"));
		p1.add(textoContrasinal);
		p1.add(new JLabel("Introduce o telefono:"));
		p1.add(textoTelefono);
		p1.add(eliminar);
		p1.add(modificar);
		this.add(p1);
		this.setVisible(true);
	}
	@Override
	public void setControlador(ControladorModificaCliente c) {
		eliminar.addActionListener(c);
		modificar.addActionListener(c);
		
	}
	@Override
	public String getDni() {
		return textoDni.getText();
	}
	@Override
	public String getNome() {
		return textoNome.getText();
	}
	@Override
	public String getContrasinal() {
		return new String(textoContrasinal.getPassword());
	}
	@Override
	public String getTelefono() {
		return textoTelefono.getText();
	}
}
