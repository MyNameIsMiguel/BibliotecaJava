package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controlador.ControladorEmpleado;

public class VistaEmpleado extends JFrame implements InterfazEmpleado{
	JButton modificarCliente;
	JButton modificarPrestamo;
	JButton modificarLibro;
	JButton consultar;
	String dni;
	public VistaEmpleado(){
		this.setTitle("Elixe unha acción.");
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(4,1,0,10));
		modificarCliente = new JButton("Modificar Cliente");
		modificarCliente.setToolTipText("Modifica un cliente usando o dni");
		modificarCliente.setActionCommand("cliente");
		modificarPrestamo = new JButton("Modificar Prestamo");
		modificarPrestamo.setToolTipText("Crea ou modifica un prestamo");
		modificarPrestamo.setActionCommand("prestamo");
		modificarLibro = new JButton("Modificar Libro");
		modificarLibro.setToolTipText("Modifica ou elimina un libro");
		modificarLibro.setActionCommand("libro");
		consultar = new JButton("Consultar prestamos/libros");
		consultar.setToolTipText("Consulta Prestamos e libros");
		consultar.setActionCommand("consulta");
		p1.add(modificarCliente);
		p1.add(modificarPrestamo);
		p1.add(modificarLibro);
		p1.add(consultar);
		this.add(p1);
		this.dni=null;
		this.setVisible(true);
	}
	public void setControlador(ControladorEmpleado c) {
		modificarCliente.addActionListener(c);
		modificarPrestamo.addActionListener(c);
		modificarLibro.addActionListener(c);
		consultar.addActionListener(c);
	}
}
