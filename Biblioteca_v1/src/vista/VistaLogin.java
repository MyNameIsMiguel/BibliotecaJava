package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.ControladorLogin;

public class VistaLogin extends JFrame implements InterfazVistaLogin{
	JTextField textoDni;
	JPasswordField textoContrasinal;
	JButton entrar;
	JLabel correcto;
	public VistaLogin(){
		this.setTitle("Login");
		this.setSize(400, 150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(3,2,0,10));
		textoDni = new JTextField("",14);
		JLabel dni=new JLabel("DNI: ");
		textoContrasinal = new JPasswordField("",14);
		JLabel contrasinal=new JLabel("Contrasinal: ");
		entrar = new JButton("Entrar");
		entrar.setToolTipText("Logeate na biblioteca");
		correcto=new JLabel("");
		
		p1.add(dni);
		p1.add(textoDni);
		p1.add(contrasinal);
		p1.add(textoContrasinal);
		p1.add(correcto);
		p1.add(entrar);
		
		this.add(p1);
		this.setVisible(true);
	}
	public String getDNI() {
		return textoDni.getText();
	};
	public String getContrasinal() {
		return new String(textoContrasinal.getPassword());
	};
	public void setErroneo(boolean nonValido) {
		if(nonValido==true) {correcto.setText("DNI ou contrasinal erroneos.");}
	};
	public void setControlador(ControladorLogin c) {
		entrar.addActionListener(c);
	}

}
